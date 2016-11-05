package main.modelpojos.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Checks to see if the attached string does not equal the {@code check} value.
 * This annotation can be used repeatedly on the same field. For example:
 * <pre>
 * &#64;NotEqual(check = "test1", message = "This is test1")
 * &#64;NotEqual(check = "test2", message = "This is test2")
 * private String name;</pre>
 * is valid code.
 * 
 * @since 1.8
 * @author Daniel Eliasinski
 */

@Documented
@Repeatable(NotEqual.NotEquals.class)
@Constraint(validatedBy = StringChecker.class)
@Target( {ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEqual {
 
     
    String message() default "Name error!";
    
    String check();
     
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
    
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target( {ElementType.FIELD })
    public @interface NotEquals {
    	NotEqual[] value();
    }
}