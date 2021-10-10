package moodAnalyser;

public class Main {
    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("");
        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in sad Mood");
        MoodAnalyser moodAnalyser3 = new MoodAnalyser("I am in happy Mood");
        System.out.println(moodAnalyser.analyseMood());
        System.out.println(moodAnalyser1.analyseMood());
        System.out.println(moodAnalyser2.analyseMood());
        System.out.println(moodAnalyser3.analyseMood());

    }
}
