# Conversor Base64 para Android

Este projeto Android permite a conversão de texto para Base64 e a decodificação de Base64 para texto normal. A interface de usuário é simples, com uma caixa de texto para entrada, duas opções de botões para conversão e decodificação, e um campo de texto onde o resultado é exibido.

## Funcionalidades

- **Conversão para Base64**: Converte o texto inserido na caixa de texto para seu equivalente codificado em Base64.
- **Decodificação de Base64**: Decodifica um texto em Base64 para o formato normal, exibindo o resultado na tela.
- **Interface Simples**: Uma linha horizontal divide a tela, com a entrada na parte superior e a saída na parte inferior. Dois botões permitem a conversão e decodificação.
  
## Estrutura do Projeto

- **MainActivity.java**: O arquivo principal do código Java que lida com a lógica de conversão e decodificação. O código utiliza a classe `Base64` do Android para realizar as operações.
- **activity_main.xml**: Layout XML definindo a estrutura da interface de usuário, incluindo EditText, TextView, e botões.
- **colors.xml**: Definições de cores para a interface de usuário.
- **styles.xml**: Estilos personalizados para os elementos de UI.

## Como Executar

1. **Clone o Repositório**:
    ```bash
    git clone https://github.com/seu-usuario/conversor-base64.git
    ```
   
2. **Abra o Projeto no Android Studio**:
    - Navegue até a pasta do projeto clonado e abra-o no Android Studio.

3. **Compile e Execute**:
    - Conecte um dispositivo Android ou utilize o emulador do Android Studio para rodar o aplicativo.

## Exemplos de Uso

1. **Converter para Base64**:
    - Insira o texto desejado na caixa de texto superior.
    - Clique no botão "Converter para Base64".
    - O texto codificado aparecerá na caixa de texto inferior.

2. **Decodificar de Base64**:
    - Insira um texto codificado em Base64 na caixa de texto superior.
    - Clique no botão "Decodificar Base64".
    - O texto decodificado aparecerá na caixa de texto inferior.

## Requisitos

- Android Studio 4.0 ou superior.
- SDK do Android 21 (Lollipop) ou superior.
