/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fabiansturm
 */
public class InputHelper {
    public Scanner scanner;
    public BufferedInputStream inputStream;
            
    public InputHelper() {
        scanner = new Scanner(System.in);
        inputStream = new BufferedInputStream(System.in);
    }
    
    public String min1Char() {
        String input = "";
        
        String charRegex = "[a-zA-Z0-9][a-zA-Z0-9-_]+";
        
        
        while (!input.matches(charRegex)) {
            input = scanner.nextLine();
        }
        return input;
    }

    String questionSet(String frage, String[] answers) {
        
        
        String answer = "";
        
        Set<String> answerSet = new HashSet<>(Arrays.asList(answers));
        
        do {
            System.out.print(frage);
            answer = scanner.nextLine();
            if(!answerSet.contains(answer)) {
                System.out.print("\r");
            }
        } while (!answerSet.contains(answer));
        
        return answer;
    }
}
