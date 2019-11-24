public class inmultirea {
    public static void main(String[] args) {
        int col, lin;
        for (lin = 1; lin <= 9; lin++) {
            for (col = 1; col <= 9; col++)
                System.out.println(col + "x" + lin + "=" + col * lin);
        }
    }
}
