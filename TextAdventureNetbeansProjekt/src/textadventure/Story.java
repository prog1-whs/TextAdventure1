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
public class Story {
    public String start = "Hello World";
    public static HashMap<String, StoryPoint> constructStory() {
        HashMap<String, StoryPoint> story = new HashMap<String, StoryPoint>();
        story.put("Hello World", new HelloWorld());
        
        return story;
    }
    
}
