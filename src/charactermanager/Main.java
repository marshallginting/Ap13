package charactermanager;

import charactermanager.model.Character;
import charactermanager.model.CharacterType;
import charactermanager.view.MainWindow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            List<Character> characterList = new ArrayList<>();
            characterList.add(new Character("Arthur", CharacterType.WARRIOR, 6, 50));
            characterList.add(new Character("Merlin", CharacterType.MAGE, 3, 50));
            characterList.add(new Character("Legolas", CharacterType.ARCHER, 7, 50));
            characterList.add(new Character("Ezio", CharacterType.ROGUE, 1, 50));
            characterList.add(new Character("Gandalf", CharacterType.MAGE, 5, 50));
            characterList.add(new Character("Lancelot", CharacterType.WARRIOR, 2, 50));

            MainWindow window = new MainWindow(characterList);
            window.setVisible(true);
        });
    }
}