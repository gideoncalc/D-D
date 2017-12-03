/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.dofficial;

/**
 *
 * @author elevy
 */
public class Combat {

    public static void main(String[] args) {
        System.out.println("Welcome to game combat simulator version 2.3.9 Copyright Gideon Levy 2017" + "\n");

        int PlayerHP = 12;
        int AC = 14;
        Die D0 = new Die(0);
        Die D2 = new Die(2);
        Die D4 = new Die(4);
        Die D6 = new Die(6);
        Die D8 = new Die(8);
        Die D10 = new Die(10);
        Die D12 = new Die(12);

        int MonsterHP = 14;
        int PlayerAC = 12;
        MonsterDice MD0 = new MonsterDice(0);
        MonsterDice MD2 = new MonsterDice(2);
        MonsterDice MD4 = new MonsterDice(4);
        MonsterDice MD6 = new MonsterDice(6);
        MonsterDice MD8 = new MonsterDice(8);
        MonsterDice MD10 = new MonsterDice(10);
        MonsterDice MD12 = new MonsterDice(12);

        MonsterDice[] Mdice = {new MonsterDice()};

        Die[] dice = {new Die()};

        while (PlayerHP > 0 && MonsterHP > 0) {
            //attack roll
            for (int i = 0; i < 1; i++) {
                for (Die die : dice) {
                    int result1 = die.roll();
                    //System.out.println(result1);

                    if (result1 > AC) {
                        //damage roll
                        for (int j = 0; j < 1; j++) {
                            int firstRoll = D6.roll();
                            int secondRoll = D6.roll();
                            int result = firstRoll + secondRoll;
                            //crit
                            if (result1 == 20) {
                                result *= 2;
                                System.out.println("You do " + firstRoll + " + " + secondRoll + " = " + result + " damage * crit" + "\n");

                            } else if (firstRoll == 0) {
                                System.out.println("You do " + secondRoll + " = " + (result - 1) + " damage" + "\n");

                            } else if (secondRoll == 0) {
                                System.out.println("You do " + firstRoll + " = " + (result - 1) + " damage" + "\n");

                            } else if (firstRoll == 0 && secondRoll == 0) {
                                System.out.println("You do " + firstRoll + " = " + (result - 2) + " damage" + "\n");

                            } else {
                                System.out.println("You do " + firstRoll + " + " + secondRoll + " = " + result + " damage" + "\n");
                            }
                            MonsterHP = MonsterHP - result;

                        }

                    } else if (result1 == 1) {
                        System.out.println("Lol Bro" + "\n");
                    } else {
                        System.out.println("You missed" + "\n");
                    }
                    if (MonsterHP <= 0) {
                        System.out.println("The Monster is Dead" + "\n");

                    }
                }
            }

            //attack roll
            for (int i = 0; i < 1; i++) {
                for (MonsterDice die : Mdice) {
                    int result1 = die.roll();
                    //System.out.println(result1);

                    if (result1 > PlayerAC) {
                        //damage roll
                        for (int j = 0; j < 1; j++) {
                            int firstRoll = MD6.roll();
                            int secondRoll = MD6.roll();
                            int result = firstRoll + secondRoll;
                            //crit
                            if (result1 == 20) {
                                result *= 2;
                                System.out.println("The monster does " + firstRoll + " + " + secondRoll + " = " + result + " damage * crit" + "\n");

                            } else {
                                System.out.println("The monster does " + firstRoll + " + " + secondRoll + " = " + result + " damage" + "\n");
                            }
                            PlayerHP = PlayerHP - result;

                        }

                    } else if (result1 == 1) {
                        System.out.println("The monster is rolling like Jason today I see" + "\n");
                    } else {
                        System.out.println("The monster missed" + "\n");
                    }
                    if (PlayerHP <= 0) {
                        System.out.println("The Player is Dead" + "\n");

                    }
                }
            }

        }

    }
}
