package com.vitalikasaty.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String>{

	private String endOfEmail;
	
	@Override
	public void initialize(CheckEmail checkEmail) {
		endOfEmail = checkEmail.value();
	}
	
	@Override
	public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
		
		//проверяем введеный email на соответсвие шаблону(конец email'а должен соответствовать определённому значению)
		return enteredValue.endsWith(endOfEmail); 
	}

}
