package createCharacter;

import java.util.Scanner;
import createCharacter.Character;

public class CharacterController {

    public static void getCharakter() {
        Character character = new Character();
        character.setName("test");
        System.out.println(character.getName());
    }
}
