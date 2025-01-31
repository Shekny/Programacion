public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2},{3, 4}};

        int[][] matriz2 = {{5, 6},{7, 8}};

        int[][] suma = new int[2][2];

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print("{" + suma[i][j] + "}");
            }
        }
    }
}
