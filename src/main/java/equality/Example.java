package equality;

public class Example {
  public static void main(String[] args) {
    var sb1 = new StringBuilder("Hello World");
    StringBuilder sb2 = new StringBuilder("Hello World");
    System.out.println(sb2.equals(sb1)); // inherited Object.equals which IS ==
  }
}
