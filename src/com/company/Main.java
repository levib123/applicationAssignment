package com.company;
import java.util.Scanner;

public class Main {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
      //write your code here
      //temperature();
      //timeConvert();
      //acreage();
      //candy();
     // moneyReturn();
      stringIndex();
   }
   public static void temperature ()  {
      System.out.println("What is today's temperature?");
      int temp = input.nextInt();
      double tempChange = ((double) temp - 32) * (.5555);

      System.out.println(temp + " degrees Fahrenheit is " + tempChange + " degrees Celsius.");
   }

   public static void timeConvert() {
      System.out.println("Put in a number of hours");
      double hours = input.nextDouble();
      int timeHours = ((int) hours);
      double timeRemainder = ((double) hours % 1);
      int timeMinutes = (int) (timeRemainder * 60);

      System.out.print(timeHours + " hours ");
      System.out.println(timeMinutes + " minutes  ");

   }

   public static void acreage() {
      System.out.println("Please put in the width (in feet)");
      double width = input.nextDouble();
      System.out.println("Please put in the height (in feet) ");
      double height = input.nextDouble();
      double area = (width * height);
      double acres = (area / 43560);

      System.out.println(acres + " acres");

   }

   public static void candy() {
      System.out.println("One KitKat is $1.09, how many KitKats would you like to buy? ");
      double numCandy = input.nextDouble();
      double kitKat = 1.09;
      double totalCost = (numCandy * 1.09 * 1.078);
      totalCost = Math.round(totalCost * 100);

      System.out.print("Your total cost is $" + totalCost / 100);
   }

   public static void moneyReturn () {
      System.out.println("Put in an amount of money in dollars and cents: ");
      double moneyInput = input.nextDouble();
      int tens = (int) (moneyInput /10) + 1;
      System.out.println("You will need " + tens + " $10 dollar bills to pay for this amount");
      double change = 10 - ( moneyInput % 10);
      change = Math.round(change * 100);
      System.out.println(change / 100 + " is your change");

   }


   public static void stringIndex () {
      System.out.println("Put in an integer and a word: ");
      int integer = input.nextInt();
      String word = input.nextLine();


   }
}

