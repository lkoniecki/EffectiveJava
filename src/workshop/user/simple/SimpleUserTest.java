package workshop.user.simple;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import workshop.user.common.Gender;

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
		user.validate();
	}

	@Test
	public void createUserTest() {
	}

	@Test
	public void createUserMultiArgConstructor() {

		String expectedFirstName = "Jan";
		String expectedLastName = "Kowalski";
		Gender expectedGender = Gender.MALE;
		String expectedStreet = "Pomorska 80";
		String expectedCity = "Gdańsk";
		user = new SimpleUser(expectedFirstName, expectedLastName, expectedGender,
				expectedStreet, expectedCity);

		assertEquals(expectedFirstName, user.getFirstName());
		assertEquals(expectedLastName, user.getLastName());
		assertEquals(expectedGender, user.getGender());
		assertEquals(expectedStreet, user.getStreetAddress());
		assertEquals(expectedCity, user.getCity());
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
