Biblioteca
==========

Projeto de uma biblioteca que possibilita o cadastro e empréstimos de livros.

## Instalação

* Baixe e instale o git para seu sistema operacional.
* Clone esse projeto.
* Execute o gradle-wrapper para configurar o projeto.
* Importe seu projeto para eclipse como projeto existente no workspace.

Pronto!

### Linux

    sudo apt-get install git
    cd pasta/destino/do/projeto
    git clone git@github.com:pbenety/biblioteca.git
    cd biblioteca
    ./gradlew cleanEclipse eclipse
    
### Windows

* baixe e instale o git (http://git-scm.com/download/win)
* abra o git-shell

    ```
    cd pasta\destino\do\projeto
    git clone git@github.com:pbenety/biblioteca.git
    cd biblioteca
    gradlew.bat cleanEclipse eclipse
    ```
    
## Acompanhamento progressivo

* O projeto está dividido em etapas, onde através delas você pode acompanhar o progresso da aplicação, para isso basta navegar através das tags do projeto.

    ```
    git checkout -f tag
    ```
    
### Início

* Fase inicial do projeto contendo somente a configuração inicial.

    ```
    git checkout -f inicio
    ```

### Primeiros Passos

* Projeto contendo os primeiros conceitos básicos de JPA e JSF.
* Inclusão do JPAUtil com as principais comandos utilizados pelo JPA e da entidade Livro.
* Inclusão das primeiras páginas do JSF e do primeiro managed bean.

    ```
    git checkout -f primeirosPassos
    ```
