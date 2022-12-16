package TreeMap;

public class MyTreeMap {
Node root;
	
	public void add(int key, String value)
	{
		if(root == null)
		{
			root = new Node(key , value);
		}
		else
		{
			Node temp = root;
			
			while(true)
			{
				if(key == temp.key)
				{
					temp.value = value;
					return;
				}
				else if(key < temp.key)
				{
					if(temp.left == null)
					{
						temp.left = new Node(key, value);
						return;
					}
					else
					{
						temp = temp.left;
					}
				}
				else
				{
					if(temp.right == null)
					{
						temp.right = new Node(key, value);
						return;
					}
					else
					{
						temp = temp.right;
					}
				}
			}
		}
	}
	
	void print()
	{
		print2(root);
	}

	private void print2(Node temp)
	{
		if(temp != null) 
		{
			print2(temp.left);
			System.out.println(temp.key +" "+temp.value);
			print2(temp.right);
		}
	}
	
	public String toString()
	{
		String s="{";
		
		s= toString2(root , s);
		
		String s1 = "";
		for(int i=0;i<s.length()-2;i++)
		{
			s1=s1+s.charAt(i);
		}
		s1=s1+"}";
		return s1;
		
		/*************or********/
		
//		s=s.substring(0, s.length()-2);
//		s=s+"}";
//		return s;
		
	}

	private String toString2(Node temp, String s) 
	{
		if(temp != null)
		{
			s=toString2(temp.left ,s);
			s=s+temp.key+"="+temp.value+", ";
			s=toString2(temp.right, s);
		}
		return s;
	}
	
	public String get(int key)
	{
		if(root == null)
		{
			return null;
		}
		
		Node temp = root;
		
		while(true)
		{
			if(temp.key == key)
			{
				return temp.value;
			}
			else if(key < temp.key)
			{
				if(temp.left == null)
				{
					return null;
				}
				else
				{
					temp = temp.left;
				}
			}
			else
			{
				if(temp.right == null)
				{
					return null;
				}
				else
				{
					temp = temp.right;
				}
			}
		}
	}
	
	public boolean containsValue(String value)
	{
		return containsValue2(root, value);
	}

	private boolean containsValue2(Node temp, String value)
	{
		if(temp != null &&( temp.value.equals(value) || containsValue2(temp.left , value) || containsValue2(temp.right, value) ))
		{
			return true;
		}
		return false;
	}
	
	
	public boolean containsKey(int key)
	{
		if(root == null)
		{
			return false;
		}
		
		Node temp = root;
		
		while(true)
		{
			if(temp.key == key)
			{
				return true;
			}
			else if(key < temp.key)
			{
				if(temp.left == null)
				{
					return false;
				}
				else
				{
					temp = temp.left;
				}
			}
			else
			{
				if(temp.right == null)
				{
					return false;
				}
				else
				{
					temp = temp.right;
				}
			}
		}
	}
	
	
	public String replace(int key, String value)
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			Node temp = root;
			while(true)
			{
				if(key == temp.key)
				{
					String old = temp.value;
					temp.value = value;
					return old;
				}
				else if( key < temp.key)
				{
					if(temp.left == null)
					{
						return null;
					}
					else
					{
						temp=temp.left;
					}
				}
				else
				{
					if(temp.right == null)
					{
						return null;
					}
					else
					{
						temp=temp.right;
					}
				}
			}
		}
	}
	
	public String keySet()
	{
		String s="[";
		
		s= keySet2(root , s);
		
		String s1 = "";
		for(int i=0;i<s.length()-2;i++)
		{
			s1=s1+s.charAt(i);
		}
		s1=s1+"]";
		return s1;
		
		
	}

	private String keySet2(Node temp, String s) 
	{
		if(temp != null)
		{
			s=keySet2(temp.left ,s);
			s=s+temp.key+", ";
			s=keySet2(temp.right, s);
		}
		return s;
	}
	
	
	public boolean isEmpty()
	{
		if(root == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String clear()
	{
		root = null;
		return null;
	}
	

}