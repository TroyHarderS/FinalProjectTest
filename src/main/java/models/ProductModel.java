package models;

public class ProductModel {

    private String name = "Sony PlayStation 4";
    private String type = "Ps";
    private String brand = "Sony";
    public String startPrice = "";
    public String finalPrice = "";
    public String productName = "";
    public String finalName = "";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

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
