package com.alpha.logutil;

import java.util.Random;

public class RandIntGenerator {

    public static int getRandInt()
    {

        final int random = new Random().nextInt(100);

        return random;
    }

}
