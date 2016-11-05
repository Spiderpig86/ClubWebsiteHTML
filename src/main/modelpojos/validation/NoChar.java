package main.modelpojos.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Repeatable(NoChar.NoChars.class)
@Constraint(validatedBy = CharChecker.class)
@Target( {ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoChar {
 
     
    String message() default "Invalid character!";
    
    char check();
     
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
    
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target( {ElementType.FIELD })
    public @interface NoChars {
    	NoChar[] value();
    }
}
