package TreeMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTreeMap map = new MyTreeMap();
		
		map.add(10, "ten");
		map.add(15, "fifteen");
		map.add(20, "tewnty");
		map.add(7, "seven");
		map.add(3, "three");
		map.add(4, "four");
		map.add(8, "eight");
		
		//map.print();
		
		//System.out.println(map.toString());
		
		//System.out.println(map.get(3));
		//System.out.println(map.containsValue("four"));
		//System.out.println(map.containsKey(7));
		
		System.out.println(map.replace(7, "Shubham"));
		//System.out.println(map.toString());
		
		System.out.println(map.keySet());
		
		//System.out.println(map.isEmpty());
		
		//System.out.println(map.clear());

	}

}
