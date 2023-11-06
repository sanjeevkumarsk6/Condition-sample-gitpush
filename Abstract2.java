package Abstract;

public class Abstract2 extends Abstract1{

	@Override
	public void login() {
		System.out.println("sanjeev");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void password() {
		System.out.println(12345);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Abstract2 a=new Abstract2();
		a.login();a.password();
		a.student();a.studentrank(); 
	}
	

}
