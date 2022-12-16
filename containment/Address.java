package containment;

public class Address {
String city,state,country;
int streetNo;

public Address(String city, String state, String country, int streetNo){
	// TODO Auto-generated constructor stub
	this.city=city;
	this.state=state;
	this.country=country;
	this.streetNo=streetNo;
}

@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", country=" + country + ", streetNo=" + streetNo
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
