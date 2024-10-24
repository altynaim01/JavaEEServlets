package models;

public class FoodOrder {
private String name;
private String surname;
private String order;

    public FoodOrder(String name, String surname, String order) {
        this.name = name;
        this.surname = surname;
        this.order = order;
    }

    public FoodOrder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSurname() {
        return surname;
    }

    public String getOrder() {
        return order;
    }
}
