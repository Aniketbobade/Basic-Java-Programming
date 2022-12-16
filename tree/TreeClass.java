package tree;

public class TreeClass {
	Node root;

	void MyAdd(int data) {
		if (root==null) {
			root=new Node(data);
		}
		else {
			Node temp=root;
			while(true) {
				if(data==temp.data) {
					temp.data=data;
					return;
				}else if(data<temp.data) {
					if(temp.left==null) {
						temp.left=new Node(data);
						return;
					}else {
						temp=temp.left;
					}
				}
				else {
					if(temp.right==null) {
						temp.right=new Node(data);
						return;
					}
					else {
						temp=temp.right;
					}
				}
			}
		}
	}
	void print() {
		Node temp=root;
		myNodePrint(temp);
	}
	private void myNodePrint(Node temp) {
		// TODO Auto-generated method stub
		if(temp.left!=null)
			myNodePrint(temp.left);
		System.out.println(temp.data);
		if(temp.right!=null)
			myNodePrint(temp.right);
	}
	
}
