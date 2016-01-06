package com.jerryandjared.triviabowl;

/**
 * Created by quchen on 12/11/2015.
 */
public class Question {

    private String category;
    private String questionText;
    private int type;//0 is multiple choice, 1 is short answer
    private int difficultyInt;
    private String difficultyString;
    private int questionID;
    private String answer;
    private String answerType;
    private int timeLimit;
    //also need image possibly

    public Question(){
    }

    public Question(String categor, String qText, int qType, int difficultInt, String difficultString, int qID, String ans, String ansType, int timeLim){
        category = categor;
        questionText=qText;
        type=qType;
        difficultyInt=difficultInt;
        difficultyString=difficultString;
        questionID=qID;
        answer=ans;
        answerType=ansType;
        timeLimit=timeLim;

    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String cat){
        category = cat;
    }

    public String getQuestionText(){
        return questionText;
    }

    public void setQuestionText(String qText){
        questionText = qText;
    }

    public int getType(){
        return type;
    }

    public void setType(int ty){
        type = ty;
    }

    public int getDifficulty(){return difficultyInt;}

    public void setDifficulty(int diff){
        difficultyInt=diff;
        if(diff==1){
            difficultyString="Easy";
        } else if(diff==2){
            difficultyString="Medium";
        } else if (diff==3){
            difficultyString="Hard";
        } else if (diff==4){
            difficultyString="Very Hard";
        } else if (diff==5){
            difficultyString="Open";
        } else {
            difficultyString="unranked";
        }
    }

    public String getDifficultyString(){return difficultyString;}

    public void setDifficulty(String diff){difficultyString=diff;
        if(diff=="Easy"){
            difficultyInt=1;
        } else if (diff.compareTo("Medium")==0){
            difficultyInt=2;
        } else if (diff.compareTo("Hard")==0){
            difficultyInt=3;
        } else if (diff.compareTo("Very Hard")==0){
            difficultyInt=4;
        } else if (diff.compareTo("Open")==0){
            difficultyInt=5;
        } else if (diff.compareTo("unranked")==0){
            difficultyInt=-1;
        }
    }

    public int getQuestionID(){
        return questionID;
    }

    public void setQuestionID(int qID){
        questionID=qID;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String ans){
        answer=ans;
    }

    public String getAnswerType(){return answerType;}

    public void setAnswerType(String ansType){answerType=ansType;}

    public int getTimeLimit(){return timeLimit;}

    public void setTimeLimit(int tLimit){ timeLimit=tLimit;}
}
