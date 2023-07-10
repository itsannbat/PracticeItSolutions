public class multiplyEvens {
    public int multiplyEvens(int val) {
        if (val <= 0) {
            throw new IllegalArgumentException();
        } else if (val == 1) {
            return 2;
        } else {
            return val * 2 * multiplyEvens(val - 1);
        }
    }
}
