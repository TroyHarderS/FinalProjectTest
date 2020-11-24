package models;

public class ProductModel {

    private String name = "Sony PlayStation 4";
    private String type = "Ps";
    private String brand = "Sony";
    public String price = "price";

    public void setPrice(String price) {

        this.price = price;
    }

    public String getPrice() { return price; }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }


}
