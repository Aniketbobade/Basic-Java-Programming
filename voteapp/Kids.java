package voteapp;

public class Kids implements VotingApp {
String type;
	@Override
	public void registeruser(int age) {
		// TODO Auto-generated method stub
		if(age<12)
		{
			type="kids";
			System.out.println("You have successfully registered under kids Section");
		}
		else {
			type="adult";
			System.out.println("You have not successfully registered under kids Section");
		}
	}

	@Override
	public void requestVotingNumber() {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("kids"))
		{
			System.out.println("Sorry cannot go for voting beacause age must be greater than 12");
		}
		
	}

}
