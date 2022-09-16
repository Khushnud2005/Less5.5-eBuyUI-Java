package uz.exemple.less55_ebuyui_java.model;

public class TodaysDealsModel {

    int image;
    String title;
    Double price;
    Double old_price;

    public TodaysDealsModel(int image, String title, Double price, Double old_price) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.old_price = old_price;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public double getOld_price() {
        return old_price;
    }
    public int getDiscount() {
        int discount = (int) (((this.old_price-this.price)/this.old_price)*100);
        return discount;
    }
}
