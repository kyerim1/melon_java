package homeProduct;

public class Tv extends House {
	
	private int channel =10; //ä��
	private int vol=5; // �Ҹ�
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	protected Tv(){ // ������ �޼���
		super();
	}
	//�Ű����� �ִ� ������ �޼���
	public Tv(String brand, int price){
		super(brand, price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
	}
	
	public void channelUp() {
		this.channel++;
	}
	void channelDown() {
		this.channel--;
	}
	
	@Override
	public void power( ) {
		super.onOff = !super.onOff;
		System.out.println( "TV ���� : "+super.onOff);
	}
	
}
//  �����ε��� -  ���ο� �޼��带 �����ϴ°�
//  �������̵���  - ������ �޼��带 ������ �ϴ°�

// 
// �������̵� ����
// �θ�Ŭ������ �ش� �޼��尡 �����ؾ��Ѵ�.
// �������̵� �޼���� �ݵ�� ��ȯŸ�� , �޼��� �̸�, �Ű����� ��� �Ȱ���
//  �ۼ��ؾ��Ѵ�.  
//  �޼����� { } ������ �޶� �ȴ�.








