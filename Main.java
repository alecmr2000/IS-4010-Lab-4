import java.util.Random;
class Main {
  public static void main(String[] args) {

    Random r = new Random();
    //Above is creating a new random object.

    int r_randomNum = r.nextInt(51);
    //Above is creating a place to store the random number.

    System.out.println("The Random Number is: "+r_randomNum);
    //Above is stating what the random number is.

    while (r_randomNum >=0){
      System.out.println(r_randomNum);
      r_randomNum--;
    }
  }
}