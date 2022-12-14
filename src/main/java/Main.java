public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(10, 22));
        System.out.println(calc.pow(2, 10));
        System.out.println();

        BinOps bins = new BinOps();
        System.out.println(bins.sum("11", "11"));
        System.out.println(bins.mult("1010", "10110"));

    }

}
