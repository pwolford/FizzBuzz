public class FizzBuzz {

public static void main(String[] args) {
    int count = 1;
    while (count <= 100){
        checkFizzBuzz(count);
        count++;
  }
}  
  public static void checkFizzBuzz(int count) {
    String displayFizzBuzz = Integer.toString(count);
      if (count % 3 == 0) {
      displayFizzBuzz = "Fizz";
    } else if (count % 5 == 0) {
      displayFizzBuzz += "Buzz";
    } 
    System.out.println(displayFizzBuzz);
  }
}

  



