package Abstract;

public class Interface2 implements Interface{

	@Override
	public void login() {
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void password() {
		System.out.println(1234);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Interface2 i=new Interface2();
		i.login();i.password();
	}

}
