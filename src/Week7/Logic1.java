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





}
