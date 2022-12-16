package voteapp;

public class Adult implements VotingApp{
String type;
	@Override
	public void registeruser(int age) {
		// TODO Auto-generated method stub
		if(age>12)
		{
			type="Adult";
		System.out.println("User successfully register for under section of Adult");	
		}
		else {
			type="kids";
			System.out.println("User haave not successfully register for under section of Adult");
		}
	}

	@Override
	public void requestVotingNumber() {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Adult"))
		{
			System.out.println("Your voting ID will generate within Day");
		}
		else {
			System.out.println("Sorry! you are not ");
		}
	}

}
