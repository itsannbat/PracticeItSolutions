import java.util.*;

public class SwapPairs{ 

    public static void main(String args[]) {
        ArrayList<String> test = new ArrayList<>();
        test.add("food");
        test.add("potato");
        swapPairs(test);
    }

    public void swapPair(ArrayList<String> value) {
        for (int i = 0; i < value.size() - 1; i += 2) {
            String temp = value.get(i);
            value.set(i, value.get(i + 1));
            value.set(i + 1, temp);
        }
    }
}