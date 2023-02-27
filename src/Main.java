
public class Main
{
	public static void main(String[] args) {
		
		UserAndPassword userandPassword = new UserAndPassword();
				
		LoginPage loginPage = new LoginPage(userandPassword.getLoginInfo());
		
		
	}
}
