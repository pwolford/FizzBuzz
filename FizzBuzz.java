public class FizzBuzz {

public static void main(String[] args) {
    int count = 1;
    while (count <= 100){
        System.out.println(checkFizzBuzz(count));
        count++;
  }
}  
  public static String checkFizzBuzz(int count) {
    if ((count % 3 == 0) && (count % 5 == 0)) {
      return "FizzBuzz";
    } else if (count % 3 == 0) {
      return "Fizz";
    } else if (count % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(count);
    }
  }
  
}


