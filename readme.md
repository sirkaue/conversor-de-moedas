# Currency Converter

## Descrição

O Currency Converter é uma aplicação Java que permite aos usuários converter valores entre diferentes moedas com base em taxas de câmbio fornecidas pela API ExchangeRate-API. A aplicação foi desenvolvida para simplificar tarefas de conversão de moedas, tornando-a uma ferramenta útil para usuários que lidam frequentemente com múltiplas moedas.

## Funcionalidades

- **Conversão de Moedas:** Permite converter valores entre diferentes moedas com base nas taxas de câmbio fornecidas.
- **Interface de Linha de Comando:** É executada através de uma interface de linha de comando, facilitando o uso para usuários familiarizados com essa forma de interação.

## Como Usar

1. **Executar a Aplicação:** Para executar a aplicação, navegue até o diretório do projeto no terminal e execute o comando `java Main`.
2. **Selecionar Moedas:** Após a execução, a aplicação solicitará que o usuário insira a moeda de origem, o valor desejado e em seguida a moeda de destino. (Caso já existam conversões salvas, o programa perguntará se o usuário deseja consultá-las antes de exibir as possibilidades de conversão).
3. **Resultado:** A aplicação exibirá o valor de uma unidade da moeda de origem convertida na moeda de destino com base na taxa de câmbio atual.
4. Após a realização de cada conversão, a aplicação perguntará ao usuário se ele deseja continuar fazendo outras conversões ou simplesmente sair da aplicação.
5. A aplicação exibirá uma lista das conversões realizadas (caso exista mais de uma conversão realizada, ou simplesmente a única conversão realizada).
6. Antes de ser encerrada, a aplicação perguntará ao usuário se ele deseja salvar as conversões realizadas.

## Requisitos

- A aplicação foi desenvolvida e testada com a versão 17 do Java, mas deve funcionar com Java a partir da versão 11.
- **Jackson:** Utiliza o Jackson para realizar a conversão de objetos Java em JSON e vice-versa. A versão utilizada é a 2.17.0 do Jackson.
- **Chave de API:** Para utilizar a API do CurrencyApi é necessário obter uma chave de API. Para obtê-la, é necessário se cadastrar em uma conta no CurrencyApi e gerá-la.

## Estrutura do Projeto

- **src/:** Contém os arquivos de código-fonte da aplicação.
    - **CurrencyConverterApplication.java:** Ponto de entrada da aplicação, onde a lógica de conversão de moedas é implementada.
    - **CurrencyConverterDto.java:** Define uma classe para representar os atributos e métodos para a implementação da conversão.
    - **ApiService.java:** Classe responsável por fazer chamadas à API CurrencyApi para obter as taxas de câmbio entre as moedas.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE). Veja o arquivo LICENSE para mais detalhes.