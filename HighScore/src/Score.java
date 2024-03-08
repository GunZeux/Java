public class Score {
    public static void main(String[] args) {
        displayHighScore("Mathew", calvulateHighScorePosition(1500));
        displayHighScore("Gunzeux", calvulateHighScorePosition(1000));
        displayHighScore("Bala", calvulateHighScorePosition(500));
        displayHighScore("DHannush", calvulateHighScorePosition(200));
        displayHighScore("james", calvulateHighScorePosition(25));
    }

    public static int calvulateHighScorePosition(int n){
        if(n>=1000)return 1;
        else if(n>=500) return 2;
        else if(n>=100) return 3;
        else return 4;
    }

    public static void displayHighScore(String name, int n){
        System.out.println(name + " managed to get into position "+n+ " on the score list");
    }
}
