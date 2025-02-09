class BitwiseDemo2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        // Operator AND
        int resultAnd = x & y;
        System.out.println(x + " & " + y + " = " + resultAnd);

        // Operator OR
        int resultOr = x | y;
        System.out.println(x + " | " + y + " = " + resultOr);

        // Operator XOR
        int resultXor = x ^ y;
        System.out.println(x + " ^ " + y + " = " + resultXor);

        // Operator Negasi (NOT)
        int resultNotX = ~x;
        System.out.println("~" + x + " = " + resultNotX);

        // Operator Shift Left
        int resultShiftLeft = x << 1;
        System.out.println(x + " << 1 = " + resultShiftLeft);

        // Operator Shift Right
        int resultShiftRight = x >> 1;
        System.out.println(x + " >> 1 = " + resultShiftRight);
    }
}
