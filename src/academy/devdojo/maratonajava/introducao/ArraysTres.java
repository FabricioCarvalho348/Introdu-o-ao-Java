package academy.devdojo.maratonajava.introducao;

public class ArraysTres {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numerosDois = {1, 2, 3, 4, 5};
        int[] numerosTres = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numerosTres.length; i++) {
//            System.out.println(numerosTres[i]);
//        }

        for(int num : numerosTres) {
            System.out.println(num);
        }
    }
}