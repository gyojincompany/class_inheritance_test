
public class IPTV extends ColorTV{
	private String ip;

	public IPTV(String ip, int size, int colors) {
		super(size, colors);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.print("���� IPTV�� " + ip + "�ּ��� ");
		super.printProperty();//�θ� Ŭ������ �޼��� ȣ��
	}
	//���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�
}
