package ss8_Clean_code.exercise.Refactoring;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FOURTY = 3;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstScore, int secondScore) {
        String score = "";
        int tempScore = 0;
        if (firstScore == secondScore) {
            return result(firstScore);
        }

        if (firstScore >= 4||secondScore >= 4) {
            return win(firstScore, secondScore);
        }

        return currentScore(firstScore, secondScore, score);
    }

    public static String result(int firstScore) {
        switch (firstScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FOURTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String win(int firstScore, int secondScore) {
        int minusResult = firstScore - secondScore;
        if (minusResult == 1) {
            return "Advantage player1";
        }

        if (minusResult == -1) {
            return "Advantage player2";
        }

        if (minusResult >= 2) {
            return "Win for player1";
        }

        return "Win for player2";
    }

    public static String currentScore(int firstScore, int secondScore, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstScore;
            else {
                score += "-";
                tempScore = secondScore;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FOURTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
