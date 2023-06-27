# Exercícios - Capítulos 4 e 6

## Classe Cachorro

- Atributos:
    - raca (String): raça do cachorro
    - nome (String): nome do cachorro
- Métodos:
    - Construtores:
        - Cachorro(): construtor sem parâmetros que inicia a raça como "indeterminada" e o nome como vazio.
        - Cachorro(nome: String): construtor que recebe apenas o nome e inicia a raça como "indeterminada".
        - Cachorro(raca: String, nome: String): construtor que recebe a raça e o nome do cachorro.
    - Getters e Setters para os atributos raca e nome.
    - latir(): método que imprime na tela a mensagem "auau".
    - latirRepetido(vezes: int): método que imprime a mensagem "auau" um número de vezes especificado pelo parâmetro vezes. 
    > Restrições: se vezes for menor que zero, a mensagem será "bugou"; se for maior que 100, a mensagem será "parâmetro inválido".
## Classe Container
- Atributos:
    - capacidade (double): capacidade do container em metros quadrados
    - ocupado (boolean): indica se o container está ocupado ou não
- Métodos:
    - Construtores:
        - Container(): construtor sem parâmetros que inicia a capacidade com 0.0 e ocupado com false.
        - Container(capacidade: double, ocupado: boolean): construtor que recebe os valores para os atributos capacidade e ocupado.
    - Getters e Setters para os atributos capacidade e ocupado.
    - ocupar(medida: double): método que recebe a medida (em m²) do conteúdo a ser ocupado no container. 
    > O método verifica se a medida é menor ou igual à capacidade e se o container não está ocupado. Se essas condições forem atendidas, o método muda o valor de ocupado para true e retorna true. Caso contrário, retorna false.
## Classe BombaDeGasolina
- Atributos:
    - tanque (double): quantidade de combustível no tanque (inicia com 5000)
    - precoLitro (double): preço por litro de combustível (inicia em 5.20)
litrosVendidos (double): quantidade de litros vendidos (inicia em 0)
    - valorVendas (double): valor total das vendas (inicia em 0)
- Métodos:
    - abastecerPorLitro(litros: double): método que recebe a quantidade de litros que o cliente deseja abastecer. 
    > O método retira essa quantidade do tanque, incrementa os litros vendidos e calcula e incrementa o valor das vendas.
    - abastecerPorDinheiro(valor: double): método que recebe a quantidade em reais que o cliente deseja abastecer. 
    > O método incrementa o valor das vendas, calcula a quantidade de litros correspondente ao valor fornecido, retira essa quantidade do tanque e incrementa os litros vendidos.
    - status(): método que retorna a quantidade de litros disponíveis no tanque.
## Classe Util
- Métodos estáticos:
    - ehPar(numero: int): recebe um inteiro e retorna verdadeiro se o número for par, ou falso se for ímpar.
    - ehNegativo(numero: int): recebe um inteiro e retorna verdadeiro se ele for menor que zero, ou falso caso contrário.
    - maior(numero1: double, numero2: double): recebe dois números do tipo double e retorna o maior deles.
- Método com parâmetros variáveis (varargs)
    - Método encontrarMaior(int... numeros): método com parâmetros de quantidade variável que recebe uma lista de números inteiros e retorna o maior número entre eles.
## Classe Teste
- Método main(): método de teste onde são realizadas as chamadas e testes das classes e métodos mencionados acima.