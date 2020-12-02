package equality;

public class Ex2 {
  public static void main(String[] args) {
    String s1 = "Hello";
//    String s2 = "Hello";  // ONE object "Hello" in the "constant pool", also for Integer < byte size :)
    String s2 = new String("Hello");
//    String s2 = "He";
//    s2 += "llo";
    System.out.println(s1 == s2);
//    s2.intern();
    s2 = s2.intern();  // GC can sometimes resolve duplicates too!!!
    System.out.println(s1 == s2);
  }
}

/*
A) true
B) false
 */