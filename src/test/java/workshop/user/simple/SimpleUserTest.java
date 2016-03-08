package workshop.user.simple;

import org.junit.Before;
import org.junit.Test;

import workshop.user.common.Gender;
import workshop.user.simple.SimpleUser;

public class SimpleUserTest {
	private SimpleUser user;

	@Before
	public void setUp() {
		user = new SimpleUser();
		user.setFirstName("Jan");
		user.setLastName("Kowalski");
		user.setGender(Gender.MALE);
		user.setPhoneNumber("48502112332");
		user.setStreetAddress("Pomorska 80");
		user.setCity("Gdańsk");
	}

	@Test
	public void createUserTest() {
		user.validate();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateFirstNameTest() {
		user.setFirstName(null);
		user.validate();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateLastNameTest() {
		user.setLastName(null);
		user.validate();
	}

	@Test
	public void validatePhoneNumberTest() {
		user.setPhoneNumber(null);
		user.validate();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateGenderTest() {
		user.setGender(null);
		user.validate();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateStreetAddressTest() {
		user.setStreetAddress(null);
		user.validate();
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateCityTest() {
		user.setCity(null);
		user.validate();
	}
}
