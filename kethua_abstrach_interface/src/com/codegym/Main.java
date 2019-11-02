package com.codegym;
import com.codegym.Fruit;
import com.codegym.Animal;
import com.codegym.Edible;
import com.codegym.Chicken;
import com.codegym.Apple;
import com.codegym.Tiger;
import com.codegym.Orange;
public class Main {

    public static void main(String[] args) {
        Animal animal[] = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        Orange orange = new Orange();
        Apple apple = new Apple();
        System.out.println("an cam the nao: " + orange.howToEat());
        System.out.println("an tao the nao: " + apple.howToEat());
        System.out.println("===========================================");
       for(Animal i : animal){
           if(i instanceof Chicken){
               Edible food = (Edible)i;
               System.out.println(food.howToEat());
               System.out.println("===========================================");
           }
           System.out.println(i.makeSound());
       }

    }
}


