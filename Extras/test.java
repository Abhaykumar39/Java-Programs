public class test {
    int sum(int... x) {
        int sum = 0;
        for (int i : x)
            sum += i;
        return sum;
    }

    public static void main(String args[]) {
        test obj = new test();
        System.out.println(obj.sum(5, 4, 3));
    }
}
