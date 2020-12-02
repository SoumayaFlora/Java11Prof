package loops;

public class Ex1 {
  public static void main(String[] args) {
    int x = 3;
    int y = 0;
    outer: while (x < 10) {
      x = y++;
      inner:  while(y < 2) {
        if (++x > 2) {
          continue outer; // line n1
//          break inner;
//          break;
        }
      }
// nothing here..
    }
  }
}
