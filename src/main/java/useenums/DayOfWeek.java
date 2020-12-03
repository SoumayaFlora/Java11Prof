package useenums;

import java.lang.reflect.Constructor;

public enum DayOfWeek {
  MONDAY("Lundi"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

  private String otherName;
  DayOfWeek() {}

  DayOfWeek(String s) {
    otherName = s;
  }

  @Override
  public String toString() {
    return "I'm a day of week, named" + super.toString().toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println(FRIDAY);
    System.out.println(FRIDAY.name());

    Class<?> clazz = DayOfWeek.class;
    Constructor[] cons = clazz.getDeclaredConstructors();
    for (Constructor c : cons) {
      System.out.println(c);
    }

    System.out.println(DayOfWeek.MONDAY.otherName);
  }
}

//class Bad extends DayOfWeek {
//  public Bad(String s, int n) {
//    super(s, n);
//  }
//}