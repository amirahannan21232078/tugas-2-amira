class LogicalDemo2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Operator AND dengan ekspresi boolean
        boolean resultAnd = (x > 5) && (y > 15);
        System.out.println("(x > 5) && (y > 15) = " + resultAnd);

        // Operator OR dengan ekspresi boolean
        boolean resultOr = (x < 5) || (y > 15);
        System.out.println("(x < 5) || (y > 15) = " + resultOr);

        // Operator NOT dengan ekspresi boolean
        boolean resultNot = !(x > y);
        System.out.println("!(x > y) = " + resultNot);
    }
}
