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

### Declaraçao de variaveis:

Em Java, a declaração de variáveis é a ação de criar uma variável, especificando o seu tipo e o nome que você deseja atribuir a ela.

#### tipoDeDado: 
Especifica o tipo de dados que a variável irá conter. Java é uma linguagem de programação fortemente tipada, o que significa que o tipo de dados de uma variável deve ser declarado explicitamente. Alguns tipos de dados comuns em Java incluem:

int: Para números inteiros.
double: Para números de ponto flutuante (números decimais).
boolean: Para valores booleanos (verdadeiro ou falso).
char: Para caracteres individuais.
String: Para sequências de caracteres (cadeias de texto).
E muitos outros tipos de dados personalizados.

#### nomeDaVariavel: 

É o nome que você atribui à variável. Este nome deve seguir algumas regras:

Deve começar com uma letra (maiúscula ou minúscula) ou o caractere _.
Pode conter letras, dígitos numéricos e o caractere _.
Não pode conter espaços em branco ou caracteres especiais, como $ ou #.

    int idade;            // Declara uma variável chamada "idade" do tipo "int".
    double salario;       // Declara uma variável chamada "salario" do tipo "double".
    boolean aprovado;     // Declara uma variável chamada "aprovado" do tipo "boolean".
    char genero;          // Declara uma variável chamada "genero" do tipo "char".
    String nomeCompleto;  // Declara uma variável chamada "nomeCompleto" do tipo "String".

Depois de declarar uma variável, você pode atribuir um valor a ela usando o operador de atribuição =. Por exemplo:

    idade = 25;               // Atribui o valor 25 à variável "idade".
    salario = 3000.50;        // Atribui o valor 3000.50 à variável "salario".
    aprovado = true;          // Atribui o valor "verdadeiro" à variável "aprovado".
    genero = 'F';             // Atribui o caractere 'F' à variável "genero".
    nomeCompleto = "Maria";   // Atribui a string "Maria" à variável "nomeCompleto".

Podemos declara variavies e inicializar uma variável em uma única linha:, onde atribuimos um valor a ela usando o operador de atribuição =. Por exemplo:

    int idade = 25;               // Atribui o valor 25 à variável "idade".
    double salario = 3000.50;        // Atribui o valor 3000.50 à variável "salario".
    boolean aprovado = true;          // Atribui o valor "verdadeiro" à variável "aprovado".
    char genero = 'F';             // Atribui o caractere 'F' à variável "genero".
    String nomeCompleto = "Maria";   // Atribui a string "Maria" à variável "nomeCompleto".

 Ela mostra como declarar variáveis e atribuir valores a elas em uma única linha, o que é uma prática comum e eficiente em Java. Assim, não é necessário declarar a variável e, em seguida, atribuir um valor separadamente

## System.out.println:

Em Java, para exibir dados na saída padrão (geralmente, o console), você pode usar o comando de saída de dados, que é implementado com o método System.out.println(). Este método pertence à classe System e é comumente usado para imprimir informações para o console ou outra saída.

Aqui está a sintaxe básica do comando de saída de dados em Java:

    System.out.println("Texto a ser exibido");
    Aqui está uma explicação dos elementos dessa sintaxe:

#### System.out: 

É uma referência ao objeto de saída padrão, que é normalmente o console. Você pode substituir out por outras saídas, como System.err para a saída de erro, mas, em situações normais, usamos System.out para a saída padrão.

#### println(): 

É um método da classe PrintStream que exibe o texto na saída padrão, seguido por uma nova linha. A função println adiciona automaticamente uma quebra de linha no final do texto, para que a próxima saída seja exibida em uma nova linha.

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

## Estruturas condicionais