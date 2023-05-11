package utils;

import java.util.List;
import java.util.Random;

public class UtilityMethods {
    public static<T> T getRandomElement(List<T> list, Random rand)  {
        if (list.isEmpty()) return null;
        return list.get(rand.nextInt(list.size()));
    }
}
