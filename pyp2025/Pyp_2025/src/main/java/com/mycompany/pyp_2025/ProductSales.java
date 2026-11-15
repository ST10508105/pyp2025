/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyp_2025;

/**
 *
 * @author uwais
 */
public class ProductSales implements IProduct {

  @Override​

  public int TotalSales(int[][] productSales) {

    int total = 0;

    for (int[] year : productSales)                         // each row​
      for (int sale : year)                                 // each cell​

        total += sale;

    return total;
  }

  @Override​
  public double AverageSales(int[][] productSales) {

    int count = 0;

    for (int[] year : productSales) count += year.length;
    return (double) TotalSales(productSales) / count;       // cast!​

  }
  
  @Override​
  public int MaxSale(int[][] productSales) {

    int max = productSales[0][0];             // start with a real value​

    for (int[] year : productSales)
      for (int sale : year)

        if (sale > max) max = sale;

    return max;
  }

@Override​

  public int MinSale(int[][] productSales) {

    int min = productSales[0][0];           // NOT 0, or min is always 0​

    for (int[] year : productSales)
      for (int sale : year)

        if (sale < min) min = sale;
    return min;
  }

}