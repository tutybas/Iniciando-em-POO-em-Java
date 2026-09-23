# POO — Semana 06

Projeto de exercícios em Java sobre classes e objetos, com cálculo de área de triângulo, raízes de equações do segundo grau e idade. A entrada e a exibição de dados utilizam caixas de diálogo do Swing (`JOptionPane`).

## Funcionalidades

| Funcionalidade | Descrição |
| --- | --- |
| Área de triângulo | Recebe base e altura como números decimais e calcula a área pela expressão `(base × altura) / 2`. |
| Equação do segundo grau | Recebe coeficientes inteiros, calcula o discriminante e informa a ausência de raízes reais, uma raiz ou duas raízes. |
| Consulta de nome e idade | Recebe nome e data de nascimento e oferece um menu para exibir o nome, consultar a idade, alterar a data de nascimento ou sair. |
| Exemplos com pessoas históricas | Cria objetos para Albert Einstein e Isaac Newton e exibe seus nomes e as idades que teriam na data consultada pelo programa. |

## Sobre a organização do código

Os exercícios estão separados nos pacotes `Triangulo`, `SegundoGrau` e `Idade`. Cada pacote possui classes com método `main`, permitindo executar as atividades de forma independente.

Em `Triangulo`, a classe `Area` conduz a entrada e a saída de dados, enquanto `Triangulo` mantém as medidas e calcula a área. Essa divisão permite separar a interação com o usuário da operação matemática.

Em `SegundoGrau`, `Equacao` recebe os coeficientes e utiliza `Calculo` para determinar as raízes. Nesse exercício, a própria classe de cálculo também apresenta os resultados por meio de diálogos.

No pacote `Idade`, `Pessoa` reúne os dados de nascimento, o cálculo da idade e os métodos de exibição. Ela é reutilizada tanto pelo menu interativo de `Idade` quanto pelos exemplos predefinidos de `genios`, evitando duplicar a regra de cálculo.

O projeto está identificado como `POO` nos arquivos do NetBeans e possui configuração de build com Apache Ant. O arquivo `nbproject/project.properties` define Java 24 para compilação, codificação UTF-8 e `Triangulo.Area` como classe principal. Não há bibliotecas externas declaradas no classpath de compilação.

## Classes, objetos e cálculo de idade

O foco dos exercícios é representar dados em objetos e utilizar métodos para atualizar esses dados e realizar cálculos. As classes `Triangulo`, `Calculo` e `Pessoa` possuem atributos e construtores, e são instanciadas pelas classes que iniciam cada atividade.

O exemplo `genios` demonstra a criação de duas instâncias independentes de `Pessoa`, cada uma com sua data de nascimento. O cálculo usa a data obtida por `LocalDate.now()` na criação do objeto, subtrai o ano de nascimento e desconta um ano quando o aniversário ainda não ocorreu.

Há tratamento de `NumberFormatException` nas entradas numéricas dos exercícios interativos. Esse tratamento não equivale à validação dos valores: o código não verifica datas de nascimento válidas, medidas positivas ou se o coeficiente `a` é diferente de zero. Em `Equacao`, uma falha de conversão ainda é seguida pela chamada do cálculo, sem nova tentativa de entrada.

## Aprendizados aplicados

- Declaração de classes, atributos, construtores e métodos de instância.
- Criação de objetos e reutilização de uma classe em diferentes programas.
- Organização do código em pacotes e divisão de responsabilidades entre classes.
- Entrada e saída de dados com `JOptionPane`.
- Conversão de texto para números com `Integer.parseInt` e `Float.parseFloat`.
- Tratamento de erros de conversão com `try` e `catch`.
- Uso de condicionais, laços `while` e seleção com `switch`.
- Aplicação de fórmulas matemáticas e uso de `Math.sqrt`.
- Consulta da data atual com `LocalDate` e ajuste da idade conforme o aniversário.
