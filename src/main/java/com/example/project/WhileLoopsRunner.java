package com.example.project;


public class WhileLoopsRunner{

    public static void main(String[] args) {
        //manually test here 
        System.out.println(WhileLoops.countEvensUpTo(1));
        System.out.println(WhileLoops.countEvensUpTo(2));
        System.out.println(WhileLoops.countEvensUpTo(6));
        System.out.println(WhileLoops.countEvensUpTo(10));
        System.out.println(WhileLoops.digitSum(0));
        System.out.println(WhileLoops.digitSum(7));
        System.out.println(WhileLoops.digitSum(123));
        System.out.println(WhileLoops.digitSum(4098));
        System.out.println(WhileLoops.digitSum(199));

        System.out.println(WhileLoops.countDownBy(7,10));

        System.out.println(WhileLoops.countDownBy(0,5));
        System.out.println(WhileLoops.countDownBy(4,6));
        System.out.println(WhileLoops.weeksToReachGoal(10,10,40));
        System.out.println(WhileLoops.weeksToReachGoal(60,10,40));
        System.out.println(WhileLoops.weeksToReachGoal(100,20,110));
        System.out.println(WhileLoops.minutesUntilDead(15,10));
        System.out.println(WhileLoops.minutesUntilDead(0,10));
        System.out.println(WhileLoops.minutesUntilDead(5,10));
    }
}