package Exception;

public class UserDetials {
void registation(String name,int age, String country) throws InvalidAgeExcpetion {
	if(age<18) {
		try {
		throw new InvalidAgeExcpetion("user is minor");
			}catch (InvalidAgeExcpetion e) {
				// TODO: handle exception
				System.out.println("try next time");
			}
		}
	else if(!country.equalsIgnoreCase("India")) {
		try {
			throw new InvalidCountryException("invalid country name");
		}catch (InvalidCountryException e) {
			// TODO: handle exception
			System.out.println("please try aganin");
		} 
	}
	else {
		System.out.println("procced to next");
	}
	}
}