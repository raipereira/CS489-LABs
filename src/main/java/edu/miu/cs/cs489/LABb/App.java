package edu.miu.cs.cs489.LABb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.*;
import edu.miu.cs.cs489.LABb.model.Employee;
import edu.miu.cs.cs489.LABb.model.PensionPlan;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) throws JsonProcessingException {

        List<Employee> employees = new ArrayList<>();
        PensionPlan p1 = new PensionPlan("EX1089",
                LocalDate.of(2023,01,17), 100.00 );

        PensionPlan p2 = new PensionPlan("SM2307",
                LocalDate.of(2019,11,04), 1555.50 );




        employees.add(new Employee(1,"Daniel", "Agar",
                LocalDate.of(2018,01,17), 100.00, p1));


        employees.add(new Employee(2,"Benard", "Shaw",
                LocalDate.of(2018,10,03), 197750.00, null));

employees.add(new Employee(3,"Carly", "Agar",
                LocalDate.of(2014,05,16), 842000.75, p2));

employees.add(new Employee(4,"Wesley", "Schneider",
                LocalDate.of(2018,11,02), 74500.00 , p2));


        App app = new App();
        System.out.println(app.getMonthlyUpcomingEnrolleesReportJSON(employees));
       // System.out.println(app.getAllEmployeesJSON(employees));
        app.printEmployee(employees);

    }

    public String getMonthlyUpcomingEnrolleesReportJSON(List<Employee> employees) throws JsonProcessingException {
        // Calculate the first and last date of the next month
        LocalDate firstDateOfNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate lastDateOfNextMonth = firstDateOfNextMonth.plusMonths(1).minusDays(1);

        // Filter employees who are NOT enrolled for Pension and who will qualify for Pension Plan enrollment
        List<Employee> upcomingEnrollees = employees.stream()
                .filter(employee -> employee.getPensionPlan() == null
                        && employee.getEmploymentDate().isBefore(lastDateOfNextMonth.plusDays(1))
                        && employee.getEmploymentDate().isAfter(firstDateOfNextMonth.minusDays(1)))
                .sorted(Comparator.comparing(Employee::getEmploymentDate))
                .collect(Collectors.toList());

        // Convert filtered employees to JSON format
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(upcomingEnrollees);
    }

    public String getAllEmployeesJSON(List<Employee> employees) throws JsonProcessingException {
        // Sort employees by Last Name ascending and Yearly Salary descending
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                        //.thenComparing(Employee::getYearlySalary).reversed())
                .collect(Collectors.toList());

        // Convert sorted employees to JSON format
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.writeValueAsString(sortedEmployees);
    }


    public void printEmployee(List<Employee> employees) {

        System.out.println(" ====== print-out the list of all the Employees in JSON format. ======");

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                //.thenComparing(Employee::getYearlySalary).reversed())
                .collect(Collectors.toList());

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        Gson gson = gsonBuilder.create();

       System.out.println("");
        for (Employee p : sortedEmployees) {

            System.out.println(gson.toJson(p));
        }
    }

    class LocalDateSerializer implements JsonSerializer<LocalDate> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        @Override
        public JsonElement serialize(LocalDate localDate, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(formatter.format(localDate));
        }
    }
}