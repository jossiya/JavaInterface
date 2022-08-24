//Interface란 Class 를 규정하여 같은 양식을 강제로 사용하도록 하게 제약을 걸어주는 것이다. implements
interface Calculable{
	int sum(int v1, int v2);
}
class RealCal implements Calculable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	
}
public class InterfaceApp {

	public static void main(String[] args) {
		RealCal c= new RealCal();
		System.out.println(c.sum(2,1));
	}

}
