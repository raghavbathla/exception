package moodAnalyser;

public class MoodAnalyser {
    private String mood;

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }
    public MoodAnalyser() {

    }

    public String analyseMood(){
if(mood.equals("I am in sad Mood")){
    return "SAD";

}
else{
    return "HAPPY";
}

    }
}
