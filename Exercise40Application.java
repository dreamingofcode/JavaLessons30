package com.example.learnJava;
import java.io.PrintWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise40Application {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(Exercise40Application.class, args);
		PrintWriter fileout = new PrintWriter("receipt.txt");

		fileout.println("+---------------------------------+");
		fileout.println("|     CORNER STORE RECIEPT        |");
		fileout.println("|                                 |");
		fileout.println("|                                 |");
		fileout.println("| 2014-05-25          04:38PM     |");
		fileout.println("|                                 |");
		fileout.println("| Gallons:             12.464     |");
		fileout.println("| Price/gallon:        $ 3.234    |");
		fileout.println("|                                 |");
		fileout.println("|                                 |");
		fileout.println("| Fuel total:          $ 43.11    |");
		fileout.println("|                                 |");
		fileout.println("+---------------------------------+");
		fileout.close();

	}

}




