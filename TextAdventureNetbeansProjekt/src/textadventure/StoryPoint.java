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
public abstract class StoryPoint extends OutputHelper {
    abstract String name();
    abstract String execute(Player player, InputHelper input, HashMap<String, String> opts);
}
