package voteapp;

public class VoteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kids kid=new Kids();
		kid.show();
		kid.registeruser(11);
		kid.requestVotingNumber();
		System.out.println("\n");
		Adult adult=new Adult();
		adult.registeruser(30);
		adult.requestVotingNumber();
	}

}
