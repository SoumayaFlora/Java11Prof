package useannotation;

import java.time.LocalDate;

//@MyAnnotation(value="The Class")
public class Target {
  @MyAnnotation("The int x")
  private int x;

  private String noneofyourbusiness;

  @MyAnnotation(value="Something Else!", count = 256)
  private LocalDate now;
//  @MyAnnotation
  public void doStuff() {}
}
