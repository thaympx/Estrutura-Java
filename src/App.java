public class App {
    public static void main(String[] args)  {
        //write your code here 

        //Operador " && " (E)BR (AND)US

       /* boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;*/


        //Operador " || " = (OU)BR (OR)US

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;



        System.out.println(vamosAPraia);

        //Operador Ternário 


        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}