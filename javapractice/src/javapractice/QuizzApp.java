package javapractice;
import java.util.Scanner;

public class QuizzApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Questions, options, and answers
	        String[] questions = {
	                "1. What is the capital of France?",
	                "2. Which language is used for Android development?",
	                "3. Who developed Java programming language?",
	                "4. Which data structure uses FIFO (First In First Out)?",
	                "5. Which company owns GitHub?"
	        };

	        String[][] options = {
	                {"a) Berlin", "b) Madrid", "c) Paris", "d) Rome"},
	                {"a) Java", "b) Python", "c) Swift", "d) C"},
	                {"a) Dennis Ritchie", "b) James Gosling", "c) Bjarne Stroustrup", "d) Guido van Rossum"},
	                {"a) Stack", "b) Queue", "c) Linked List", "d) Tree"},
	                {"a) Microsoft", "b) Google", "c) Amazon", "d) Meta"}
	        };

	        char[] answers = {'c', 'a', 'b', 'b', 'a'}; // correct answers
	        int score = 0;

	        System.out.println("===== Welcome to the Quiz Application =====");
	        System.out.println("Rules: Type only a, b, c, or d\n");

	        // Loop through questions
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println(questions[i]);
	            for (String option : options[i]) {
	                System.out.println(option);
	            }

	            System.out.print("Your answer: ");
	            char userAns = sc.next().toLowerCase().charAt(0);

	            if (userAns == answers[i]) {
	                System.out.println("✅ Correct!\n");
	                score++;
	            } else {
	                System.out.println("❌ Wrong! Correct answer is: " + answers[i] + "\n");
	            }
	        }

	        System.out.println("===== Quiz Over =====");
	        System.out.println("Your Score: " + score + "/" + questions.length);

	        if (score == questions.length) {
	            System.out.println("🎉 Excellent! You got all correct.");
	        } else if (score >= 3) {
	            System.out.println("👍 Good Job!");
	        } else {
	            System.out.println("😢 Better luck next time!");
	        }

	        sc.close();
	    }
	}



