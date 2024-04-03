package edu.miu.cs.cs489.LABa;

import edu.miu.cs.cs489.LABa.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMgmtApp {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(3128874119l, "Banana", LocalDate.of(2023, 01,24), 124, 0.55));
        products.add(new Product(2927458265l, "Apple", LocalDate.of(2022, 12,9), 18, 1.99));
        products.add(new Product(9189927460l, "Carrot", LocalDate.of(2023, 03,31), 89, 2.99));

        printProductsJSON(products);
        printProductsXML(products);
        printProductsCSV(products);

    }


    public static void printProductsJSON(List<Product> products) {
        System.out.println("print in JSON Format");

        for (Product product : products) {
            System.out.printf("{\"productId\":%d,\"name\":\"%s\",\"dateSupplied\":\"%s\",\"quantityInStock\":%d,\"unitPrice\":%.2f}%n",
                    product.getProductId(),
                    product.getName(),
                    product.getDateSupplied(),
                    product.getQuantityInStock(),
                    product.getUnitPrice());
        }
    }

    public static void printProductsXML(List<Product> products) {

        System.out.println("-----------------------------------");
        System.out.println("print in XML Format");
        System.out.println("<?xml version= 1.0?>");
        System.out.println("<products>");
        for (Product product : products) {
            System.out.printf("  <product>");
            System.out.printf("productId: %d", product.getProductId());
            System.out.printf(", name %s ", product.getName());
            System.out.printf(", dateSupplied %s", product.getDateSupplied());
            System.out.printf(", quantityInStock %d", product.getQuantityInStock());
            System.out.printf("unitPrice %.2f", product.getUnitPrice());
            System.out.printf("  </product>");
            System.out.println();
        }
        System.out.println("</products>");

    }

    public static void printProductsCSV(List<Product> products){
        System.out.println("-----------------------------------");

        System.out.println("Print in comma separation Value(CVS) format");
        // Print CSV data
        for (Product product : products) {
            System.out.printf("%d,%s,%s,%d,%.2f\n",
                    product.getProductId(),
                    product.getName(),
                    product.getDateSupplied(),
                    product.getQuantityInStock(),
                    product.getUnitPrice());
        }

    }
}
