package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisTres {
    public static void main(String[] args) {
        double salario = 3200;
        String mensagemDoar = "Eu vou doar 500 reais para alguma instituição de caridade";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}