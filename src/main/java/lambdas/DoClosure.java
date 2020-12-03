package lambdas;

import java.util.function.Predicate;

public class DoClosure {
  public static Predicate<String> getLengthPred(/*final */int len) {
//    len++;
    return s -> s.length() > len;
  }

  public static void main(String[] args) {
    System.out.println("Fred longer than 3? " + (getLengthPred(3).test("Fred")));
  }
}
