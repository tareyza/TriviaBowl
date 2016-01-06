package com.jerryandjared.triviabowl;

/**
 * Created by quchen on 12/22/2015.
 */
public class Room {

    int latency;
    int numberOfTeams;
    int playersPerTeam;
    String roomName;
    boolean canBuzzMultipleTimes;
    int pointsCorrect;
    boolean speedPointsEnabled;
    boolean bonusQuestionsEnabled;
    int bonusPointsCorrect;
    int questionIndex = 0;
    QuestionList questions;

    public Room(int latency,
                int numberOfTeams,
                int playersPerTeam,
                String roomName,
                boolean canBuzzMultipleTimes,
                int pointsCorrect,
                boolean speedPointsEnabled,
                boolean bonusQuestionsEnabled,
                int bonusPointsCorrect){

    }

    public void addQuestionList(QuestionList qList){
        questions = qList;
    }

    public Question readNextQuestion(){
        return new Question();
    }
}
