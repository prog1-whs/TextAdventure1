/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.HashMap;

/**
 *
 * @author fabiansturm
 */
public class HelloWorld extends StoryPoint {

    @Override
    String name() {
        return "Hello World"; 
    }

    @Override
    String execute(Player player, InputHelper input, HashMap<String, String> opts) {
        String answer = input.questionSet("Left or right?", new String[]{"left", "right"});
        writeln("You answered " + answer + ".");
        
        
        
        
        
        
        
        return "Hello World";
    }
    
}
