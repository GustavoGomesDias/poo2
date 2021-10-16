
Exercício -  Fábrica Abstrata  - Modelo de classe tema interface. 
Esse aplicativo de edição de texto permite ao usuário customizar a interface. Dessa forma, ele pode alterar se ele quer uma interface com ícones ou sem ícones. 


Ao executar a classe TelaInicial aparecerá um tema a ser escolhido. Como na imagem abaixo.

![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Criação/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_inicial.png)

Ao selecionar o tema o usuário pode acessar o menu "Edição" que abrirá a tela abaixo:

![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Criação/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_edicao.png)


Altere a classe EditorTexto para que sejam utilizadas as classes BotaoOK e BotaoCancel.
Esses botões são diferenciados por possuir um ícone. Como destacado na imagem abaixo:


![alt text](https://github.com/felipefo/poo2/blob/master/Padroes_de_Projeto/Criação/fabrica_abstrata/FabricaAbstrataTemaInterface/tela_tema2.png)


Dessa forma, o usuário pode configurar sua tela para utilizar com ou sem ícones.
Além das classes BotaoOK e BotaoCancel utilize também a classe FabricaAbstrataBotoes como base para criar suas Fábricas concretas.
Crie classe FabricaPadrão utilizando a classe JButton e para os botões com ícones crie a classe FabricaBotoesIcones utilizando BotaoOK e BotaoCancel.
Faça também o diagrama de classe da sua solução.
