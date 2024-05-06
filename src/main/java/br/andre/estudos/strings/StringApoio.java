package br.andre.estudos.strings;

public class StringApoio {
    public static void main(String[] args) {
        String separator = System.lineSeparator();

        //declarando string
        String frase = "Essa é uma frase.";
        //convertendo string para array de char
        char[] letras = frase.toCharArray();
        //declarando array de char
        char[] ola = {'O','l','a'};
        //declarando StringBuilder (Esse cara é bala)
        StringBuilder sb = new StringBuilder("Olá, mundo!");
        sb.append(" Tudo bem?");
        sb.append(" Eu estou bem!");
        //declarando string com várias linhas
        String variasLinhas = "Essa é uma frase." + separator +
                "Essa é outra frase." + separator +
                "Essa é mais uma frase.";
        String variasLinhas2 = """
                Essa é uma frase.
                Essa é outra frase.
                Essa é mais uma frase.""";

        System.out.println(letras);

        System.out.println(ola);

        System.out.println(sb);

        System.out.println(variasLinhas);

        System.out.println(variasLinhas2);

        System.out.printf("Contando as letras: 'letras' tem %d caracteres %s", letras.length, separator);

        System.out.println("Imprimindo sem o 'a': ");
        for(char letra : letras){
            if(letra != 'a')
                System.out.print(letra);
        }
    }

    public static void mutavelImutavel(){

        // Exemplo com String (imutável)
        String str = "Olá, ";
        str += "mundo!";
        System.out.println("String (imutável): " + str);

        // Exemplo com StringBuilder (mutável)
        StringBuilder stringBuilder = new StringBuilder("Olá, ");
        stringBuilder.append("mundo!");
        System.out.println("StringBuilder (mutável): " + stringBuilder.toString());


        /*  Pergunta de prova: diferença entre String e StringBuilder? Ou, diferença entre mutável e imutável?

        - Usamos String para criar uma string imutável "Olá, " e depois usamos o operador += para concatenar "mundo!" a ela. No entanto, lembre-se de que as strings em Java são imutáveis, então o operador += na verdade cria uma nova string com o conteúdo combinado.
          Nesse caso acaba criando mais um objeto na memória, usando mais recurso da máquina.

        - Usamos StringBuilder para criar um objeto mutável contendo "Olá, " e depois usamos o método append() para adicionar "mundo!" ao StringBuilder.
          Em resumo, quando você precisa modificar uma string repetidamente, é mais eficiente usar StringBuilder, pois ele evita a criação repetida de novas instâncias de string.
          Por outro lado, quando você não precisa modificar uma string, String é mais adequado devido à sua imutabilidade.


        > Qual é melhor?
          Resposta: depende do caso.  :)

         */
    }
}
