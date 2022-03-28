
public class ColorPoint extends Point {//Point 클래스를 상속 받음
	
	private String color;//점의 색
	
	
	
	public ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {//setter 메서드
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();//Point 클래스의 showPoint 메서드 호출
		
	}
}
