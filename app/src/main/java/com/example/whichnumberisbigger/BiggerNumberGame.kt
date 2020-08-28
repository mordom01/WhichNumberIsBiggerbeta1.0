package com.example.whichnumberisbigger

//POKO plain old kotlin object?
// no android things in it, portable

class BiggerNumberGame(val lowerLimit : Int, val upperLimit : Int) {
    var leftNumber= 0
    var rightNumber = 0
    var score = 0

    //init block gets run one  time when the object is constructed
    //usually used for complex operations to set the initial state of the object
    init{
        generateRandomNumbers()
    }

    // need a function to generate the random numbers
    fun generateRandomNumbers(){
        // give two unique numbers btw the upper and lower limits inclusive
        leftNumber = (Math.random() * (upperLimit - lowerLimit) + lowerLimit + 1).toInt()
        rightNumber = (Math.random() * (upperLimit - lowerLimit) + lowerLimit + 1).toInt()
        while (leftNumber == rightNumber){
            leftNumber = (Math.random() * (upperLimit - lowerLimit) + lowerLimit + 1).toInt()
        }
    }

    // need a function to check the answer, update the score, and return a message
    // accept an int parameter called answer and returned a string
    // public String checkAnswer(int answer)
    // in kotlin
    // fun methodName(paramVar : paramType) : returnType
    fun checkAnswer(answer : Int) : String{
        //decide if the answer was bigger or not
        //adjust the score accordingly
        //return a message for the MainActivity to Toast
        if(answer == leftNumber && answer > rightNumber){
            score ++
            return("You rock star!")
        }
        else if(answer == rightNumber && answer > leftNumber){
            score ++
            return("Right side yields the right answer!")
        }
        else{
            score--
            return("Back to 1st grade!")
        }
    }
}