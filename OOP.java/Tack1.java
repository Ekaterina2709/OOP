import java.util.ArrayList;

public class Tack1 {
    public static void main(String[] args){
        ArrayList<BaseHero> farmer = new ArrayList<>();
        String[] farmerNames = {"Фермер 1", "Фермер 2", "Фермер 3", "Фермер 4", "Фермер 5"};
        for (String name: farmerNames){
            farmer.add(new Farmer(name));       }
        for (BaseHero character: farmer){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> mage = new ArrayList<>();
        String[] mageNames = {"Маг 1", "Маг 2", "Маг 3", "Маг 4", "Маг 5"};
        for (String name: mageNames){
            mage.add(new Mage(name));
        }
        for (BaseHero character: mage){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {"Монах 1", "Монах 2", "Монах 3", "Монах 4", "Монах 5"};
        for (String name: monkNames){
            monk.add(new Monk(name));
        }
        for (BaseHero character: monk){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> rogue = new ArrayList<>();
        String[] rogueNames = {"Разбойник 1", "Разбойник 2", "Разбойник 3", "Разбойник 4", "Разбойник 5"};
        for (String name: rogueNames){
            rogue.add(new Rogue(name));
        }
        for (BaseHero character: rogue){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {"Снайпер 1", "Снайпер 2", "Снайпер 3", "Снайпер 4", "Снайпер 5"};
        for (String name: sniperNames){
            sniper.add(new Sniper(name));
        }
        for (BaseHero character: sniper){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> spearman = new ArrayList<>();
        String[] spearmanNames = {"Копейщик 1", "Копейщик 2", "Копейщик 3", "Копейщик 4", "Копейщик 5"};
        for (String name: spearmanNames){
            spearman.add(new Spearman(name));
        }
        for (BaseHero character: spearman){
            System.out.println(character);
        }
        System.out.println("=================");

        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        String[] crossbowmanNames = {"Арбалетчик 1", "Арбалетчик 2", "Арбалетчик 3", "Арбалетчик 4", "Арбалетчик 5"};
        for (String name: crossbowmanNames){
            crossbowman.add(new Crossbowman(name));
        }
        for (BaseHero character: crossbowman){
            System.out.println(character);
        }
        System.out.println("=================");
    }
}
