package testApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.out.println("hello world2");
		//�o�O�s�W�ƾ�
		Math math = new Math();
		System.out.println(math.add(2, 1));
	}

}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}
