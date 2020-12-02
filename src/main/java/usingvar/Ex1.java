package usingvar;

public class Ex1 {
  //  var count = 99; // NOT ALLOWED, local vars only
  public static void showAll(int ... values) {
    for (int v : values) {
      System.out.println("> " + v);
    }
  }

  public static void main(String[] args) {
    int [] values = {1, 2, 3};
    showAll(1, 3, 5);
    showAll(values);
//    showAll({3, 5, 7});
    showAll(new int []{3, 5, 7});

//    var ia = {1, 3, 5};
    var ia = new int[]{1, 3, 5};
    showAll(ia);

    var var = 99;
//    var assert = 5;
  }

  public static void x(String[] args) {
//    var x;
    var x = 99;
    var y =
        "hello";

//    y = 99;

    // var must be "entire type"

    // NO NO NO
//    var [] a = new int[10];
    var a = new int[10];


  }
}
