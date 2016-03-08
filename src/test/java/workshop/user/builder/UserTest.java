package workshop.user.builder;

import org.junit.Test;

import workshop.user.common.Gender;

public class UserTest {
	@Test
	public void createUserTest() {
		new User.Builder()
				.firstName("Jan")
				.lastName("Kowalski")
				.phoneNumber("48422443223")
			   	.gender(Gender.MALE)
			   	.streetAddress("Powązki 20")
			   	.city("Warszawa")
			   	.build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateFirstNameTest() {
		new User.Builder()
				.lastName("Kowalski")
				.phoneNumber("48422443223")
			   	.gender(Gender.MALE)
			   	.streetAddress("Powązki 20")
			   	.city("Warszawa")
			   	.build();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void validateLastNameTest() {
		new User.Builder()
				.firstName("Jan")
				.phoneNumber("48422443223")
			   	.gender(Gender.MALE)
			   	.streetAddress("Powązki 20")
			   	.city("Warszawa")
			   	.build();
	}

	@Test
	public void validatePhoneNumberTest() {
		new User.Builder()
				.firstName("Jan")
				.lastName("Kowalski")
			   	.gender(Gender.MALE)
			   	.streetAddress("Powązki 20")
			   	.city("Warszawa")
			   	.build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateGenderTest() {
		new User.Builder()
				.firstName("Jan")
				.lastName("Kowalski")
				.phoneNumber("48422443223")
			   	.streetAddress("Powązki 20")
			   	.city("Warszawa")
			   	.build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateStreetAddressTest() {
		new User.Builder()
				.firstName("Jan")
				.lastName("Kowalski")
				.phoneNumber("48422443223")
			   	.gender(Gender.MALE)
			   	.city("Warszawa")
			   	.build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateCityTest() {
		new User.Builder()
				.firstName("Jan")
				.lastName("Kowalski")
				.phoneNumber("48422443223")
			   	.gender(Gender.MALE)
			   	.streetAddress("Powązki 20")
			   	.build();
	}
}
