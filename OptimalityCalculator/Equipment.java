package OptimalityCalculator;

public class Equipment {
     private String name;
     private String brand;
     private String type;
     private double price;
     private double qualityPercent;



        public Equipment(String name, String brand, String type,double price, double qualityPercent)
        {
            this.name=name;
            this.brand=brand;
            this.type=type;
            this.price=price;
            this.qualityPercent=qualityPercent;
        }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQualityPercent() {
        return qualityPercent;
    }

    public void setQualityPercent(double qualityPercent) {
        this.qualityPercent = qualityPercent;
    }

    // call op calc()
    //call send mail()
}
