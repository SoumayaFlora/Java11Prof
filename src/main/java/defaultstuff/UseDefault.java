package defaultstuff;

interface I1 {
  int X = 99;
  default void doStuff() {
    System.out.println("I1.ds");
  }
}

interface I2 {
  int X = 100;
  default void doStuff() {
    System.out.println("I2.ds");
  }
}

class CP {
  private void doStuff() {
    System.out.println("CP.ds !!!!");
  }
}

class C1 /*extends CP*/ implements I1, I2 {
  public void doStuff() {
    System.out.println("C1.ds");
    I1.super.doStuff();
    I2.super.doStuff();
    System.out.println(I2.X);
  }
}
public class UseDefault {
  public static void main(String[] args) {
    new C1().doStuff();
  }
}
