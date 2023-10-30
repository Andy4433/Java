# java:
Java é uma linguagem de programação de alto nível, orientada a objetos e amplamente utilizada no desenvolvimento de aplicativos em uma variedade de plataformas.

## sitaxe baisca:

### O java funciona assim


    public class nome_do_programa{ // <-- declarar a  classe
        public static void main(String[] args){ // <-- declara o metodo
            // codigo
        }
    }

public class nome_do_programa: Isso declara uma classe chamada nome_do_programa. Em Java, o nome da classe deve começar com uma letra maiúscula e corresponder ao nome do arquivo que a contém (com a extensão .java).

public static void main(String[] args): Isso declara o método main. O método main é o ponto de entrada para o programa Java e é onde a execução começa. Ele aceita um argumento de array de strings chamado args, que pode ser usado para passar argumentos de linha de comando para o programa.

// código: Este é um comentário de linha única. Comentários são usados para adicionar notas explicativas no código. No exemplo, o comentário indica onde você pode inserir o código real do programa.

### System.out.println:

Em Java, para exibir dados na saída padrão (geralmente, o console), você pode usar o comando de saída de dados, que é implementado com o método System.out.println(). Este método pertence à classe System e é comumente usado para imprimir informações para o console ou outra saída.

Aqui está a sintaxe básica do comando de saída de dados em Java:

    System.out.println("Texto a ser exibido");
    Aqui está uma explicação dos elementos dessa sintaxe:

System.out: É uma referência ao objeto de saída padrão, que é normalmente o console. Você pode substituir out por outras saídas, como System.err para a saída de erro, mas, em situações normais, usamos System.out para a saída padrão.

println(): É um método da classe PrintStream que exibe o texto na saída padrão, seguido por uma nova linha. A função println adiciona automaticamente uma quebra de linha no final do texto, para que a próxima saída seja exibida em uma nova linha.

"Texto a ser exibido": Este é o texto que você deseja exibir. Pode ser uma string, uma variável, uma expressão ou qualquer coisa que possa ser convertida em uma string. É envolvido em aspas duplas (") para indicar que é uma string literal.

Exemplo de uso do System.out.println():

    int idade = 30;
    String nome = "Alice";

System.out.println("Idade: " + idade); // Exibe "Idade: 30" no console
System.out.println("Nome: " + nome);   // Exibe "Nome: Alice" no console
Você também pode usar o método System.out.print() se não quiser adicionar automaticamente uma nova linha no final. Isso permitirá que você continue a imprimir na mesma linha na próxima chamada do método print().

    System.out.print("Primeira parte ");
    System.out.print("Segunda parte");

Este código resultará na saída: "Primeira parte Segunda parte" na mesma linha.