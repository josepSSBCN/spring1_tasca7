package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
/**
 * Amb aquesta anotació es marcarà quins mètodes s'han d'executar i quina no.
 */
public @interface MethodAnnotation {
    boolean execute() default false;
}
