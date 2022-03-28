
public class IPTV extends ColorTV{
	private String ip;

	public IPTV(String ip, int size, int colors) {
		super(size, colors);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
		super.printProperty();//부모 클래스의 메서드 호출
	}
	//나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
}
