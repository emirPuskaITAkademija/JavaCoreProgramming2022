package five.array;

import java.util.Arrays;

public class ArrayCopyDemo2 {
    public static void main(String[] args) {
        char[] sourceArray = {'d', 65, 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n','f', 'd'};
        char[] destinationArray = Arrays.copyOfRange(sourceArray, 2, 10);
        System.out.println(destinationArray);
    }
}
