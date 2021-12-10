package ss8_clean_code_va_refectoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score = "";
        int tempScore;
        boolean conditionOne = mScore1 >= 4;
        boolean conditionTwe = mScore2 >= 4;
        if (mScore1 == mScore2)
        {
            switch (mScore1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (conditionOne || conditionTwe) {
            score = getString(mScore1, mScore2);
        } else {
            score = getConnect(mScore1, mScore2, score);
        }
        return score;
    }


    // Phương thức ghi điểm
    private static String getConnect(int mScore1, int mScore2, String score) {
        int tempScore;
        for (int index = 1; index < 3; index++) {
            if (index == 1) tempScore = mScore1;
            else { score = score + "-"; tempScore = mScore2;}
            switch(tempScore) {
                case 0:
                    score = score +  "Love";
                    break;
                case 1:
                    score = score + "Fifteen";
                    break;
                case 2:
                    score = score + "Thirty";
                    break;
                case 3:
                    score = score + "Forty";
                    break;
                }
            }
        return score;
    }



    // Phương thức tính điểm lợi thế và tính người thắng
    private static String getString(int mScore1, int mScore2) {
        String score;
        int minusResult = mScore1 - mScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
