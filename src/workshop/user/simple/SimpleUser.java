package workshop.user.simple;

import workshop.user.common.Gender;
import workshop.user.common.Optional;

public class SimpleUser {
	private final long id;
	private String firstName;
	@Optional
	private String middleName;
	private String lastName;
	@Optional
	private String phoneNumber;
	private Gender gender;
	private String streetAddress;
	private String city;

	public SimpleUser() {
		id = generateId();
	}

	public SimpleUser(String firstName, String lastName,
					  Gender gender, String streetAddress, String city) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.streetAddress = streetAddress;
		this.city = city;
		//validate if object was properly initialized
		validate();
	}

	public SimpleUser(String firstName, @Optional String middleName, String lastName,
					  @Optional String phoneNumber,
					  Gender gender,
					  String streetAddress, String city) {

		this(firstName, lastName, gender, streetAddress, city);
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void validate() {
		if (isNullOrEmpty(firstName)) {
			throw new IllegalArgumentException("First name can not be empty");
		}

		if (isNullOrEmpty(lastName)) {
			throw new IllegalArgumentException("Last name can not be empty");
		}

		if (gender == null) {
			throw new IllegalArgumentException("Gender can not be null");
		}

		if (isNullOrEmpty(city)) {
			throw new IllegalArgumentException("City can not be empty");
		}

		if (isNullOrEmpty(streetAddress)) {
			throw new IllegalArgumentException("Street address can not be empty");
		}
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(firstName);
		b.append(", ");
		b.append(lastName);
		b.append(", ");
		b.append(gender);
		b.append(", ");
		b.append(phoneNumber);
		b.append(", ");
		b.append(city);
		b.append(" ");
		b.append(streetAddress);
		return b.toString();
	}

	private long generateId() {
		//FIXME generate unique id
		return -1;
	}

	private boolean isNullOrEmpty(String string) {
		if (string == null || string.isEmpty()) {
			return true;
		}

		return false;
	}
}
