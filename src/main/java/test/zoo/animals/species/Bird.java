package test.zoo.animals.species;

import test.zoo.Animal;
import test.zoo.animals.abilities.Talking;

/**
 * Created by gol on 07.02.2017.
 */
public abstract class Bird extends Animal implements Talking{

    @Override
    public int getNumberOfLegs() {
        return 2;
    }
}
