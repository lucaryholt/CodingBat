package Week6;

public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public String extraEnd(String str) {
        String s = str.substring((str.length() - 2), str.length());
        return s + s + s;
    }

    public String firstTwo(String str) {
        if(str.length() < 2){
            return str.substring(0, str.length());
        }

        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    public String withoutEnd(String str) {
        return str.substring(1, (str.length() - 1));
    }

}
