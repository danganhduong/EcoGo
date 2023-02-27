import java.util.HashMap;

public class UserAndPassword
{
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	UserAndPassword() {
		logininfo.put("fabuwood", "Welcome1");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
