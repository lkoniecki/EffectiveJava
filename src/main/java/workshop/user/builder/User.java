package workshop.user.builder;

import com.google.common.base.Strings;

import workshop.user.common.Gender;
import workshop.user.common.Optional;

public class User {
	private final long id;
	private String firstName;
	@Optional
	private String middleName;
	private String lastName;
	private Gender gender;
	@Optional
	private String phoneNumber;
	private String streetAddress;
	private String city;

	private User() {
		id = generateId();
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
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

	public static class Builder {
		private String firstName;
		private String middleName;
		private String lastName;
		private Gender gender;
		private String phoneNumber;
		private String streetAddress;
		private String city;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder streetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		private void validate(User user) {
			if (Strings.isNullOrEmpty(user.firstName)) {
				throw new IllegalArgumentException("First name can not be empty");
			}

			if (Strings.isNullOrEmpty(user.lastName)) {
				throw new IllegalArgumentException("Last name can not be empty");
			}

			if (user.gender == null) {
				throw new IllegalArgumentException("Gender can not be null");
			}

			if (Strings.isNullOrEmpty(user.city)) {
				throw new IllegalArgumentException("City can not be empty");
			}

			if (Strings.isNullOrEmpty(user.streetAddress)) {
				throw new IllegalArgumentException("Street address can not be empty");
			}
		}

		public User build() {
			User user = new User();
			user.firstName = this.firstName;
			user.middleName = this.middleName;
			user.lastName = this.lastName;
			user.gender = this.gender;
			user.phoneNumber = this.phoneNumber;
			user.streetAddress = this.streetAddress;
			user.city = this.city;
			validate(user);
			return user;
		}
	}
}