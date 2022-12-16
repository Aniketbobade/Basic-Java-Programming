package voteapp;

public interface VotingApp {
	void registeruser(int age);
	void requestVotingNumber();
	
	default void show()
	{
		System.out.println("hi");
	}
}
