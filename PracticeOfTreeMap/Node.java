package PracticeOfTreeMap;

public class Node {
	Node left;
	Node right;
	String value;
	int key;

	public Node(int key, String value) {
		left = null;
		right = null;
		this.key = key;
		this.value = value;
	}
}
