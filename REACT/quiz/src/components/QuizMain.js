import React, {Component} from 'react';
import Question from './question/Questions';
import Answer from './answer/Answer';

export default class Quiz extends Component {

    // initiating the local state
    state = {


        quiestions: {
            1:  '1.   JAVA SCRIPT IS',
            2:  '2.    Jit full form _',
            3:  '3.    _ is Class based components',
            4:  '4.    Function based Component are_'
        },
        answers: {
            1: {
                1: 'A.Dynamic typed language',
                2: 'B.static typed language'
            
            },
            2: {
                1: 'A.just-in-time',
                2: 'B.java-in-time'
                
            },
            3: {
                1: 'A.Constructor',
                2: 'B.State'
            
            },
            
            4: {
                1: 'A.Statefull',
                2: 'B.Stateless'
            
            },

        },
        correctAnswers: {
            1: '1',
            2: '1',
            3: '2',
            4: '2',
        },
        correctAnswer: 0,
        clickedAnswer: 0,
        step: 1,
        score: 0
    }

    // the method that checks the correct answer
    checkAnswer = answer => {
        const { correctAnswers, step, score } = this.state;
        if(answer === correctAnswers[step]){
            this.setState({
                score: score + 1,
                correctAnswer: correctAnswers[step],
                clickedAnswer: answer
            });
        }else{
            this.setState({
                correctAnswer: 0,
                clickedAnswer: answer
            });
        }
    }

    // method to move to the next question
    nextStep = (step) => {
        this.setState({
            step: step + 1,
            correctAnswer: 0,
            clickedAnswer: 0
        });
    }

    render(){
        let { quiestions, answers, correctAnswer, clickedAnswer, step, score } = this.state;
        return(
            <div className="Content">
                {step <= Object.keys(quiestions).length ? 
                    (<>
                        <Question
                            question={quiestions[step]}
                        />
                        <Answer
                            answer={answers[step]}
                            step={step}
                            checkAnswer={this.checkAnswer}
                            correctAnswer={correctAnswer}
                            clickedAnswer={clickedAnswer}
                        />
                        <button
                        className="NextStep"
                        disabled={
                            clickedAnswer && Object.keys(quiestions).length >= step
                            ? false : true
                        }
                        onClick={() => this.nextStep(step)}>Next</button>
                    </>) : (
                        <div className="finalPage">
                            <h1>    You have completed the quiz!   </h1>
                                  <p>Your score is: {score} of {Object.keys(quiestions).length}</p>
                                       <p>Thank you!</p>
                        </div>
                    )
                }
            </div>
        );
    }
}