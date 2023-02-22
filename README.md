# Android Activity Lifecycle

A activity de uma aplicação é basicamente a tela do aplicativo, é por onde o usuário interage com o aplicativo a partir do layout que aparece nesta tela.

Toda activity tem um ciclo de vida e conforme o usuário interage com o aplicativo essa activity passa por diferentes estados, desde o momento que é criada, quando o usuário entra no aplicativo, até o momento que é destruída, quando o usuário fecha totalmente o aplicativo.

Seguindo o exemplo abaixo, quando o usuário entra na aplicativo e navega por ele o comportamento das activities será:


No ciclo de vida da activity existem alguns métodos: onCreate(), onPause(), onResume(), onStop(), onDestroy() e abaixo vou resumir de forma objetiva o que cada um faz.


##onCreate()

• Primeiro método a ser executado;

• É executado uma única vez;

• “o que quero ver na tela”;

• Define a interface gráfica (imagens, texto, botões que serão carregados no layout); • Inicialização de variáveis imutáveis.

##OnStart()

• É chamado na inicialização da activity, após o onCreate, e também quando uma activity que estava em background volta a ter foco;

• Pode ser chamada mais de uma vez;

• Torna a activity visível para o usuário;

• É nesse método que o aplicativo inicializa o código que mantém a UI (user interface).

##OnResume()

• É o último método chamado antes do app estar pronto para o usuário interagir;

• Assim como o onStart, este método é chamado logo após o onCreate, e também quando uma activity que estava em background volta a ter foco;

• Pode ser chamada mais de uma vez;

• A maior parte das funcionalidades do app são implementadas neste método (listeners, funcionalidade como mapa, vídeos, etc.).

##onPause()

• Primeiro método executado quando a aplicação deixa de estar disponível;

• Pode ser executado vários vezes;

• Chamado quando a activity “perde o foco”;

• Utilizado, por exemplo, para “cancelar” o registro de listeners, parar tarefas iniciadas no onResume();

• Ocorre quando o usuário clica no “voltar” ou “recentes”.

##OnStop()

• Chamado quando a activity não está mais visível para o usuário;

• Pode ser chamado várias vezes.

##onDestroy()

• Chamado antes da activity ser destruída;

• Último método a ser executado;

• Limpa os recursos que ainda estejam sendo utilizados.

O ciclo de vida permite o gerencimento da transição de informações entre uma atividade e outra dentro do aplicativo, nos auxiliam a adicionar certas características para as nossas telas.


