package array;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Aniket", 11, 90);
		Student s2=new Student("Vijay", 13, 80);
		Student s3=new Student("Sanket", 34, 70);
		Student s4=new Student("Omkar", 31, 84);
		Student s5=new Student("Mayur", 44, 87);
		Student s[]= {s1,s2,s3,s4,s5};
		
		for(int i=0; i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].marks<s[j].marks) {
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
			for (Student student : s) {
				System.out.println(student);
			}
		}
	}
	
	

}
