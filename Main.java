/* 
Lab 4
Partners: Alec Rezelj and Chris Fenter
Date: 02.08.2021
*/

import java.util.Random;
class Main {
  public static void main(String[] args) {

    Random r = new Random();
    //Above is creating a new random object.

    int r_randomNum = r.nextInt(51);
    //Above is creating a place to store the random number.

    System.out.println("The Random Number is: "+r_randomNum);
    //Above is stating what the random number is.

    if (r_randomNum <= 5){
      while (r_randomNum >=0){
        System.out.println(r_randomNum);
        r_randomNum--;
      }
      System.out.println("Ahoy mateys!");
    }
    else if (r_randomNum > 25 && r_randomNum <42){
      while (r_randomNum >=0){
        System.out.println(r_randomNum);
        r_randomNum--;
      }
      System.out.println("Cannonball!");
    }
    else if (r_randomNum > 5 && r_randomNum <=25){
      while (r_randomNum >=0){
        System.out.println(r_randomNum);
        r_randomNum--;
      }
      System.out.println("Blast Off!");
    }
    else if (r_randomNum >=42 && r_randomNum <=50){
      while (r_randomNum >=0){
        System.out.println(r_randomNum);
        r_randomNum--;
      }
      System.out.println("Blast Off!");
    }
  }
}