//Interface란 Class 를 규정하여 같은 양식을 강제로 사용하도록 하게 제약을 걸어주는 것이다. implements
interface Calculable{
	//method의 경우는 실제 들어가는 값을 구현 하지 않고 class에서 구현하지만, variable의 경우는 값을 정의 하고 클레스에서 정의 하지 않아도 됨.
	double PI=3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
//하나의 class 에 여래개의 interface 구현 가능
class RealCal implements Calculable,Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!!");
	}
}
class AdvancedPrint implements Printable{
	public void print() {
		System.out.println("This is Print!!!");
	}
	
}
public class InterfaceApp {
	public static void main(String[] args) {
		RealCal c= new RealCal();
		System.out.println(c.sum(2,1));
		c.print();
		System.out.println(c.PI);
		
		//다형성!!!!
		//Interface 를 타입으로 줄 수 있으며 Interface에 제약된 클레스의 기능 만 사용 할 수 있다. 다른 기능늘은 숨겨짐. 호환성 보장
		Printable p=new AdvancedPrint();
		p.print();
	}

}
