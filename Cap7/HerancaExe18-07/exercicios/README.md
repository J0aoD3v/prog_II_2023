# Exercícios sobre Herança

## 1.
Considerando a pergunta “A é um B” no contexto da herança, assinale quais classes abaixo podem ser implementadas como subclasses da respectiva superclasse:

a. ( ) Cachorro extends Mamíferos

b. ( ) MemoriaRAM extends Memória

c. ( ) Aluno extends Professor

d. ( ) Professor extends Pessoa

e. ( ) Mouse extends Periferico

f. ( ) Periferico extends Modem

g. ( ) Modem extends Computador

h. ( ) ComputadorPessoal extends Notebook

i. ( ) Veiculo extends Aviao

j. ( ) Conta extends Poupanca

k. ( ) Aviao extends Aeroporto

## 2. 
Crie uma classe Ponto com os atributos x e y (inteiros), que representam o Ponto no
plano cartesiano. Crie dois construtores, um que não recebe argumentos e inicializa
x e y com zero e outro que recebe a coordenada.

## 3. 
Crie a classe Pixel, que é um Ponto que tem uma cor (String). A classe deve ter 3
construtores:

   a. um vazio, que inicializa x e y com zero e a cor como “preta”,

   b. um construtor que recebe os valores para x e y apenas, e deixa a cor padrão
   (“preta”) e
   
   c. outro que recebe x, y e a cor.

   Utilize, obrigatoriamente, chamada ao construtor da classe base.

## 4. 
Crie a classe Circulo, que tem um Ponto e um raio. A classe deve ter dois
construtores:

   a. o que não recebe argumentos: cria um Circulo com centro em 0,0 e raio 1

   b. o que recebe a posição e o raio

## 5. 
Qual a saída do seguinte código?
```java
class Mamifero{
    public Mamifero (int idade){
        System.out.println("Mamifero");
    }
}

public class Ornitorrinco extends Mamifero {
    public Ornitorrinco () {
        System.out.println("Ornitorrinco");
    }

    public static void main (String[] args) {
        new Mamifero (5);
    }
}
```

A. Ornitorrinco

B. Mamifero

C. Ornitorrinco Mamifero

D. Mamifero Ornitorrinco

E. O código não compila devido a um erro na linha 8

F. O código não compila devido a um erro na linha 11

## 6. 
a) Crie uma classe abstrata Funcionario com os atributos codigo e nome, gets e sets
respectivos, e o método abstrato calcularSalario( ) cujo retorno seja double.

b) Crie a classe concreta Diarista que herda de Funcionario. A classe tem os atributos
salarioDia e diasTrabalhados. O método calcularSalario( ) retorna a multiplicação de
salarioDia por diasTrabalhados.

c) Crie a classe concreta Gerente, que herda de Funcionario. A classe tem o atributo
salarioMensal. O método calcularSalario( ) retorna salarioMensal + 10% de gratificação.

d) Instancie alguns objetos e mostre como chamar polimorficamente o método
calcularSalario( ). Utilize uma estrutura de dados do tipo Funcionario (vetor, ArrayList...)

## 7. 
Crie a hierarquia de herança para o seguinte contexto:

Em uma universidade, os professores podem desenvolver três tipos de projetos: de
pesquisa, de extensão e de ensino. Crie uma classe abstrata chamada Projeto que sirva de
base para as classes derivadas Pesquisa, Ensino e Extensao. Considere que Pesquisa,
Ensino e Extensao são três classes distintas. De comum, tem número (Integer) e título do
projeto (String). Os atributos comuns devem estar na superclasse. De diferente, considere:

- Pesquisa: área CNPQ (String), orçamento (Double)
- Extensao: público alvo (String), linha (String)
- Ensino: disciplina (String), curso (String)

## 8. 
Com base nas classes criadas na questão 7, analise as linhas de código a seguir:

I. Projeto p = new Pesquisa();

II. Projeto p = new Projeto();

III. Pesquisa p = new Projeto();

IV. Pesquisa p = new Pesquisa();

Estão corretas as instruções:

( ) Nenhuma

( ) Apenas as instruções I e III

( ) Apenas as instruções II e IV

( ) Apenas as instruções I e IV

( ) Todas

## 9. 
Considere as classes:

```java
public class Alpha {
    public void m() {
        System.out.println("Superclasse");
    }
}
```

```java
public class Gamma extends Alpha {
    public void x() {
        System.out.println("Subclasse");
    }
}
```

Considere as seguintes linhas de código:

```java
/* 1 */ Alpha a = new Gamma();
/* 2 */ a.x();
```

O código:
( ) Compila normalmente

( ) Não compila pelo seguinte motivo: _____________________________________

