package firstpack;

/**
 * Created by sanjaysaha on 10/31/16.
 */
public class AccessObjectOne {
    public String publicString = "public string";
    private String privateString = "private string";
    protected String protectedString = "protected string";

    public void access() {
        System.out.println(publicString);
        System.out.println(privateString);
        System.out.println(protectedString);
    }

    public  String getPrivateString() {
        return this.privateString;
    }
}
