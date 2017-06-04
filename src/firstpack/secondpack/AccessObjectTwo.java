package firstpack.secondpack;

/**
 * Created by sanjaysaha on 10/31/16.
 */
public class AccessObjectTwo {
    public String publicString = "public string";
    private String privateString = "private string";
    protected String protectedString = "protected string";

    public String getPublicString() {
        return publicString;
    }

    public void setPublicString(String publicString) {
        this.publicString = publicString;
    }

    public String getPrivateString() {
        return privateString;
    }

    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }

    public String getProtectedString() {
        return protectedString;
    }

    public void setProtectedString(String protectedString) {
        this.protectedString = protectedString;
    }
}
