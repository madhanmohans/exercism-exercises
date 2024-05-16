package TwoFer;

public class Twofer {
    public String twofer(String name) {
        String result = (name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
        return result;
    }
}