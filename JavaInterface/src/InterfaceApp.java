//Interface란 Class 를 규정하여 같은 양식을 강제로 사용하도록 하게 제약을 걸어주는 것이다. implements
interface Calculable{
	//method의 경우는 실제 들어가는 값을 구현 하지 않고 class에서 구현하지만, variable의 경우는 값을 정의 하고 클레스에서 정의 하지 않아도 됨.
	double PI=3.14;
	int sum(int v1, int v2);
}
interface Printavle{
	void print();
}
//하나의 class 에 여래개의 interface 구현 가능
class RealCal implements Calculable,Printavle{
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!!");
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		RealCal c= new RealCal();
		System.out.println(c.sum(2,1));
		c.print();
		System.out.println(c.PI);
	}

}
