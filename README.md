# Exception-in-java
Estudos sobre exception na linguagem Java.

* Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.
* Em java, um exceção é um objeto herdado da classe:
   * java.lang.Exception - o compilador obriga a tratar ou propagar
   * java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
* Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada(tratada) ou o programa seja encerrado.

# Por que exceções?

* o modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas. 

* Vantagens: 
   * delega a lógica de erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
   * Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
   * A exceção pode carregar dados quaisquer.
