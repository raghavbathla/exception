package moodAnalyser;

public class MoodAnalyser {
    private String mood;

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    public MoodAnalyser() {

    }

    public String analyseMood() {

        try {
            if (mood.equals("I am in sad Mood")) {
                return "SAD";
            } else if(mood.equals("I am in happy Mood")) {
               return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
return "";
    }
}
