
public class Point {
	private int x, y; //점의 x,좌표 y좌표
	
	public Point() {
		
		this.x = 0;
		this.y = 0;
	}	
	

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	



	public void set(int x, int y) { // setter 메서드
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");//(x,y) 출력		
	}
	 
}
