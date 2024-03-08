package br.com.basico;

public class TiposDadosNumerico {
    public static void main(String[] args) {

        // Tipos primários ou primitivos
        long num1 = 999999999; // Numero muito grande
        int num2 = 1; // Inteiro
        short num3 = 1; //Inteiro (curto/menor)
        float num4 = 2.3f; // Float (número com ponto flutuante)
        double num5 = 5.3002132550022113359985; //Double é maior de float
        byte num6 = 2;
        char num7 = 45;


        // Tipos não primário ou não primitivos
        Long num8 = (long) 999999999; // Cast
        Integer num9 = 9;
        Short num10 = 12;
        Float num11 = 1.2f;
        Double num12 = 12.21231213213213123;
        Byte num13 = 12;
        Character num14 = 12345;

        System.out.println("\nint/Integer: " + Integer.SIZE + " bits");
        System.out.println("int/Integer: " + Short.SIZE + " bits");
        System.out.println("int/Integer: " + Byte.SIZE + " bits");

        System.out.println("Valor Min int/Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer: " + Integer.MAX_VALUE);

        System.out.println("Valor Min short/Short: " + Short.MIN_VALUE);
        System.out.println("Valor Max short/Short: " + Short.MAX_VALUE);

        System.out.println("Valor Min byte/Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor Max byte/Byte: " + Byte.MAX_VALUE);

        System.out.println("Valor Min long/Long: " + Long.MIN_VALUE);
        System.out.println("Valor Max long/Long: " + Long.MAX_VALUE);

        System.out.println("Valor Min char/Character: " + Character.);
        System.out.println("Valor Max char/Character: " + Character.MAX_VALUE);
    }
}
