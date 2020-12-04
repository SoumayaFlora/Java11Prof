package useannotation;

import java.lang.reflect.Field;

public class AnnotationHunter {
  public static void main(String[] args) throws Throwable {
    String unknownClass = "useannotation.Target";
    Class<?> clazz = Class.forName(unknownClass);

    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f);
      MyAnnotation annot = f.getAnnotation(MyAnnotation.class);
      if (annot != null) {
        System.out.println(" **** ANNOTATED!!! count is " + annot.count());
        System.out.println(" --  and value is " + annot.value());
      }
    }
  }
}
