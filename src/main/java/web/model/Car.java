package web.model;

public class Car {
    private int id;
    private String brand;
    private String engine;

    public Car(int id, String brand, String engine) {
        this.id = id;
        this.brand = brand;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
