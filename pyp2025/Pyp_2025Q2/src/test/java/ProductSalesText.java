/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pyp_2025q2.ProductSales;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author uwais
 */
public class ProductSalesText {
    
   private ProductSales sales;
  @BeforeEach                       // fresh object before every test
  public void setUp() {
    sales = new ProductSales();
  }

  @Test​
  public void GetSalesOverLimit_ReturnsNumberOfSales() {
    assertEquals(2, sales.GetSalesOverLimit());   // 700 and 600
  }

  @Test​
  public void GetSalesUnderLimit_ReturnsNumberOfSales() {
    assertEquals(4, sales.GetSalesUnderLimit());  // 300,150,250,200
  }
}
