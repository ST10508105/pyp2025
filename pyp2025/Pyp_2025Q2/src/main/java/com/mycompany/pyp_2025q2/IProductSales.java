/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyp_2025q2;

/**
 *
 * @author uwais
 */
public interface IProductSales {
  int[][] GetProductSales();
  int GetTotalSales();
  int GetSalesOverLimit();
  int GetSalesUnderLimit();
  int GetProductsProcessed();
  double GetAverageSales();
}