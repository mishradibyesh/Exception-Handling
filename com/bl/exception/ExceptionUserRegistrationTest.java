package com.bl.exception;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest {

	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	public void firstName() throws InputInvalidException {
		String firstName = "Dibyesh"; 
		Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
	}

	@Test
	public void lastName() throws InputInvalidException {
		String lastName = "Mishra";
		Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
	}

	@Test
	public void emailId() throws InputInvalidException {
		String emailId = "dibyesh@gmail.com";
		Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
	}

	@Test
	public void mobileNumber() throws InputInvalidException {
		String mobileNumber = "91 9989774456";
		Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
	}

	@Test
	public void password() throws InputInvalidException{
		String password = "qw98hRL@&dl";
		Assert.assertTrue(exceptionUserRegistration.testPassword(password));
	}
}
