package UserDifinedException;

public class UserRegistration {
void registrationProfile(String userName, int Age, String country) {
	if(Age<18) {
		try {
			throw new InvalidAgeException("user is minor");
			
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Try next time..");
		}
	}
	else if(!country.equalsIgnoreCase("India")) {
		try {
			throw new InvalidCountryException("Invalid country name");
		}
		catch (InvalidCountryException e) {
			// TODO: handle exception
			System.out.println("please try country");
		}
	}
	else {
		System.out.println("Please proceed");
	}
}
}
