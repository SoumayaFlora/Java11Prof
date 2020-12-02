package usingvar;

import java.io.Serializable;

public class ConditionalOp {
  public static boolean trueFunction() {
    return true;
  }
  public static void main(String[] args) {
    byte s1 = 99;
    final int s2 = 30;
    int s3 = s1 + s2;

    var res = trueFunction() ? s1 : s2;

    String s = "Hello";
    StringBuilder sb = new StringBuilder(s);

    var o =
        trueFunction() ? s : 99;
//    Comparable & Serializable se; // NOT possible

    Boolean r = trueFunction() ? false : Boolean.TRUE;
  }
}
