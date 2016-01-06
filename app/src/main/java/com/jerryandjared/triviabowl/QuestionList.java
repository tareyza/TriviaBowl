package com.jerryandjared.triviabowl;

import java.util.List;

/**
 * Created by quchen on 12/16/2015.
 */
public class QuestionList {

    Question[] questions;
    int index = 0;
    public QuestionList(int numOfQuestions){
        questions=new Question[numOfQuestions];
    }

    public QuestionList(int numOfQs, String[] qCategories, int qType, int[] qDifficulties ){
    //write more logic here once we have a text file format for the questions
        randomizeQuestionOrder();
    }

    public Question getNextQuestion(){
        index++;
        return questions[index-1];
    }

    public void randomizeQuestionOrder(){
        int currentIndex = questions.length;
        int randomIndex;
        Question temporaryValue;
        while(0!=currentIndex){
            randomIndex = (int) Math.floor(Math.random()*currentIndex);
            currentIndex=-1;
            temporaryValue=questions[currentIndex];
            questions[currentIndex]=questions[randomIndex];
            questions[randomIndex]=temporaryValue;
        }
    }
}

