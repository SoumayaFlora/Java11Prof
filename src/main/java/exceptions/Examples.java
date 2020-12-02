package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Examples {
  public static void doStuff() throws IOException, FileNotFoundException,  SQLException {
//    throw new IOException();
  }

  public static void useIt() /*throws IOException */{
    try {
      doStuff();
    } /*catch (IOException re) {
      System.out.println("It broke");
    } catch (SQLException sqe) {
      System.out.println("It broke");
    }*/
     /*catch (Exception e) { // Catches RuntimeException
       throw e;
     }*/
    catch (/*FileNotFoundException | */IOException |  SQLException ex) {

    }
  }
}

/*
var helpful?
A) true
B) false
 */