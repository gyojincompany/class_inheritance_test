
public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person ps = new Student("홍길동");//업캐스팅
//		Person ps = new Worker("홍길동");//업캐스팅
//		Person ps = new Soldier("홍길동");//업캐스팅
//		Person ps = new Teacher("홍길동");//업캐스팅
		
//		p = s;//업캐스팅
////		s = p;
//		System.out.print(p.name);
		Student s = (Student)ps;//다운캐스팅
		
		System.out.print(s.name);
		
		
		
	}

}
