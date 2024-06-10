public class Manipulacao {
    public static void main(String[] args) {

        //Manipulçao de String
        
        String nome = "Jessé";

        System.out.println(nome.toUpperCase());
        
        //Converter em letras maiusculas

        System.out.println(nome.toLowerCase());

        //Converter em letras minusculas

        System.out.println(nome.length());

        //comprimento - quantidade de caractéres

// -------------------------------------------------

        //Comparação de String 

        String nomeOutro = "Jessé";
        
        
        System.out.println(nome.equals(nomeOutro)); 

        //&&

        System.out.println(nome.equalsIgnoreCase(nomeOutro));
        //(Serve para ignorar "Ignore" diferenças entre as Strings)

    }
}
