package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisDois {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 10 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;

        if(idade < 15) {
            System.out.println("Categoria infantil");
        } else if(idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
