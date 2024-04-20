public class Test {

    static int add_one(int x) {
        return x + 1;
    }

    static int add_two(int x) {
        return add_one(add_one(x));
    }

    public static void main(String[] args) {
        int x = 1;
        x = add_two(x);
    }
}
