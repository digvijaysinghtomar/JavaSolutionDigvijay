package com.js.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.js.model.RegistrationDto;

@Component
public class RegistrationValidator {
	public boolean supports(Class<?> clazz) {
		return RegistrationDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		RegistrationDto registration = (RegistrationDto) target;
		ValidationUtils.rejectIfEmpty(errors, "firstname", "error.firstName.empty");
		System.out.println("inside validator");
		ValidationUtils.rejectIfEmpty(errors, "lastname", "error.lastName.empty");
		ValidationUtils.rejectIfEmpty(errors, "emailid", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "mobileno", "error.mobile.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		
		
	
}

}
