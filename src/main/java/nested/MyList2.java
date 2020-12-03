package nested;

import java.util.Iterator;

public class MyList2<E> implements Iterable<E> {
  private E[] data = (E[])(new Object[10]);
  private int count = 0;

  public void add(E e) {
    data[count++] = e;
  }

  public E get(int idx) {
    return data[idx];
  }

  public static void main(String[] args) {
    MyList<String> mls = new MyList<>();
    mls.add("Fred");
    mls.add("Jim");
    mls.add("Sheila");
    System.out.println(mls.get(1));

    Iterator<String> first = mls.iterator();
    Iterator<String> second = mls.iterator();

    System.out.println("> " + first.next());
    System.out.println(">>                  " + second.next());
    System.out.println("> " + first.next());
    System.out.println(">>                  " + second.next());
    System.out.println(">>                  " + second.next());
    System.out.println("> " + first.next());
  }



  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private int progress = 0;

      @Override
      public boolean hasNext() {
//        this.
        return progress < count;
      }

      @Override
      public E next() {
        return data[progress++];
      }
    };
  }
}
