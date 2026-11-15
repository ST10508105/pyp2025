/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyp_2025q2;

/**
 *
 * @author uwais
 */
public class ProductSales implements IProductSales {
    
  private static final int SALES_LIMIT = 500;   // retailer's limit​
  private final int[][] productSales;

  public ProductSales() {                       // rows = years​
    productSales = new int[][] { {300, 150, 700},    // Microphone, Speakers,​
                                 {250, 200, 600} };  // Mixing Desk​
  }
  @Override public int[][] GetProductSales() { return productSales; }

  @Override public int GetProductsProcessed() {
    return productSales.length;                 // years processed = 2​
  }
 
   @Override public int GetTotalSales() {
    int total = 0;
    for (int[] year : productSales)
      for (int sale : year) total += sale;
    return total;
  }

  @Override public double GetAverageSales() {
    int count = 0;
    for (int[] year : productSales) count += year.length;
    return (double) GetTotalSales() / count;
  }

  @Override public int GetSalesOverLimit() {
    int over = 0;
    for (int[] year : productSales)
      for (int sale : year) if (sale > SALES_LIMIT) over++;
    return over;                    // 700 and 600 = 2
  }
  
  @Override public int GetSalesUnderLimit() {
    int under = 0;                  // a sale of exactly 500 counts as neither
    for (int[] year : productSales)
      for (int sale : year) if (sale < SALES_LIMIT) under++;
    return under;                   // 300,150,250,200 = 4
  }
  
}
