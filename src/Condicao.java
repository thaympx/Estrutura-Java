public class Condicao {
    public static void main(String[] args) {

        int nota = 80;
        String graduação;

        /*
         * A = 80
         * B = 70 
         * C = 60
         * D = 0 
         */

        /*if (nota >= 70){
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B");
        } else if (nota < 80 && nota >= 60) {
            System.out.println("Graduação C");
        } else if (nota < 80 && nota >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota Invalida!");
        }*/


        if (nota >= 70){
            graduação = "A";
        } else if (nota < 80 && nota >= 70) {
            graduação = "B";
        } else if (nota < 80 && nota >= 60) {
            graduação = "C";
        } else if (nota < 80 && nota >= 0) {
            graduação = "D";
        } else {
            graduação = "";
        }

        switch (graduação) {
            case "A":
            case "B": 
            System.out.println("Aluno aprovado");
             break;

            case "C": 
            case "D":  
            System.out.println("Aluno NÃO aprovado");
             break;

            default:
            System.out.println("Graduação invalida");
              
        }
    }
}
