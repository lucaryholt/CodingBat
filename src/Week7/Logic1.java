package Week7;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(!isWeekend){
            return cigars >= 40 && cigars <= 60;
        }
        return cigars >= 40;
    }

    public int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2){
            return 0;
        } else if(you >= 8 || date >= 8){
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(!isSummer){
            return temp >= 60 && temp <= 90;
        }
        return temp >= 60 && temp <= 100;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 80;
        int noTicket = 60;

        if(isBirthday){
            ticket = ticket + 5;
            noTicket = noTicket + 5;
        }

        if(speed <= noTicket){
            return 0;
        } else if(speed >= noTicket && speed <= ticket){
            return 1;
        }
        return 2;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <= 19){
            return 20;
        }
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if(!vacation){
            if(day >= 1 && day <= 5){
                return "7:00";
            }
            return "10:00";
        }
        if(day >= 1 && day <= 5){
            return "10:00";
        }
        return "off";
    }

    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if(!outsideMode){
            return n >= 1 && n <= 10;
        }
        return n <= 1 || n >= 10;
    }

    public boolean specialEleven(int n) {
        return n % 11 == 1 || n % 11 == 0;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if(n % 3 == 0 && n % 5 == 0){
            return false;
        } else if(n % 3 == 0 || n % 5 == 0){
            return true;
        }
        return false;
    }

    public boolean less20(int n) {
        return n % 20 == (20 - 1) || n % 20 == (20 - 2);
    }

    public boolean nearTen(int num) {
        return num % 10 == 1 || num % 10 == 2 || num % 10 == (10 - 1) || num % 10 == (10 - 2) || num % 10 == 0;
    }

    public int teenSum(int a, int b) {
        int sum = a + b;
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        }
        return sum;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning){
            return !isAsleep && isMom;
        }
        return !isAsleep;
    }

    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5){
            return 0;
        } else if(tea / candy >= 2 || candy / tea >= 2){
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        String str0 = str.toLowerCase();
        if(str0.startsWith("f") && str0.endsWith("b")){
            return "FizzBuzz";
        } else if(str0.startsWith("f")){
            return "Fizz";
        } else if(str0.endsWith("b")){
            return "Buzz";
        }
        return str;
    }

}
