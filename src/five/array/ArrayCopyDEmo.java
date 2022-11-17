package five.array;

public class ArrayCopyDEmo {
    public static void main(String[] args) {
        char[] sourceArray = {'d', 65, 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n','f', 'd'};
        char[] destinationArray = new char[8];
        System.arraycopy(sourceArray, 2, destinationArray, 0, 8);
        System.out.println(destinationArray);
    }

}
