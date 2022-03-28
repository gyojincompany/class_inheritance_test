
public class ColorTV extends TV{
	int colors;
	

	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;		
	}
	
	public void printProperty() {
		System.out.print(getSize() + "인치 " + colors + "컬러");
	}
	//32인치 1024컬러
}
