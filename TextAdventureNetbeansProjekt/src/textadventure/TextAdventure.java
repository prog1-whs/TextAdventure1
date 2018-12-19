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
public class TextAdventure extends OutputHelperStatic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, StoryPoint> story = Story.constructStory();
        
        InputHelper input = new InputHelper();
        
        Player player = Player.createPlayer(input);
        
        String next = "Hello World";
        do {
            StoryPoint point = story.get(next);
            
            next = point.execute(player, input, null);
        } while (!next.equals("") && story.containsKey(next));
        
        writeln("No new valid storypoint: \"" + next + "\" . Exiting.");
    }
}
