import java.util.ArrayList;

public class Healers extends BaseHero {
    int mana;

    public Healers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, role,  attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString(){
    return super.toString () + ", Mana";
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
       double max = 0;
       int maxi = 0;
       for (int i=0; i< heroList.size(); i++){
        // String[] params = heroList.get(i).getInfo().split(" : ");
        // if(Integer.parseInt(params[1]) != Integer.parseInt(params[2])){
        //     double temp =  Double.parseDouble(params[2])/Double.parseDouble(params[2]) *100;(не работает подсчет процента ни со сплитом ни на прямую)
        if(maxhealth != health){
            double temp =  health / maxhealth *100;
            if (temp> max){
                max=temp;
                maxi = i;
            }
        }
       }
       System.out.println("Урон мах" + max +"ind игрока"+ maxi);
    }

    
}   
