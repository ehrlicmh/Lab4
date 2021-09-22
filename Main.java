import java.util.Random;


class Main {
  public static void main(String[] args) {
    System.out.println("The random number is:");

    Random r = new Random();
    for(int randomNum = r.nextInt(51) + 1;randomNum>0;randomNum--){
      if(randomNum <= 5){
        System.out.println("Ahoy Mateys!");
      }else {if(randomNum > 25 && randomNum < 42);
        System.out.println("Blast Off!");
      }
     System.out.println(randomNum);
    }
  }
}