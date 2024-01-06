# Atividade: Cálculo de Média e Mensagem de Situação Acadêmica

## Descrição da Atividade

Este projeto em Java tem como objetivo fornecer uma compreensão prática do cálculo de média a partir da leitura de quatro notas inseridas pelo usuário. Além disso, o programa emite uma mensagem de acordo com a situação acadêmica do aluno (Aprovado, Recuperação, Reprovado). A atividade busca consolidar o entendimento sobre estruturas de controle condicional e operadores lógicos.

## Estrutura do Código

### Arquivo: Main.java

O arquivo `Main.java` contém o código principal do programa. Ele está estruturado da seguinte maneira:

1. **Pacote e Autoria:**
   - O código está contido no pacote `edu.ebac`.
   - O autor do código é identificado como `vinisantosn`.

2. **Declaração de Variáveis:**
   - `notas`: Lista que armazena as quatro notas inseridas pelo usuário.
   - `totalDeNotasParaLer`: Número total de notas a serem lidas (4 no caso).
   - `somaDasNotas`: Variável que armazena a soma das quatro notas.
   - `mediaDasNotas`: Variável que armazena a média das notas.

3. **Entrada do Usuário:**
   - Utiliza a classe `Scanner` para capturar a entrada do usuário em um loop, solicitando cada uma das quatro notas.

4. **Cálculo de Média:**
   - Calcula a média das notas inseridas.

5. **Determinação da Situação Acadêmica:**
   - Utiliza operadores lógicos para determinar a situação acadêmica do aluno (Aprovado, Recuperação, Reprovado).

6. **Exibição da Mensagem:**
   - Imprime a mensagem correspondente à situação acadêmica do aluno no console.

## Execução do Programa

1. **Compilação:**
   - Antes de executar o programa, é necessário compilá-lo. Isso pode ser feito utilizando um compilador Java, como o `javac`.

     ```bash
     javac Main.java
     ```

2. **Execução:**
   - Após a compilação, o programa pode ser executado com o seguinte comando:

     ```bash
     java Main
     ```

3. **Interatividade:**
   - O programa solicitará ao usuário que insira as quatro notas.
   - Após a entrada do usuário, calculará a média e exibirá a mensagem correspondente à situação acadêmica.

