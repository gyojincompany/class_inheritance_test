
public class ColorPoint extends Point {//Point Ŭ������ ��� ����
	
	private String color;//���� ��
	
	
	
	public ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {//setter �޼���
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();//Point Ŭ������ showPoint �޼��� ȣ��
		
	}
}
