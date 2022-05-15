package lab;

import lab.Food;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food pizza1 = new Food();
        Food pizza2 = new Food();
        Food FriedRice = new Food();
        Food Noodle = new Food();
        pizza1.setId(1);
        pizza1.setName("pizza");
        pizza1.setType("SeaFood");
        pizza1.setSize(11);
        pizza1.setPrize(12);
        pizza2.setId(2);
        pizza2.setName("pizza");
        pizza2.setType("Beef");
        pizza2.setSize(9);
        pizza2.setPrize(10);
        FriedRice.setId(3);
        FriedRice.setName("fried rice");
        FriedRice.setType("SeaFood");
        FriedRice.setSize(5);
        FriedRice.setPrize(12);
        Noodle.setId(4);
        Noodle.setName("noodles");
        Noodle.setType("Beef");
        Noodle.setSize(6);
        Noodle.setPrize(14);

        ArrayList<Food> a = new ArrayList<>();
        a.add(pizza1);
        a.add(pizza2);
        a.add(FriedRice);
        a.add(Noodle);
        System.out.println("--------------------------------------welcome,this is Start of the Menu-----------------------------");
        for (int i = 0; i < 4; i++) {
            a.get(i).getMenu();
        }
        System.out.println("--------------------------------------welcome,this is End of the Menu-------------------------------");
    }
}