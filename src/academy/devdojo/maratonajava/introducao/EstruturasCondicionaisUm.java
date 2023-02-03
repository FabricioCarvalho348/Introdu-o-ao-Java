package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisUm {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        //
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }

        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if(isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

    }
}
