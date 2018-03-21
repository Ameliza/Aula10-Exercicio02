 [![Build Status](https://travis-ci.com/POO29004-201801/lista-de-exercicios-01-Ameliza.svg?token=XrZxx2vY2D7xppGcZ9GX&branch=master)](https://travis-ci.com/POO29004-201801/lista-de-exercicios-01-Ameliza)

 Ameliza Souza Corrêa

# Programação Orientada a Objetos - POO29004

## Engenharia de Telecomunicações

### Instituto Federal de Santa Catarina



##  Exercício (aula 10)

#### Notas do exercício

> - Crie um projeto no github.com para cada exercício
> - Crie um .gitignore para excluir arquivos do gradle, Java, Linux,
    Jetbrains IDE (IntelliJ)
    Use o site:  https://gitignore.io
> - Crie um arquivo Readme.md com as explicações gerais sobre o projeto
> - Crie um arquivo LICENSE para indicar o licenciamento de software do seu projeto
>  - Use o site:  https://choosealicense.com
>  - Sugestão  MIT License

#### Exercício 02 (Classe para representar tempo)

1. Crie uma classe para representar tempo em termos de hora, minutos e segundos
    > - Com 4 métodos construtores
    > - Uso adequado dos modificadores de acesso
    > - Método chamado toString() que deverá retornar o tempo como String.
        Ex.: 07:30:00
1. Se ao criar um objeto tempo com valores inválidos para hora, minuto ou segundo, então este deve ser criado com o valor 00:00:00
1. A classe deverá implementar métodos que permitam alterar somente hora, somente minuto, somente segundo ou todos de uma só vez
    > - Deve-se retornar true se o valor for alterado com sucesso, false caso contrário
1. A classe deverá implementar um método que recebe um Tempo como parâmetro e retorne um long com a diferença entre este e o tempo do objeto em questão
1. A classe deverá implementar um método que retorne um long com o tempo em segundos.  Ex:  01:00:00 seria retornado:  3600