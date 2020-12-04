package serialize;

import java.io.*;
import java.time.LocalDate;

class MySupport/* implements Serializable */{
  private int x = 100;

  public MySupport() {}

  public MySupport(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  @Override
  public String toString() {
    return "MySupport{" +
        "x=" + x +
        '}';
  }
}

class Parent {
  public Parent(){}
  public Parent(int x) {}
}
class MyData extends Parent implements Serializable {
//  private static final long serialVersionUID = -2101225873113364103L;
  private int count = 99;
  private String name = "Fred";
  transient private MySupport ms = new MySupport();

  public MyData() {
    super(1);
    System.out.println("Constructing a MyData");
  }

  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
    ois.defaultReadObject();
    int theX = ois.readInt();
    MySupport ms = new MySupport(theX);
    this.ms = ms;
  }

  private void writeObject(ObjectOutputStream oos) throws IOException {
    oos.defaultWriteObject();
    oos.writeInt(ms.getX() + 1000);
  }

  @Override
  public String toString() {
    return "MyData{" +
        "count=" + count +
        ", name='" + name + '\'' +
        ", ms=" + ms +
        '}';
  }
}

public class TryStuff {
  public static void main(String[] args) throws Throwable {
    try (ObjectOutputStream oos =
             new ObjectOutputStream(new FileOutputStream("data.dat"));) {
      MyData md = new MyData();
//      oos.writeObject(LocalDate.now());
      oos.writeObject(md);
    }
    System.out.println("-----------------------");
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
      var obj = ois.readObject();
      System.out.println("read object is of type: " + obj.getClass().getName());
      if (obj instanceof MyData /*md2*/) {
        MyData md2 = (MyData) obj;
        System.out.println(md2);
      }
    }
  }
}
