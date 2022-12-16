package strings;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println(sb);
		
		sb.append(" world");
		System.out.println(sb);
		
		sb.insert(0, "a");
		System.out.println(sb);
		
		sb.replace(0, 3, "***");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.charAt(0));
		
		//newCapacity =(old capacity*2)+2
	
	}

}
