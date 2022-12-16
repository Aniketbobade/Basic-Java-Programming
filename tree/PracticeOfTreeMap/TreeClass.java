package PracticeOfTreeMap;

public class TreeClass {
	Node root;

	public void add(int key, String value) {
		if (root == null) 
		{
			 root = new Node(key, value);
		}
		else 
		{
			Node temp = root;
			while (true) {
				if (key == temp.key) {
					temp.value = value;
					return;
				} else if (key < temp.key) {
					if (temp.left == null) {
						temp.left = new Node(key, value);
						return;
					} else {
						temp = temp.left;
					}
				} else {
					if (temp.right == null) {
						temp.right = new Node(key, value);
						return;
					} else {
						temp = temp.right;
					}
				}
			}

		}
	}

	void print() {
		print2(root);
	}

	private void print2(Node temp) {
		// TODO Auto-generated method stub
		if (temp != null) {
			print2(temp.left);
			System.out.println(temp.key + " " + temp.value);
			print2(temp.right);
		}
	}

	public String toString() {
		String s = "[";
		s = toString2(root, s);
		String s1 = "";
		for (int i = 0; i < s.length() - 2; i++) {
			s1 = s1 + s.charAt(i);
		}
		s1 = s1 + "]";
		return s1;

	}

	private String toString2(Node temp, String s) {
		// TODO Auto-generated method stub
		if (temp != null) {
			toString2(temp.left, s);
			System.out.print(temp.key + "=" + temp.value+", ");
			toString2(temp.right, s);
		}
		return s;
	}
	
	public String get(int key) {
		if(root==null) {
			return null;
		}
		else {
			Node temp=root;
			while(true) {
				if(key==temp.key) {
					return temp.value;
				}
				else if(key<temp.key) {
					
				}
			}
		}
		
	}
}
