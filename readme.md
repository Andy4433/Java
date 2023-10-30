# java:


<h1 align="center"> Sumário </h1>

<img align="right" src="https://pa1.aminoapps.com/6552/983d39ff666383035c9f2123135fd77628d8e18c_hq.gif" width="200" alt="Vamos falar de Java?">

- 1.0 [Vamos falar de Java?](#Vamos_falar_de_Java?)

    - 1.1 [Portabilidade](#Portabilidade)

    - 1.2 [OOP (Programação Orientada a Objetos)](#OOP)

    - 1.3 [Rico Ecossistema](#Rico_Ecossistema)

    - 1.4[ História de Sucesso](#história-de-sucesso)

    - 1.5[Performance e Segurança](#performance-e-segurança)

    - 1.6[Hype e Críticas](#hype-e-críticas)

    - 1.7[Herança do C/C++](#herança-do-cc)

    - 1.8[Comunidade Ativa](#comunidade-ativa)

- 2.0 [ O java funciona assim ](#o-java-funciona-assim)

    - 2.1 [Declaraçao de variaveis](#declaraçao-de-variaveis)

    - 2.2 [tipos De Dado](#tipo-de-dado)

    - 2.3 [nome Da Variavel](#nome-da-variavel)

- 3.0 [Função de saida de dados System.out.println](#função-de-saida-de-dados-systemoutprintln)

- 4.0 [Estruturas condicionais](#estruturas-condicionais)

    - 4.1 [if, else if e else](#if-else-if-e-else)

    - 4.2 [switch](#switch)

- 5.0 [ Estruturas de Repetição](#estrutura-de-repetição)

    - 5.1 [While](#while)

    - 5.2 [Loop For](#loop-for)

- 6.0 [Arrays](#arrays)

    - 6.1 [Declaração de Arrays](#declaração-de-arrays)

    - 6.2 [Inicialização de Arrays](#inicialização-de-arrays)

    - 6.3 [Acesso a Elementos do Array](#acesso-a-elementos-do-array)

    - 6.4 [Comprimento do Array](#comprimento-do-array)

    - 6.5 [Arrays Multidimensionais](#arrays-multidimensionais)

    - 6.6 [Arrays e Loops](#arrays-e-loops)

    - 6.7 [Arrays vs. ArrayLists](#arrays-vs-arraylists)


### Vamos falar de Java?

<img align="right" src="/gifs/gif01.gif" width="100" alt="Descrição do Gif">


Ah, Java, a linguagem que desperta sentimentos contraditórios em muitos programadores! Alguns a amam, outros a odeiam, mas uma coisa é certa: Java tem desempenhado um papel significativo no mundo da programação.

Aqui estão algumas informações e curiosidades sobre Java:

<img align="right" src="/gifs/gif05.gif" width="100" alt="Descrição do Gif">

#### Portabilidade: 
Uma das coisas mais legais sobre Java é sua portabilidade. Os programas Java são escritos uma vez e podem ser executados em várias plataformas, desde sistemas Windows até dispositivos Android. Isso é possível graças à Máquina Virtual Java (JVM), que interpreta o código Java em tempo de execução.

#### OOP: 
Java é uma linguagem orientada a objetos, o que significa que tudo em Java é um objeto. Isso promove a reutilização de código e facilita a manutenção.

<img align="right" src="https://2.bp.blogspot.com/-Ck0ZJSsj0RY/U2GQXV6sSxI/AAAAAAAADSs/hPx2b7ugRZk/s1600/a11.gif" width="150" alt="Vamos falar de Java?">

#### Rico Ecossistema:
Java tem um ecossistema incrivelmente rico, com uma vasta biblioteca padrão e uma comunidade ativa que desenvolve inúmeras bibliotecas de terceiros. Isso facilita o desenvolvimento de uma ampla variedade de aplicativos.


#### História de Sucesso: 
Java tem uma história de sucesso impressionante. É amplamente usado em aplicações empresariais, desenvolvimento Android, aplicativos de servidor e muito mais. Grandes empresas, como Google, Amazon e Netflix, também utilizam Java em suas infraestruturas.

#### Performance e Segurança: 
A JVM otimiza o código Java para melhor desempenho e segurança. Além disso, as atualizações frequentes ajudam a manter a linguagem segura.

#### Hype e Críticas: 
Java também recebe críticas. Alguns programadores a consideram verbosa, com muita burocracia. Há debates eternos sobre a necessidade de código boilerplate em Java.

#### Herança do C/C++: 
Java herdou muitos conceitos da linguagem C/C++, tornando-se mais familiar para desenvolvedores que já conhecem essas linguagens.

#### Comunidade Ativa:
A comunidade Java é enorme. Existem conferências, grupos de usuários, tutoriais e fóruns online dedicados a Java. Se você tiver uma pergunta, é provável que alguém já tenha respondido.

Então, amor ou odeie, Java é uma linguagem que deixou uma marca indelével no mundo da programação e continua a ser uma escolha popular para muitos tipos de aplicativos.

##  O java funciona assim: 

### sitaxe baisca:


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

#### tipo De Dado: 
Especifica o tipo de dados que a variável irá conter. Java é uma linguagem de programação fortemente tipada, o que significa que o tipo de dados de uma variável deve ser declarado explicitamente. Alguns tipos de dados comuns em Java incluem:

int: Para números inteiros.
double: Para números de ponto flutuante (números decimais).
boolean: Para valores booleanos (verdadeiro ou falso).
char: Para caracteres individuais.
String: Para sequências de caracteres (cadeias de texto).
E muitos outros tipos de dados personalizados.

#### nome Da Variavel: 

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

## Função de saida de dados System.out.println:

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

## Estruturas condicionais:

As estruturas condicionais permitem que você execute blocos de código com base em uma condição. No Java, existem principalmente duas formas de estruturas condicionais: o if (se) e o switch (escolha). Vou explicar ambas:

### if, else if e else:

A estrutura condicional if é usada para executar um bloco de código se uma condição for verdadeira. Pode ser seguida por else if e else para lidar com diferentes cenários. A sintaxe básica é a seguinte:

##### sintaxe: 

    if (condicao) {
        // Código a ser executado se a condição for verdadeira
    } else if (outraCondicao) {
        // Código a ser executado se a outra condição for verdadeira
    } else {
        // Código a ser executado se nenhuma das condições anteriores for verdadeira
    }


##### Exemplo:

    int idade = 25;

    if (idade < 18) {
        System.out.println("Menor de idade");
    } else if (idade >= 18 && idade < 65) {
        System.out.println("Adulto");
    } else {
        System.out.println("Idoso");
    }

### switch
A estrutura condicional switch é usada quando você deseja tomar decisões com base no valor de uma expressão. Ela permite que você compare o valor de uma expressão com vários casos e execute o bloco de código associado a um caso correspondente. 

#### sintaxe:

    switch (expressao) {
        case valor1:
            // Código a ser executado se a expressão for igual a valor1
            break;
        case valor2:
            // Código a ser executado se a expressão for igual a valor2
            break;
        // Outros casos aqui
        default:
            // Código a ser executado se nenhum caso corresponder
    }

#### Exemplo:

    int diaDaSemana = 2;

    switch (diaDaSemana) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        // Outros casos para os outros dias da semana
        default:
            System.out.println("Dia inválido");
    }

##  Estrutura de repetição:
### While:
estrutura de repetição while em Java é usada para executar um bloco de código repetidamente enquanto uma condição específica for verdadeira. 

#### Sintaxe;

    while (condicao) {
        // Código a ser executado enquanto a condição for verdadeira
    }

Aqui estão os elementos-chave na estrutura de repetição while:

condicao: É uma expressão booleana que determina se o bloco de código dentro do while será executado. Enquanto a condição for verdadeira, o código será executado repetidamente. Quando a condição se tornar falsa, a execução do loop será interrompida.

#### Exemplo:

    int contador = 0;
    while (contador < 5) {
        System.out.println("Contador: " + contador);
        contador++; // Importante: Incrementar o contador para evitar um loop infinito
    }

Neste exemplo, o loop while é executado enquanto o valor da variável contador for menor que 5. A cada iteração, o valor de contador é incrementado em 1.

É importante ter cuidado ao usar um loop while, pois ele pode levar a um loop infinito se a condição nunca se tornar falsa. Certifique-se de que a condição se torne falsa em algum momento para evitar loops infinitos. Geralmente, isso é feito atualizando a variável na qual a condição depende dentro do bloco de código do loop.

Você também pode usar o loop while para criar loops baseados em condições mais complexas e, dependendo da lógica do seu programa, pode ser necessário usar a instrução break para sair do loop antecipadamente ou a instrução continue para pular para a próxima iteração com base em alguma condição específica.

#### Exemplo break:

    int numero = 0;
    while (true) {
        if (numero == 5) {
            break; // Sai do loop quando o número é igual a 5
        }
        System.out.println("Número: " + numero);
        numero++;
    }

#### Exemplo continue:

    int numero = 0;
    while (numero < 10) {
        if (numero % 2 == 0) {
            numero++;
            continue; // Pula a iteração se o número for par
        }
        System.out.println("Número ímpar: " + numero);
        numero++;
    }


### loop for:

O loop for em Java é uma estrutura de controle que permite repetir um bloco de código um número específico de vezes ou percorrer elementos em uma sequência, como um array ou uma lista. 

    for (inicialização; condição; expressão de atualização) {
        // Código a ser repetido
    }

Inicialização: Isso é onde você inicializa uma variável de controle que é usada para controlar o número de iterações do loop. Geralmente, uma variável é declarada e atribuída um valor inicial.

#### Exemplo:

    for (int i = 0; i < 5; i++) {
        // Código a ser repetido
    }

Condição: A condição é avaliada antes de cada iteração do loop. Se a condição for verdadeira, o bloco de código dentro do loop é executado. Se a condição for falsa, o loop é encerrado.

#### Exemplo:    

    for (int i = 0; i < 5; i++) {
        // Código a ser repetido
    }

Expressão de Atualização: Esta expressão é avaliada após cada iteração do loop. Geralmente, é usada para atualizar a variável de controle. Isso permite que você altere a condição do loop ou o estado da variável de controle.

#### Exemplo:

    for (int i = 0; i < 5; i++) {
        // Código a ser repetido
    }

O bloco de código dentro do loop for pode conter qualquer número de instruções e pode realizar várias ações. Você pode usar o loop for para percorrer arrays, executar cálculos iterativos, gerar sequências numéricas e muito mais.

#### Exemplo de percorrer um array com um loop for:

    int[] numeros = {1, 2, 3, 4, 5};
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Número: " + numeros[i]);
    }

## arrays:

Em Java, um array é uma estrutura de dados que permite armazenar um conjunto de valores do mesmo tipo em uma única variável. Os arrays são usados para agrupar elementos relacionados, como números inteiros, números de ponto flutuante, caracteres, ou até mesmo objetos personalizados.

### Declaração de Arrays: 

Para declarar um array em Java, você especifica o tipo de dados seguido pelo nome da variável e colchetes []. 

#### Por exemplo:

    int[] numeros;  // Declara um array de inteiros.
    String[] nomes; // Declara um array de strings.

### Inicialização de Arrays:

Depois de declarar um array, você pode inicializá-lo criando uma instância do array com um tamanho específico. 

#### Por exemplo:

    int[] numeros = new int[5];  // Inicializa um array de inteiros com 5 elementos.
    String[] nomes = new String[3]; // Inicializa um array de strings com 3 elementos.

### Acesso a Elementos do Array: 

Os elementos de um array são acessados pelo seu índice. O índice é um número inteiro que começa em 0 para o primeiro elemento. 

#### Por exemplo:

    int primeiroNumero = numeros[0]; // Acessa o primeiro elemento do array "numeros".
    String segundoNome = nomes[1];   // Acessa o segundo elemento do array "nomes".

### Comprimento do Array: 

Você pode obter o comprimento de um array usando a propriedade length. 

#### Por exemplo:

    int tamanhoNumeros = numeros.length; // Obtém o comprimento do array "numeros".

### Arrays Multidimensionais: 

Java permite criar arrays multidimensionais, que são arrays de arrays. Isso é útil para criar matrizes ou tabelas. 

#### Por exemplo:

    int[][] matriz = new int[3][3]; // Declara e inicializa uma matriz 3x3 de inteiros.

### Arrays e Loops: 

Arrays são frequentemente usados em conjunto com loops, como for ou while, para percorrer todos os elementos do array e executar operações neles.

#### Por exemplo:

    for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]); // Exibe cada elemento do array "numeros".
    }

### Arrays vs. ArrayLists: 

Em Java, você também pode usar a classe ArrayList da biblioteca padrão para criar coleções dinâmicas que não têm um tamanho fixo. Os ArrayLists são mais flexíveis do que os arrays tradicionais, mas podem ser menos eficientes em termos de desempenho.