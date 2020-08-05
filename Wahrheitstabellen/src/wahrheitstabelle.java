public class wahrheitstabelle {
    public static void main(String[] args) {

        int max = 8;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        System.out.println("A │ B │ C │");
        System.out.println("──┼───┼───┼─────");
        for (int total = 0; total < max; total++) {
            if (total % 4 == 0) {
                a = !a;
            }
            if (total % 2 == 0) {
                b = !b;
            }
            if (total % 1 == 0) {
                c = !c;
            }

            System.out.print((a?'1':'0') + " │ " + (b?'1':'0') +  " │ " + (c?'1':'0') + " │ ");
            System.out.println(" " + (   (!a || b)?'1':'0'));
        }
    }
}
