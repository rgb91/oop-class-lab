package introduction;

public class ScopeTest {
	public static void main(String args[]) {
		int x = 10;
		{
			x = 0; // NOT int x = 0;
		}
	}
}