package useaservice;

//import internal.Secret;
import myprovider.SomeService;

import java.lang.reflect.Field;

public class User {
  public static void main(String[] args) throws Throwable {
    System.out.println("There is a message which is: " + SomeService.myMessage);
//    System.out.println("Secret message is " + Secret.secretMessage);
    Field f = SomeService.class.getDeclaredField("moreSecrets");
    System.out.println("field is " + f);
    f.setAccessible(true);
    String str = (String)f.get(null);
    System.out.println(str);
  }
}
