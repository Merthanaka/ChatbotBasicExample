package org.example;
import com.google.code.chatterbotapi.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ChatterBotFactory factory = new ChatterBotFactory();
        ChatterBot bot2 = factory.create(ChatterBotType.PANDORABOTS, "b0dafd24ee35a477");
        ChatterBotSession bot2session = bot2.createSession();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bot: Hi, how can I help you?");
        while (true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();
            if ("exit".equalsIgnoreCase(userMessage)) {
                System.out.println("Bot: Exiting the conversation. Goodbye!");
                break;
            }
            String response2 = bot2session.think(userMessage);
            System.out.println("Bot2: " + response2);
        }
        scanner.close();
    }
}
