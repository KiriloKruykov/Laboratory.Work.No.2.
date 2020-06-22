/*
 *
 * Classname: Main
 *
 * @version 22.06.2020
 * @author KryukovKirilo

 * Module 3 task 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number.
 * Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example.
 * A point for each one.
 *
 * Creative approaches are welcome.
 *
 * EXAMPLE
 *
 * A company contains two types of employees:  full-time and  part-time ones.
 *
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5.  The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 * /----------------  Subjects according to your number ------------------
 *
 * 1. Employees.
 * 2. Candies in boxes and by weight.
 * 3. Beer draft  and  bottled.
 * 4. Sugar packed and by weight.
 * 5. Cafe : standard lunch and ordering.
 * 6. Air fly : low-cost and business-class.
 * 7.  Trip by train: social sitting places and business-class.
 * 8. Hotel: only bed  and lux.
 * 9. Taxi: payment for km and for time.
 * 10. Fitness centre:  minimal month subscription and free choice.
 *
 * In a list i am a 12 number, that is why I take variant 2
 *
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

//Creation a five Objects from a class: CandiesInBoxes.

    public static void main(String[] args) {
        CandiesInBoxes k1 = new CandiesInBoxes("Roshen",5);
        CandiesInBoxes k2 = new CandiesInBoxes("Romashka",7);
        CandiesInBoxes k3 = new CandiesInBoxes("Corivka",3);
        CandiesInBoxes k4 = new CandiesInBoxes("Jack",2);
        CandiesInBoxes k5 = new CandiesInBoxes("Lidenci",6);

//Creation a five Objects from a class: CandiesByWeight.

        CandiesByWeight j1 = new CandiesByWeight("Lays",3.25,2);
        CandiesByWeight j2 = new CandiesByWeight("Lyuks",2,4);
        CandiesByWeight j3 = new CandiesByWeight("Salyut",1.5,8);
        CandiesByWeight j4 = new CandiesByWeight("Snickers",1.8,3);
        CandiesByWeight j5 = new CandiesByWeight("Lays",10,5);

//Creation a ArrauList that contains all our Objects.

        List<IPrice> Candies = new ArrayList<>();
        Arrays.asList(k1,k2,k3,k4,k5,j1,j2,j3,j4,j5);

//Finding a sum of price of All purchased candies.

        int Price = Candies.stream().mapToInt(IPrice::getPrice).sum();
        System.out.println("The total sum of price of all candies is" + Price + " dollars.");
        System.out.println("----------------------------------------------------------");

//Finding a company that have a highest price of candies

IPrice highestPriceForCandeis = Candies.stream().max(Comparator.comparingInt(IPrice::getPrice))
        .orElse(null);
        System.out.println(System.lineSeparator() + "Company that have a highest price of candies is "
                + highestPriceForCandeis);
        System.out.println("---------------------------------------------");

//Finding company that have a lowest price of candies.

        IPrice lowPriceForCandeis = Candies.stream().min(Comparator.comparingInt(IPrice::getPrice))
        .orElse(null);
        System.out.println(System.lineSeparator() + "Company that have a lowest price of candies is "
                + lowPriceForCandeis);
        System.out.println("---------------------------------------------");

//Finding a average price of purchased candies.

        double avg = Candies.stream().mapToInt(IPrice::getPrice).average()
                .orElse(0);
        System.out.println(System.lineSeparator() + "The average price for candies is a " + avg + " dollars.");
        System.out.println("---------------------------------------------");

//Finding a sum of prices for all candies in boxes.

        int box = Candies.stream().filter(el->el instanceof CandiesInBoxes)
                .mapToInt(IPrice::getPrice).sum();
        System.out.println(System.lineSeparator() + "The sum of prices for all candies in boxes is a "
                + box + " dollars.");
        System.out.println("---------------------------------------------");
        //----------------------------------------------------------------------

//Finding a sum of prices for all candies by weight.

        int byWeight = Candies.stream().filter(el->el instanceof CandiesByWeight)
                .mapToInt(IPrice::getPrice).sum();
        System.out.println(System.lineSeparator() + "The sum of prices for all candies by weight is a "
                + byWeight + " dollars.");
        System.out.println("---------------------------------------------");
        //----------------------------------------------------------------------

//Finding a what candies was purchased more.

        if (box > byWeight) {
            System.out.println("Candies in boxes  was purchased more. ");
        }else{
            System.out.println("Candies in boxes was purchased not so much like a candies by weight.");
        }
        System.out.println("---------------------------------------------");
        //----------------------------------------------------------------------

//Finding a what peoples performance about candies.

        if (byWeight > box){
            System.out.println("It seems like candies by weight people love more than in boxes");
        }else {
            System.out.println("People dont like a candies by weight like a candies in boxes.");
        }
        System.out.println("---------------------------------------------");
        //----------------------------------------------------------------------

//Creation a output for this projects.

        System.out.println(System.lineSeparator() + "Our candies are product a  " + Candies.size() + " companies." +
                System.lineSeparator() + "Total price of all canies that was a purchased a " + Price + " dollars." +
                System.lineSeparator() + "The biggest purchased was a " + highestPriceForCandeis +
                System.lineSeparator() + "The smallest purchased was a " + lowPriceForCandeis +
                System.lineSeparator() + "The average purchased is a " + avg + " dollars." +
                System.lineSeparator() + "The sum of price for all candies in boxes is a " + box + " dollars." +
                System.lineSeparator() + "The sum of price for all candies in boxes is a " + box + " dollars.");
        System.out.println("---------------------------------------------");

    }
}
