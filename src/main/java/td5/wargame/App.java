package td5.wargame;

public class App {

        public static void main(String[] args) {
            Unite a = new Soldat();
            Unite b = new Char();
            Unite c = new Helicoptere();

            a.seDeplacer();
            a.combattre();

            b.seDeplacer();
            b.combattre();

            c.seDeplacer();
            c.combattre();
        }
}
