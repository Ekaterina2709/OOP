public class Rogue extends BaseHero {

    public Rogue(String name, String role, int attack, int defence, int[] damage, int health, int speed) {
        super(name, role, attack, defence, damage, health, speed);   
    }
    
    public Rogue (String name){
        super(name, "Разбойник", 8, 3, new int[] {2,4}, 10, 6);
    }


}
