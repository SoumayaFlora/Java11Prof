package exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

  public static void main(String[] args) {

    FileReader fr = null;
    try {
//       FileReader fr = null;
      fr = new FileReader("xxx");
      // file reading operations...
    } catch (IOException ioe) {
    } finally {
      if (fr != null) {
        try {
          fr.close();
        } catch (IOException ioe) {}
      }
    }

    try (
//        String s = "Hello";
        FileReader fr2 = new FileReader("xxx");
        FileWriter fw = new FileWriter("yyy");
    ) {
      // file reading operations...
    } catch (IOException ioe) {
    } finally {} // auto-generate a finally that works properly!
    // explicit finally runs second.


    int [] arr = {1, 2, 3, };
  }
}
