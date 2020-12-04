package useannotation;

import java.time.LocalDate;

@MyAnnotation
public class Target {
  @MyAnnotation
  private int x;

  private String noneofyourbusiness;

  @MyAnnotation
  private LocalDate now;
//  @MyAnnotation
  public void doStuff() {}
}
