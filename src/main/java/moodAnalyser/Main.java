package moodAnalyser;

public class Main {
    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood());
    }
}
