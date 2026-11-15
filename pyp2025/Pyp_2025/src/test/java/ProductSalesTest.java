/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pyp_2025.ProductSales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductSalesTest {


  // Arrange: the supplied data, shared by both tests​

  private final int[][] data = { {300, 150, 700}, {250, 200, 600} };

  private final ProductSales ps = new ProductSales();


  @Test
  public void CalculateTotalSales_ReturnsTotalSales() {

    assertEquals(2200, ps.TotalSales(data));

  }

  @Test​

  public void AverageSales_ReturnsAverageProductSales() {

    // 3rd argument = delta, needed when comparing doubles​

    assertEquals(2200.0 / 6, ps.AverageSales(data), 0.001);

  }

}