
public class ColorTV extends TV{
	int colors;
	

	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;		
	}
	
	public void printProperty() {
		System.out.print(getSize() + "��ġ " + colors + "�÷�");
	}
	//32��ġ 1024�÷�
}
