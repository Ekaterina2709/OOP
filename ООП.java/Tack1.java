import java.util.ArrayList;
import java.util.Random;

public class Tack1 {
    public static void main(String[] args){
        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        Random random = new Random();
        generateHeroes(heroesOne,10,random, 1);
        generateHeroes(heroesTwo,10,random, 2);
        System.out.println(heroesOne);
        heroesOne.forEach(n -> System.out.print(n.getInfo()+","));
        heroesOne.get(0).step(heroesOne);
        System.out.println();
        System.out.println("=================");
        System.out.println(heroesTwo);
        heroesTwo.forEach(n -> System.out.print(n.getInfo()+","));
        heroesTwo.get(0).step(heroesTwo);
       
    }

    private static void generateHeroes (ArrayList<BaseHero> heroList, int quantity, Random random, int mode) {
        String[] namesList = {"Август", "Аглай", "Амос", "Вивиан", "Галактион", "Дионис", "Епифан", "Евстахий", "Зенон", "Илиодор", "Исидор", "Калисфен", "Киприан", "Ливерий", "Ларион", "Миней", "Мардарий", "Нифон", "Октавиан", "Орест", "Прокул", "Парамон", "Рувим", "Софрон", "Стахий", "Флегонт", "Хрисанф", "Элим", "Юст"};
        int namesSize = namesList.length;
        for(int i=0; i < quantity; i++){
            int type = random.nextInt(5);
            if (mode == 1){
                switch(type){
                    case 0 -> heroList.add(new Farmer(namesList[random.nextInt(namesSize)]));
                    case 1 -> heroList.add(new Rogue(namesList[random.nextInt(namesSize)]));
                    case 3 -> heroList.add(new Sniper(namesList[random.nextInt(namesSize)]));
                    case 4 -> heroList.add(new Mage(namesList[random.nextInt(namesSize)]));
                }
            }else{
                switch(type){
                    case 0 -> heroList.add(new Crossbowman(namesList[random.nextInt(namesSize)]));
                    case 1-> heroList.add(new Monk(namesList[random.nextInt(namesSize)]));
                    case 2-> heroList.add(new Spearman(namesList[random.nextInt(namesSize)]));
                    case 3 -> heroList.add(new Farmer(namesList[random.nextInt(namesSize)]));
            }    

            }
        }

    }
    
    
}
