package moodAnalyser;

public class MoodAnalyser {
    private String mood;

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    public MoodAnalyser() {

    }

    public String analyseMood() throws MoodAnalysisException {

        try {
            if(mood==null){
                throw new  MoodAnalysisException("Value cannot be null");
            }
            if (mood.equals("I am in sad Mood")) {
                return "SAD";
            }
            if(mood.equals("I am in happy Mood")) {
               return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "Happy";
        }
return "";
    }
}
