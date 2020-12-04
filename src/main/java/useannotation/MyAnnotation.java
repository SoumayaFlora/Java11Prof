package useannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.TYPE, ElementType.FIELD})
@Target(ElementType.FIELD) // ARRAY type attribs don't need curlies if only one is specificed
public @interface MyAnnotation {
  int count() default 10;
  String value(); // value is "special"
}
