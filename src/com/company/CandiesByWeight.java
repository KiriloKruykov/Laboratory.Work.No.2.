/*
 *
 * Classname: CandiesByWeight
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

//Create Class:CandiesByWeight.

public class CandiesByWeight implements IPrice {
    private String name;
    private double wieght;
    private int priceForWeigth;


    /*
      @param: String name: What the name of company candies.
      @param: double weight: How much weight of candies was a purchase.
      @param: int priceForWeight: How much costs a 1 killo of candies.
  */


    public CandiesByWeight() {
    }

    public CandiesByWeight(String name, double wieght, int priceForWeigth) {
        this.name = name;
        this.wieght = wieght;
        this.priceForWeigth = priceForWeigth;
    }
//Constructors

//Getters , setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }

    public int getPriceForWeigth() {
        return priceForWeigth;
    }

    public void setPriceForWeigth(int priceForWeigth) {
        this.priceForWeigth = priceForWeigth;
    }


    //Method. toString
    @Override
    public String toString() {
        return "CandiesByWeight{" +
                "name='" + name + '\'' +
                ", wieght=" + wieght +
                ", priceForWeigth=" + priceForWeigth +
                '}';
    }


    //Method getPrice was implemetion from Interface:IPrice.
    @Override
    public int getPrice() {
        return (int) (this.getPriceForWeigth()*this.getWieght());
    }
}
