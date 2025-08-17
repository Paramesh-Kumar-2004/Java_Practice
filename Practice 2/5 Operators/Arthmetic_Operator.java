
class Arthmetic_Operator {
    public static void main(String[] args) {

        System.out.println("Arthmetic Operators\n");

        // Arthmetic_Operator Operators : + , - , * , / , %
        int VP = 4;
        int PV = 8;

        System.out.println("Values : \nVP : " + VP + "\nPV : " + PV + "\n");
        System.out.println("Add : " + (VP + PV));
        System.out.println("Min : " + (VP - PV));
        System.out.println("Mul : " + (VP * PV));
        System.out.println("Div : " + (VP / PV));
        System.out.println("Mod : " + (VP % PV));

        System.out.println("\nDiv With Float : " + (float) (VP / PV));

        System.out.println("\n\nCompound Assignment\n");
        VP += 4;
        System.out.println("VP+=4 : " + VP);
        PV -= 4;
        System.out.println("PV-=4 : " + PV);
        // PV+=4 , PV-=4 , PV*=4 , PV%=4 , PV/=4

        System.out.println("\n\nIncrement/Decrement\n");
        int a = 1;
        ++a; // 2 // Pre Increment
        a++; // 3 // Post Increment
        System.out.println("++a & a++ : " + a); // 3

        int b = 1;
        --b; // 0
        b--; // -1
        System.out.println("--a & a-- : " + b); // -1

        System.out.println("\n\nRelational Operators\n");
        // < , <= , > , >= , == , !=
        System.out.println("VP : " + VP + "\tPV : " + PV);
        System.out.println("<  : " + (VP < PV));
        System.out.println("<= : " + (VP <= PV));
        System.out.println(">  : " + (VP > PV));
        System.out.println(">= : " + (VP >= PV));
        System.out.println("== : " + (VP == PV));
        System.out.println("!= : " + (VP != PV));

        System.out.println("\n\nBitwise Operators\n");
        // AND , OR , NOT , EXOR
        // << left shift, >> right shift , >>> right shift zero fill
        int a2 = 4;
        int b2 = 8;
        System.out.println("a&b : " + (a2 & b2));
        System.out.println("a|b : " + (a2 | b2));
        System.out.println("~a , ~b : " + (~a2) + " , " + ~b2);

        // Right Shift : Multipling the int with 2.
        /*
         * Ex : a = 4 (0000 0100) (Position a[0] Will Be Removed)
         * a<<1 : 0000 1000
         * a<<2 : 0001 0000
         */
        System.out.println("\nLeft Shift :\n" + (a2 << 1));
        System.out.println(a2 << 2);
        System.out.println(a2 << 3);

        // Left Shift : .
        int a3 = 4;
        System.out.println("\nRight Shift :\n" + (a3 >> 1));
        System.out.println(a3 >> 2);
        System.out.println(a3 >> 3);

        System.out.println("\nShort Circuit Logical Operators\n");

        // && , ||
        int a4 = 4;
        // int b4 = 8;
        System.out.println("&& : " + ((a4 <= 4) && (a4 <= 8)));
        System.out.println("|| : " + ((a4 <= 4) || (a4 < 8)));

    }
}