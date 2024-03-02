import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ShopTest {
  @Test
  public void shopTest() {
    ProductCategory category1 = new ProductCategory("fruits");
    ProductCategory category2 = new ProductCategory("vegetables");
    ProductCategory category3 = new ProductCategory("bakery");

    Product product1 = new Product("apple", 200.0, category1);
    Product product2 = new Product("tomato", 500.0, category2);
    Product product3 = new Product("bread", 100.0, category3);
    Product product4 = new Product("orange", 300.0, category1);

    Shop shop = new Shop();

    // Tests with empty shop
    assertThatThrownBy(shop::sortProductsByPrice).isInstanceOf(ArrayStoreException.class);
    assertThatThrownBy(shop::getMostExpensiveProduct).isInstanceOf(ArrayStoreException.class);

    shop.add(product1)
        .add(product2)
        .add(product3)
        .add(product4);

    // Test for contains
    assertThat(shop.productList).contains(product1, product2, product3, product3);
    System.out.println(STR."Start: \{shop.productList}");

    // Sort test
    shop.sortProductsByPrice();
    assertThat(shop.productList).containsSequence(product3, product1, product4, product2);
    System.out.println(STR."After sorting: \{shop.productList}");

    // MostExpensive test
    Product mostExpensiveProduct = shop.getMostExpensiveProduct();
    assertThat(mostExpensiveProduct).isEqualTo(product2);
    System.out.println(STR."Most expensive product: \{mostExpensiveProduct}");
  }
}
