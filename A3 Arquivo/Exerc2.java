class Triangulo {
    public static void main(String[] args) {
        int numero = 10;
        for (int linha = 1; linha <= numero; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print((coluna) + " ");
            }
            System.out.println();
        }
    }
}
//.teste