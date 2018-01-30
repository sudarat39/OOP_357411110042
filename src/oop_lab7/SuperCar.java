package oop_lab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;

    public SuperCar (){}
    public SuperCar (String b,String c,String e){
        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
    }

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                '}';
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}