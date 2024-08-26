public class Main {
    public static void main(String[] args) {
        //System.out.println serve para fazer aparecer uma mensagem no terminal ou uma variavel
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");


        int anoDeLancamento = 2022;//uma variavel para armazenar um valor numerico inteiro
        System.out.println("Ano de lançamento: " + anoDeLancamento);//mensagem entre aspas + a variavel
        boolean incluidNoPlano = true;//tipo boolean serve para ver se algo esta ativado ou desativado
        double notaDoFilme = 8.1;//o tipo double serve para colocar numeros decimais

        double media = (9.8 + 6.3 + 8.0) /3;// operação para calcular a média das notas
        System.out.println(media);
        //variavel String q é utilizado para encurtar o uso do println, com o uso de aspas duplas
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);





    }
}