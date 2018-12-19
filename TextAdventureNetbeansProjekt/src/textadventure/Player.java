/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

/**
 *
 * @author fabiansturm
 */
class Player extends OutputHelperStatic {
    public String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    public static Player createPlayer(InputHelper input) {
        writeln("Hello guys!");
        writeln("Please input your name!");
        String playerName = input.min1Char().replace(" ", "_");
        writeln("Your name is " + playerName + ".");
        return new Player(playerName);
    }
}
