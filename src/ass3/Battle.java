package ass3;

import java.util.Random;

public class Battle {
    public static Player tatakai(Player p1,Player p2){
        int i=0;int j=0;

            int hp1, hp2, speed1, speed2, atk1, atk2;
            Pokemon p11, p22;
            p11 = p1.pokemons.get(i);
            p22 = p2.pokemons.get(j);

            hp1=p11.getHp(); hp2=p22.getHp(); speed1=p11.getSpeed(); speed2=p22.getSpeed();
            atk1=p11.getAtk();atk2=p22.getAtk();

            i=i+1;

        Random a = new Random();
        int b = a.nextInt(2);
        Player[] c=new Player[]{p2,null};
        return c[b];
    }
}
