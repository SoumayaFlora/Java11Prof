package resolution;

public class Ex1 {
  int x = -1;
  public static void main(String[] args) { new ScrSub().doStuff(); }
}

class ScrSub extends Ex1 {
  int x = 99;
//  static int x;
  void doStuff() {
    System.out.print(x + ","); // line n1
    int x = 100;
    System.out.print(x + ",");
//    System.out.print(Ex1.x + ",");

    Ex1 src = new ScrSub();
    System.out.println(src.x);
  }
}
