package containment;

public class Person {
String pName,pAdhaar,pJobName,pJobLocation;
int pJobId;
Address ad;
public Person(Address ad,String pName,String pAdhaar,String pJobName, String pJobLocation, int pJobId) {
	// TODO Auto-generated constructor stub
	this.ad=ad;
	this.pName=pName;
	this.pAdhaar=pAdhaar;
	this.pJobName=pJobName;
	this.pJobLocation=pJobLocation;
	this.pJobId=pJobId;
}

void displayPersonDetails()
{
	System.out.println(ad);
	System.out.println("Person name"+pName);
	System.out.println("Person Adhaar"+pAdhaar);
	System.out.println("Person Job Name"+pJobName);
	System.out.println("Person Job location"+pJobLocation);
	System.out.println("Person ID"+pJobId);
	
	}
}
