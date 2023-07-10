public class sumTo {
    public double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 0.0;
        }
        if (n == 1) {
            return 1;
        }
        return (1.0/n + sumTo(n - 1));
    }
}