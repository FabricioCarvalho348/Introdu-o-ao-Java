package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idade1 = 10;

        //casting
        int idade2 = (int) 10000000000L;

        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Inácio Fabrício de Carvalho";


        System.out.println("A idade é " + idade2 + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Meu nome é " + nome);
    }
}
