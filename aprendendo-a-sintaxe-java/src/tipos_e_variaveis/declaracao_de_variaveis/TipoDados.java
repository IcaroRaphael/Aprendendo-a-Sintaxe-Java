package tipos_e_variaveis.declaracao_de_variaveis;

public class TipoDados {
    public static void main(String[] args) {
        /*<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>*/

//        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
//        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
//        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
//        short numeroCurto2 = numeroNormal;
    }
}
