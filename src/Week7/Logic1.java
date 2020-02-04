package Week7;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(!isWeekend){
            return cigars >= 40 && cigars <= 60;
        } else {
            return cigars >= 40;
        }
    }

    public int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2){
            return 0;
        } else if(you >= 8 || date >= 8){
            return 2;
        }
        return 1;
    }



}
