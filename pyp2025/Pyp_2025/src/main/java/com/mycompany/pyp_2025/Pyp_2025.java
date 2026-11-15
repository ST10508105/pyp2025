/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pyp_2025;

/**
 *
 * @author uwais
 */
public class Pyp_2025 {

    public static void main(String[] args) {
       String[] quarters = {"Quarter 1", "Quarter 2", "Quarter 3"};
       int[][] sales = {{300, 150, 700},{250, 200, 600}};
       
       ProductSales ps = new ProductSales();
       
      System.out.println("PRODUCT SALES REPORT - 2025");
      System.out.println("--------------------------------");
      System.out.printf("%-8s", "");                                // header row​
   
      for (String q : quarters) System.out.printf("%-12s", q);
      System.out.println();

    for (int y = 0; y < sales.length; y++) {               // data rows​
      System.out.printf("%-8s", "YEAR " + (y + 1));

      for (int sale : sales[y]) System.out.printf("%-12d", sale);

      System.out.println();
    }

    System.out.println("--------------------------------");
    System.out.println("Total sales:   " + ps.TotalSales(sales));
    System.out.printf("Average sales: %.0f%n", ps.AverageSales(sales));
    System.out.println("Maximum sale:  " + ps.MaxSale(sales));
    System.out.println("Minimum sale:  " + ps.MinSale(sales));
       
    }
}
