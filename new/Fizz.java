public class Fizz {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }
}

