package fr.paris10.m1miage.burger.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        /*
        // A regular burger
        Burger alice_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(FISH_MENU)
                .cook();
        // A burger with extra onions and cheese
        Burger bob_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();
        // Cholesterol Burger
        Burger charles_dinner = BigBurgerRestaurant
                .queue()
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }*/
        Burger bigburger = new Burger(Meat.BEEF, Size.SMALL);
        List<Sauce> sauces = new ArrayList<>();
        sauces.add(Sauce.BARBECUE);
        sauces.add(Sauce.BEARNAISE);

        bigburger.setSauces(sauces);
        bigburger.withCheese();
        bigburger.withOnion();

        System.out.println(bigburger.toString());



    }
}

/*        ***Menu FiletO'Poisson ***
        -FISH(400g)--24,00€
        -BEARNAISE sauce(20g)--1,00€
        --------------------
        price:25,00
        --------------------
        calories:910
        calories/100g:217
        --------------------

        ***Menu BigMarcel***
        -BEEF(400g)--16,00€
        -BURGER sauce(20g)--1,00€
        -deep fried onions(20g)--0,30€
        -tomato,qty:10--0,05
        -deep fried onions(20g)--0,30€
        -cheddar(30g)--1,20€
        --------------------
        price:18,85
        --------------------
        calories:1206
        calories/100g:241
        --------------------

        ***Menu Own style***
        -BEEF(400g)--16,00€
        -deep fried onions(20g)--0,30€
        -cheddar(30g)--1,20€
        -BARBECUE sauce(20g)--1,00€
        -BEARNAISE sauce(20g)--1,00€
        -BURGER sauce(20g)--1,00€
        -cheddar(30g)--1,20€
        --------------------
        price:21,70
        --------------------
        calories:1342
        calories/100g:249
        --------------------

        */