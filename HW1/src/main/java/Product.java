import static java.lang.StringTemplate.STR;

public class Product {
  public String name;
  public double price;

  public ProductCategory productCategory;

  public Product(String name, double price, ProductCategory productCategory) {
    this.name = name;
    this.price = price;
    this.productCategory = productCategory;
  }

  @Override
  public String toString() {
    return STR."\{this.name} \{this.price} \{this.productCategory.name}";
  }
}
