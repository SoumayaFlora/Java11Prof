package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

@FunctionalInterface
interface Selector<E> {
  boolean test(E e);
//  void doStuff();
}

class LongStringSelector implements Selector<String> {

  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

public class FindingStuff {
  public static <E> List<E> filter(List<E> l, Selector<E> sel) {
    List<E> res = new ArrayList<>();
    for (E e : l) {
      if (sel.test(e)) {
        res.add(e);
      }
    }
    return res;
  }
  public static void main(String[] args) {
    List<String> ls = List.of("Fred", "Jim", "Sheila"); // See also List.copyOf

    // make a list of the "long" Strings
    List<String> longOnes = filter(ls, new LongStringSelector());
    System.out.println(longOnes);

    System.out.println(filter(ls, new Selector<String>() {
      @Override
      public boolean test(String s) {
        return s.length() > 3;
      }
    }));

    System.out.println(filter(ls, /*new *//*Selector<String>() *//*{*/
//      @Override
      /*public boolean test*/(String s) -> {
        return s.length() > 3;
      }
    /*}*/));

    System.out.println(filter(ls, (String s) -> {
        return s.length() > 3;
      } ));

    // unambiuous arguments (all of them) can leave ALL of them out
    Selector<String> obj = (/*@Deprecated*/ s) -> {
      return s.length() > 3;
    };

    Selector<String> obj3 = s -> { // curlies called "block lambda" can have FULL method body
      // everything, including try/catch, loops. EVERYTHING
      return s.length() > 3;
    };
    // zero arg lambda: () -> ...

//    Selector<String> obj4 = s -> { return s.length() > 3; };
    Selector<String> obj4 = s -> s.length() > 3      ;


    // for unambiguous args can use var for ALL of them
    Selector<String> obj2 = (@Deprecated var s) -> { // WHAT uninitialized VAR!!!
      return s.length() > 3;
    };

    ToIntFunction<String> tifs = new ToIntFunction<String>() {
      @Override
      public int applyAsInt(String value) {
        if (value.equals("")) return 0;
        else return this.applyAsInt(value.substring(1)) + 1;
      }
    };

    // lambdas do not create a new "this" context
//    ToIntFunction<String> tils = (String value) -> {
//        if (value.equals("")) return 0;
//        else return this.
//            .applyAsInt(value.substring(1)) + 1;
//      };

    System.out.println("Length of hello is " + tifs.applyAsInt("hello"));
  }

  void doStuff() {}
}
