public class Zadanie2_8 {
    public static void tabelaPrawdy() {
        System.out.printf("%-6s%-6s%-10s%-10s%-10s%-10s\n", "a", "b", "a && b", "a || b", "!(a && b)", "!(a || b)");
        boolean[] values = {true, false};
        for (boolean a : values) {
            for (boolean b : values) {
                boolean andResult = a && b;
                boolean orResult = a || b;
                boolean notAndResult = !(a && b);
                boolean notOrResult = !(a || b);
                System.out.printf("%-6s%-6s%-10s%-10s%-10s%-10s\n", a, b, andResult, orResult, notAndResult, notOrResult);
            }
        }}}

