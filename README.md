## EXERCÍCIOS POO

1- Após a sua formação no Catalisa, o pessoal te redirecionou para o cliente chamado ICarros. No seu primeiro dia de trabalho,
a sua tech lead te pediu que crie um sistema simples de registro de carros para que o time comece a catalogar
os tipos de carros que o cliente possui para financiamento. Ela te passou que, por
enquanto, o cliente trabalha apenas com 3 marcas de carros, sendo Renault, Fiat e
Hyundai e todos os carros possuem as seguintes informações:
- Marca;
- Ano;
- Valor;
- Cor;
- Portas;
- Velocidade.
Depois, sua tech lead lhe informou que todos os carros iniciam a partida do motor,
freiam e aceleram, porém, cada um faz isso de uma forma diferente.

Para o carro Renault, considere o seguinte:
Quando ele inicia a partida do carro, ele mostra a mensagem: “Iniciando o motor...
minha velocidade está em [VELOCIDADE]” e a velocidade é igual a zero km/h.
Quando ele freia, ele mostra a mensagem: "Freando... minha velocidade está em
[VELOCIDADE]" e a velocidade perde 5km/h a cada chamada do freio, ou seja, a
cada chamada do método frear.
Quando ele acelera, ele mostra a mensagem: “Acelerando... minha velocidade está
em [VELOCIDADE]”, a velocidade aumenta em 10km/h a cada pisada no
acelerador, ou seja, a cada chamada do método acelerar.

Para o carro Fiat, considere o seguinte:
Quando ele inicia a partida do carro, ele mostra a mensagem: “Iniciando o motor...
minha velocidade está em [VELOCIDADE]” e a velocidade é igual a 3 km/h.
Quando ele freia, ele mostra a mensagem: "Freando... minha velocidade está em
[VELOCIDADE]" e a velocidade perde 6km/h a cada chamada do freio, ou seja, a
cada chamada do método frear.
Quando ele acelera, ele mostra a mensagem: “Acelerando... minha velocidade está
em [VELOCIDADE]”, a velocidade aumenta em 12km/h a cada pisada no
acelerador, ou seja, a cada chamada do método acelerar.

Para o carro Hyundai, considere o seguinte:
Quando ele inicia a partida do carro, ele mostra a mensagem: “Iniciando o motor...
minha velocidade está em [VELOCIDADE]” e a velocidade é igual a 5km/h.
Quando ele freia, ele mostra a mensagem: "Freando... minha velocidade está em
[VELOCIDADE]" e a velocidade perde 2km/h a cada chamada do freio, ou seja, a
cada chamada do método frear.
Quando ele acelera, ele mostra a mensagem: “Acelerando... minha velocidade está
em [VELOCIDADE]”, a velocidade aumenta em 15km/h a cada pisada no
acelerador, ou seja, a cada chamada do método acelerar.

Ela também te pediu para criar, ou seja, instanciar no método main, pelo menos um exemplo de cada marca de carros feito para que, quando o time rodar o programa,
as pessoas possam ver como fica o registro e comportamento desses carros no sistema.

2. Elabore um sistema para biblioteca no qual a pessoa bibliotecária possa registrar pelo menos 3 tipos diferentes de gêneros de livros, o nome do livro, o ISBN e a
pessoa autora do livro. Crie alguns livros exemplo e mostre em tela as informações de cada livro criado.
Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o ISBN e deve mostrar em tela a mensagem “O livro foi registrado
com o isbn [ISBN]”.

Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o ISBN e o nome do livro e deve mostrar em tela a mensagem “O livro
foi registrado com o isbn [ISBN] e o nome [NOME]”.

Adicione também o método registrarLivro, onde seja possível registrar um livro apenas com o ISBN, nome do livro e o gênero e deve mostrar em tela a mensagem “O livro foi registrado com o isbn [ISBN], o nome [NOME] e o gênero
[GENERO]”.

Adicione também o método registrarLivro, onde seja possível registrar um livro com todos os atributos e deve mostrar em tela a mensagem “O livro foi registrado com
todos os atributos”.

Crie um objeto para cada método no método main.

3. Crie uma classe pública denominada Funcionário. Esta classe deve possuir os
atributos nome, dataAdmissao e salario. Todos os atributos devem ser privados.
- Crie os getters e setters necessários da sua classe Funcionário.
- Crie uma classe pública denominada Main, que contém um método main. Nesse
método crie três instâncias da classe Funcionário,fornecendo os atributos através
dos métodos de acesso (getters e setters).
- Adicione um atributo estático na classe Funcionário de tipo int que se chama
identificador. Esse identificador deve ser um valor único para cada instância do tipo
Funcionário. O primeiro funcionário instanciado deve ter o identificador 1, o
segundo 2 e assim por diante. Isto deve ser feito automaticamente na classe
Funcionário, com uso do construtor.
- Crie os getters e os setters necessários para os identificadores.
- Adicione uma validação no método setSalario de forma que não seja permitido
adicionar um salário inferior a R$ 700,00.
- Adicione uma validação no método setDataAdmissao, de forma que não seja
permitido adicionar uma data no futuro.
