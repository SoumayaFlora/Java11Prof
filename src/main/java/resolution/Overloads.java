package resolution;

public class Overloads {
//  void doStuff(int x, long y) {
//    System.out.println("v1");
//  }

  void doStuff(int ... x) {
    System.out.println("v var");
  }

  void doStuff(Integer x, int y) {
    System.out.println("v2");
  }

  void doStuff(String x, long y) {
    System.out.println("v3");
  }

  public static void main(String[] args) {
    new Overloads().doStuff(1, 1);
  }
}
