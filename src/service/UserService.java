package service;



import models.FoodOrder;
import models.Footballer;
import models.User;

import java.util.ArrayList;

public class UserService {
    private static ArrayList<User> users = new ArrayList<>();

    private static ArrayList<FoodOrder> orders = new ArrayList<>();

    private static ArrayList<Footballer> footballers = new ArrayList<>();

    private static int id = 0;

    static {
        users.add(new User("John", "Doe"));
        users.add(new User("Jane", "Smith"));
        users.add(new User("Michael", "Johnson"));
        users.add(new User("Emily", "Davis"));
        users.add(new User("David", "Wilson"));
    }

    static {
        orders.add(new FoodOrder("Altynay", "Mukhtar", "kinder"));
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void addUser(User user){
        users.add(user);
    }

    public static ArrayList<FoodOrder> getOrders(){
        return orders;
    }

    public static void addOrder(FoodOrder foodOrder){
        orders.add(foodOrder);
    }

    public static void addFootballer(Footballer footballer){
        footballer.setId(id);
        id++;
        footballers.add(footballer);
    }

    public static ArrayList<Footballer> getFootballers() {
        return footballers;
    }
}
