package Week7;

public class ScoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        int prevScore = scores[0];

        for(int i : scores){
            if(i < prevScore){
                return false;
            }
            prevScore = i;
        }

        return true;
    }

}
