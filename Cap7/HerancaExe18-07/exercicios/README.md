# Exercícios sobre Herança

## 1.
Considerando a pergunta “A é um B” no contexto da herança, assinale quais classes abaixo podem ser implementadas como subclasses da respectiva superclasse:

a. (X) Cachorro extends Mamíferos
Um cachorro é um mamífero, portanto faz sentido que a classe Cachorro seja uma subclasse de Mamíferos.

b. (X) MemoriaRAM extends Memória
A memória RAM é um tipo específico de memória, portanto a classe MemoriaRAM pode ser uma subclasse de Memória.

c. ( ) Aluno extends Professor
Neste caso, não faz sentido que Aluno seja uma subclasse de Professor. Aluno e Professor são papéis distintos desempenhados pelas pessoas, e a herança não representa essa relação.

d. (X) Professor extends Pessoa
Um professor é uma pessoa, portanto a classe Professor pode ser uma subclasse de Pessoa.

e. (X) Mouse extends Periferico
O mouse é um tipo de periférico, portanto a classe Mouse pode ser uma subclasse de Periferico.

f. (X) Periferico extends Modem
A relação parece estar invertida. Normalmente, o modem é um tipo de periférico. Portanto, a classe Periferico pode ser uma subclasse de Modem.

g. ( ) Modem extends Computador
Esta relação está invertida. O modem é um periférico usado em computadores, mas não é um computador em si.

h. ( ) ComputadorPessoal extends Notebook
A relação está invertida. Normalmente, o computador pessoal (PC) é uma categoria mais abrangente que inclui notebooks. Portanto, a classe ComputadorPessoal não deve ser uma subclasse de Notebook.

i. ( ) Veiculo extends Aviao
A relação está invertida. Um avião é um tipo específico de veículo, portanto a classe Aviao deve ser uma subclasse de Veiculo.

j. (X) Conta extends Poupanca
Parece estar invertido. Uma poupança é um tipo de conta. Portanto, a classe Poupanca pode ser uma subclasse de Conta.

k. () Aviao extends Aeroporto
A relação está invertida. Um avião não é um aeroporto. Portanto, a classe Aeroporto pode ser uma subclasse de Aviao.

## 2. 
Crie uma classe Ponto com os atributos x e y (inteiros), que representam o Ponto no plano cartesiano. Crie dois construtores, um que não recebe argumentos e inicializa
x e y com zero e outro que recebe a coordenada.

```java
public class Ponto {
    private int x;
    private int y;

    // Construtor que não recebe argumentos e inicializa x e y com zero
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor que recebe as coordenadas x e y como argumentos
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters e setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para exibir as coordenadas do ponto
    public void exibirCoordenadas() {
        System.out.println("Coordenadas do ponto: (" + x + ", " + y + ")");
    }
}
```
Agora você pode criar objetos da classe Ponto usando os dois construtores:
```java
public class Main {
    public static void main(String[] args) {
        // Criar um ponto com o construtor que não recebe argumentos (x e y serão 0)
        Ponto ponto1 = new Ponto();
        ponto1.exibirCoordenadas(); // Saída: Coordenadas do ponto: (0, 0)

        // Criar um ponto com o construtor que recebe as coordenadas
        Ponto ponto2 = new Ponto(3, 5);
        ponto2.exibirCoordenadas(); // Saída: Coordenadas do ponto: (3, 5)
    }
}
```
> Neste exemplo, criamos uma classe Ponto com atributos x e y, dois construtores, métodos getters e setters para acessar e modificar os valores dos atributos e um método exibirCoordenadas() para mostrar as coordenadas do ponto. Em seguida, demonstramos como usar os construtores para criar objetos Ponto e exibir suas coordenadas.

## 3. 
Crie a classe Pixel, que é um Ponto que tem uma cor (String). A classe deve ter 3
construtores:

   a. um vazio, que inicializa x e y com zero e a cor como “preta”,

   b. um construtor que recebe os valores para x e y apenas, e deixa a cor padrão
   (“preta”) e
   
   c. outro que recebe x, y e a cor.

   Utilize, obrigatoriamente, chamada ao construtor da classe base.

```java
public class Pixel extends Ponto {
    private String cor;

    // Construtor vazio que inicializa x e y com zero e a cor como "preta"
    public Pixel() {
        super(); // Chama o construtor vazio da classe base (Ponto)
        this.cor = "preta";
    }

    // Construtor que recebe os valores para x e y e deixa a cor padrão como "preta"
    public Pixel(int x, int y) {
        super(x, y); // Chama o construtor que recebe x e y da classe base (Ponto)
        this.cor = "preta";
    }

    // Construtor que recebe x, y e a cor
    public Pixel(int x, int y, String cor) {
        super(x, y); // Chama o construtor que recebe x e y da classe base (Ponto)
        this.cor = cor;
    }

    // Método getter para obter a cor do pixel
    public String getCor() {
        return cor;
    }

    // Método setter para definir a cor do pixel
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para exibir as informações do pixel (coordenadas e cor)
    public void exibirPixel() {
        System.out.println("Coordenadas do pixel: (" + getX() + ", " + getY() + ")");
        System.out.println("Cor do pixel: " + cor);
    }
}
```
Agora você pode criar objetos da classe Pixel usando os três construtores:
```java
public class Main {
    public static void main(String[] args) {
        // Construtor vazio (x e y serão 0 e cor será "preta" por padrão)
        Pixel pixel1 = new Pixel();
        pixel1.exibirPixel(); // Saída: Coordenadas do pixel: (0, 0), Cor do pixel: preta

        // Construtor que recebe x e y (cor será "preta" por padrão)
        Pixel pixel2 = new Pixel(3, 5);
        pixel2.exibirPixel(); // Saída: Coordenadas do pixel: (3, 5), Cor do pixel: preta

        // Construtor que recebe x, y e a cor
        Pixel pixel3 = new Pixel(7, 2, "vermelho");
        pixel3.exibirPixel(); // Saída: Coordenadas do pixel: (7, 2), Cor do pixel: vermelho
    }
}
```
> Neste exemplo, criamos a classe Pixel, que herda da classe Ponto. A classe Pixel possui três construtores, onde o primeiro construtor chama o construtor vazio da classe base (Ponto), o segundo construtor chama o construtor que recebe x e y da classe base, e o terceiro construtor chama o construtor que recebe x e y da classe base e também define a cor do pixel. O método exibirPixel() mostra as coordenadas e a cor do pixel.

## 4. 
Crie a classe Circulo, que tem um Ponto e um raio. A classe deve ter dois
construtores:

   a. o que não recebe argumentos: cria um Circulo com centro em 0,0 e raio 1

   b. o que recebe a posição e o raio

```java
public class Circulo {
    private Ponto centro;
    private double raio;

    // Construtor que não recebe argumentos: cria um Círculo com centro em (0, 0) e raio 1
    public Circulo() {
        this.centro = new Ponto(); // Chama o construtor vazio da classe Ponto para criar o ponto (0, 0)
        this.raio = 1;
    }

    // Construtor que recebe a posição do centro e o raio
    public Circulo(int x, int y, double raio) {
        this.centro = new Ponto(x, y); // Chama o construtor da classe Ponto que recebe x e y
        this.raio = raio;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
```
> Neste exemplo, criamos a classe Circulo, que possui um atributo centro do tipo Ponto e um atributo raio. A classe tem dois construtores, onde o primeiro construtor cria um círculo com centro em (0, 0) e raio 1, e o segundo construtor recebe a posição do centro e o raio. Além disso, temos métodos getters e setters para acessar e modificar os atributos do círculo, e um método calcularArea() para calcular a área do círculo usando a fórmula π * raio^2.

Aqui está um exemplo de como criar objetos da classe Circulo usando os dois construtores e calcular a área:
```java
public class Main {
    public static void main(String[] args) {
        // Criar um círculo com centro em (0, 0) e raio 1
        Circulo circulo1 = new Circulo();
        System.out.println("Centro: (" + circulo1.getCentro().getX() + ", " + circulo1.getCentro().getY() + ")");
        System.out.println("Raio: " + circulo1.getRaio());
        System.out.println("Área: " + circulo1.calcularArea());

        // Criar um círculo com centro em (2, 3) e raio 5
        Circulo circulo2 = new Circulo(2, 3, 5);
        System.out.println("Centro: (" + circulo2.getCentro().getX() + ", " + circulo2.getCentro().getY() + ")");
        System.out.println("Raio: " + circulo2.getRaio());
        System.out.println("Área: " + circulo2.calcularArea());
    }
}
```
Saída:
```makefile
Centro: (0, 0)
Raio: 1.0
Área: 3.141592653589793
Centro: (2, 3)
Raio: 5.0
Área: 78.53981633974483
```
> Neste exemplo, criamos dois círculos usando os construtores da classe Circulo e calculamos suas áreas. O primeiro círculo tem centro em (0, 0) e raio 1, e o segundo círculo tem centro em (2, 3) e raio 5. A área de cada círculo é exibida na saída.

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

A saída do código será: Mamifero

Explicação:

- Temos duas classes: Mamifero e Ornitorrinco.
- A classe Mamifero possui um construtor que recebe um argumento idade e imprime "Mamifero".
- A classe Ornitorrinco herda da classe Mamifero.
- A classe Ornitorrinco possui um construtor padrão (sem argumentos) que imprime "Ornitorrinco".
- No método main, é criado um novo objeto da classe Mamifero com idade 5, o que imprime "Mamifero".

O construtor padrão da classe Ornitorrinco não é chamado explicitamente, e como resultado, a mensagem "Ornitorrinco" não é impressa. Apenas a mensagem do construtor da classe Mamifero é exibida, que é chamado na criação do objeto da classe Mamifero.

## 6. 
a) Crie uma classe abstrata Funcionario com os atributos codigo e nome, gets e sets respectivos, e o método abstrato calcularSalario( ) cujo retorno seja double.

```java
public abstract class Funcionario {
    private int codigo;
    private String nome;

    // Construtor
    public Funcionario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato para calcular o salário
    public abstract double calcularSalario();
}
```

b) Crie a classe concreta Diarista que herda de Funcionario. A classe tem os atributos
salarioDia e diasTrabalhados. O método calcularSalario( ) retorna a multiplicação de salarioDia por diasTrabalhados.

```java
public class Diarista extends Funcionario {
    private double salarioDia;
    private int diasTrabalhados;

    // Construtor
    public Diarista(int codigo, String nome, double salarioDia, int diasTrabalhados) {
        super(codigo, nome);
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    // Método para calcular o salário
    @Override
    public double calcularSalario() {
        return salarioDia * diasTrabalhados;
    }
}
```

c) Crie a classe concreta Gerente, que herda de Funcionario. A classe tem o atributo salarioMensal. O método calcularSalario( ) retorna salarioMensal + 10% de gratificação.

```java
public class Gerente extends Funcionario {
    private double salarioMensal;

    // Construtor
    public Gerente(int codigo, String nome, double salarioMensal) {
        super(codigo, nome);
        this.salarioMensal = salarioMensal;
    }

    // Método para calcular o salário
    @Override
    public double calcularSalario() {
        return salarioMensal + (salarioMensal * 0.10); // Adiciona 10% de gratificação
    }
}
```

d) Instancie alguns objetos e mostre como chamar polimorficamente o método calcularSalario( ). Utilize uma estrutura de dados do tipo Funcionario (vetor, ArrayList...)

Exemplo de utilização:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Diarista(1, "Maria", 80.0, 5));
        funcionarios.add(new Gerente(2, "João", 3000.0));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println("---------------------------");
        }
    }
}
```

Saída:
```markdown
Funcionário: Maria
Salário: 400.0
---------------------------
Funcionário: João
Salário: 3300.0
---------------------------
```

> Neste exemplo, criamos as classes abstrata Funcionario, concreta Diarista e concreta Gerente. Em seguida, criamos alguns objetos de funcionários e os adicionamos a uma lista de funcionários. Utilizamos um loop para chamar polimorficamente o método calcularSalario() para cada funcionário e exibir os resultados.

## 7. 
Crie a hierarquia de herança para o seguinte contexto:

Em uma universidade, os professores podem desenvolver três tipos de projetos: de pesquisa, de extensão e de ensino. Crie uma classe abstrata chamada Projeto que sirva de base para as classes derivadas Pesquisa, Ensino e Extensao. Considere que Pesquisa, Ensino e Extensao são três classes distintas. De comum, tem número (Integer) e título do projeto (String). Os atributos comuns devem estar na superclasse. De diferente, considere:

- Pesquisa: área CNPQ (String), orçamento (Double)
- Extensao: público alvo (String), linha (String)
- Ensino: disciplina (String), curso (String)

Classe abstrata Projeto (superclasse):
```java
public abstract class Projeto {
    private Integer numero;
    private String titulo;

    // Construtor
    public Projeto(Integer numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    // Métodos getters e setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método abstrato a ser implementado pelas subclasses
    public abstract void exibirInformacoes();
}
```

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

