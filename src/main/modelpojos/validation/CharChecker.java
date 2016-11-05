package main.modelpojos.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 
 * 
 * @author Daniel Eliasinski
 */

public class CharChecker implements ConstraintValidator<NoChar, String> {
	
	private char check;

	@Override
	public void initialize(NoChar annotation) {
		check = annotation.check();
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext ctx) {
		return name.indexOf(check) == -1;
	}

}