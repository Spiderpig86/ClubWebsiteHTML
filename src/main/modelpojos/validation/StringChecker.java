package main.modelpojos.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 
 * 
 * @author Daniel Eliasinski
 */

public class StringChecker implements ConstraintValidator<NotEqual, String> {
	
	private String check;

	@Override
	public void initialize(NotEqual annotation) {
		check = annotation.check();
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext ctx) {
		
		return !name.equals(check);
	}

}