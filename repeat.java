public class repeat {
    public String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n value is negative");
        } else if (n == 0) {
            return "";
        } else {
            return s + repeat(s, n - 1);
        }
    }
}
