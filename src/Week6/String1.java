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
        String s = str.substring((str.length() - 2));
        return s + s + s;
    }

    public String firstTwo(String str) {
        if(str.length() < 2){
            return str;
        }

        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    public String withoutEnd(String str) {
        return str.substring(1, (str.length() - 1));
    }

    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b + a + b;
        }
        return a + b + a;
    }

    public boolean hasBad(String str) {
        if(str.length() < 3) return false;

        if(str.substring(0, 3).equals("bad")) return true;

        if(str.length() < 4) return false;

        if(str.substring(1, 4).equals("bad")) return true;

        return false;
    }

    public String nonStart(String a, String b) {
        return removeFirstLetter(a) + removeFirstLetter(b);
    }

    public String removeFirstLetter(String str){
        return str.substring(1);
    }

    public String left2(String str) {
        String firstTwo = str.substring(0, 2);
        String last = "";
        if(str.length() >= 2){
            last = str.substring(2);
        }

        return last + firstTwo;
    }

    public String right2(String str) {
        String lastTwo = str.substring((str.length() - 2));
        String last = "";
        if(str.length() >= 2){
            last = str.substring(0, (str.length() - 2));
        }

        return lastTwo + last;
    }

    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0, 1);
        }
        return str.substring((str.length() - 1));
    }

    public String withouEnd2(String str) {
        if(str.length() == 0 || str.length() == 1){
            return "";
        }
        return str.substring(1, (str.length() - 1));
    }

    public String middleTwo(String str) {
        return str.substring((str.length() / 2 - 1),(str.length() / 2 + 1));
    }

    public boolean endsLy(String str) {
        return str.length() != 1 && str.length() != 0 && str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        String front = str.substring(0, n);
        String last = str.substring(str.length() - n);

        return front + last;
    }

    public String twoChar(String str, int index) {
        if((str.length() - 2) - index < 0 || index < 0){
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    public String atFirst(String str) {
        if(str.length() == 0){
            return "@@";
        } else if(str.length() == 1){
            return str + "@";
        }
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if(a.length() == 0){
            a = "@";
        }
        if(b.length() == 0){
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if(a.length() == 0 || b.length() == 0){
            return a + b;
        }
        if(a.substring(a.length() - 1).equals(b.substring(0, 1))){
            return a + b.substring(1);
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if(str.length() <= 1){
            return str;
        }
        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length()) + str.substring(str.length() - 2, str.length() - 1);
    }

    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        } else if(str.startsWith("blue")){
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String minCat(String a, String b) {
        if(a.length() == b.length()){
            return a + b;
        } else if(a.length() < b.length()){
            return a + b.substring(b.length() - a.length());
        }
        return a.substring(a.length() - b.length()) + b;
    }

    public String extraFront(String str) {
        String s = "";
        if(str.length() < 2){
            s = str;
        } else{
            s = str.substring(0, 2);
        }
        return s + s + s;
    }

    public String without2(String str) {
        if(str.length() >= 2 && str.endsWith(str.substring(0, 2))){
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        String first = "";
        String second = "";
        if(str.charAt(0) == 'a'){
            first = "a";
        }
        if(str.charAt(1) == 'b'){
            second = "b";
        }
        return first + second + str.substring(2);
    }

    public String startWord(String str, String word) {
        if(str.length() >= 2 && word.substring(1).equals(str.substring(1, word.length()))){
            return str.substring(0, word.length());
        }
        if(str.length() == 1 && word.length() == 1){
            return str;
        }
        return "";
    }

    public String withoutX(String str) {
        if(str.startsWith("x")){
            str = str.substring(1);
        }
        if(str.endsWith("x")){
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        boolean first = false;
        boolean second = false;
        if(str.length() < 2){
            return "";
        }
        if(str.charAt(0) == 'x') first = true;
        if(str.charAt(1) == 'x') second = true;
        if(first && second){
            return str.substring(2);
        } else{
            if(first){
                return str.substring(1);
            } else if(second){
                return str.substring(0, 1) + str.substring(2);
            }
        }
        return str;
    }
}
