package homeProduct;

public class Aircon extends House{
	
	static final String[] windText= {"��","��","��"};
	
	int wind=0; //�ٶ�����
	int temperature;
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand,price);
	}
	
	void tempUP() {
		this.temperature++;
	}
	void tempDOWN() {
		this.temperature--;
	}
	
	void windControl() {
		this.wind++;
		if(wind == windText.length ) wind=0; 
		System.out.println("���� �ٶ����� : "+ windText[wind]);
	}
	
	@Override
	void power() {
		super.onOff = !super.onOff;
		System.out.println( "������ ���� : "+super.onOff);
	}
	
}






