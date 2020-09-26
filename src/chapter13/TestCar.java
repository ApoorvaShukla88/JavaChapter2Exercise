package chapter13;

import java.util.Arrays;

public class TestCar {
    public static void main(String[] args){
        Car c1 =new Car("123aft", 50, 25000);
        Car c2 =new Car("234rfe", 75, 29000);
        Car c3 =new Car("arve123", 25, 20000);
        Car c4 =new Car("squ21st", 20, 15000);
        Car[] cars ={c1, c2, c3, c4};
        Arrays.sort(cars);
        for(int i =0; i < cars.length; i++){
            System.out.println("Cars after sort VIM : " + cars[i].getVIM());
        }
        Arrays.sort(cars);
        for(int i =0; i < cars.length; i++){
            System.out.println("Cars after sort mpg : " + cars[i].getMpg());
        }
        Arrays.sort(cars);
        for(int i =0; i < cars.length; i++){
            System.out.println("Cars after sort price : " + cars[i].getPrice());
        }
        System.out.println("C1 : " + c1);
    }
}
