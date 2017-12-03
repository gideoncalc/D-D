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
public class Die {

    private int faces;

    static final int ATTACK_DIE = 20;

    //constructor
    //convienence for regular die where sides = 20
    Die() {
        this(Die.ATTACK_DIE);
    }

    Die(int faces) {
        this.faces = faces;
    }

    public int roll() {
        return (int) (Math.random() * this.faces) + 1;
    }

}

    class MonsterDice {

    private int faces;

    static final int ATTACK_DIE = 20;

    //constructor
    //convienence for regular die where sides = 20
    MonsterDice() {
        this(MonsterDice.ATTACK_DIE);
    }

    MonsterDice(int faces) {
        this.faces = faces;
    }

    public int roll() {
        return (int) (Math.random() * this.faces) + 1;
    }
}
