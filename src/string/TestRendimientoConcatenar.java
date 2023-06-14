package D_string;

public class TestRendimientoConcatenar {
    public static void main(String[] args) {
        // Es mutable!!
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        //
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 3ms
            //c += a + b + "\n"; // 14ms
            sb.append(a).append(b).append("\n"); // 1ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());

    }
}
