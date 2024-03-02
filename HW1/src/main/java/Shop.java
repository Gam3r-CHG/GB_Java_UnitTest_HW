import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {

  public List<Product> productList;

  public Shop() {
    productList = new ArrayList<>();
  }

  public Shop add(Product product) {
    productList.add(product);
    return this;
  }

  public void sortProductsByPrice()  {
    if (this.productList.isEmpty()) {
      throw new ArrayStoreException("Shop is empty");
    }
    this.productList.sort(Comparator.comparingDouble(o -> o.price));
  }

  public Product getMostExpensiveProduct() {
    if (this.productList.isEmpty()) {
      throw new ArrayStoreException("Shop is empty");
    }
    return this.productList.stream().max(Comparator.comparingDouble(o -> o.price)).get();
  }
}
