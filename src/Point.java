
public class Point {
	private int x, y; //���� x,��ǥ y��ǥ
	
	public Point() {
		
		this.x = 0;
		this.y = 0;
	}	
	

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	



	public void set(int x, int y) { // setter �޼���
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");//(x,y) ���		
	}
	 
}
