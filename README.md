Este projeto foi desenvolvido como exercício de fixação com foco em Separação de Responsabilidades, aplicado em Java.

A proposta foi criar um programa capaz de:

Receber um valor do Índice de Qualidade do Ar (IQA)

Classificar a qualidade do ar

Informar os efeitos correspondentes à saúde da população

O exercício simula uma necessidade real da Secretaria de Meio Ambiente: conscientizar a população sobre os impactos da qualidade do ar.

🎯 Objetivo Técnico

Aplicar o princípio de Separação de Responsabilidades, garantindo que cada parte do sistema tenha uma única função bem definida.

Ou seja:

Uma parte do código é responsável pela entrada de dados

Outra pela regra de classificação

Outra pela regra dos efeitos na saúde

Outra pela exibição das informações

Essa abordagem melhora:

Legibilidade

Organização

Manutenção

Testabilidade

Escalabilidade

🧠 Regras de Negócio Implementadas
📊 Classificação do IQA
Índice	Classificação
0 – 50	Boa
51 – 100	Regular
101 – 199	Inadequada
200 – 299	Má
300 – 399	Péssima
≥ 400	Crítica

🏥 Efeitos na Saúde
Índice	Efeitos
0 – 100	Ausência de sintomas
101 – 199	Leve agravamento em pessoas suscetíveis
200 – 299	Decréscimo da resistência física
300 – 399	Aparecimento prematuro de doenças
≥ 400	Morte prematura de pessoas doentes e idosas
🛠️ Conceitos Aplicados

Durante o desenvolvimento foram utilizados:

✅ Java

✅ Estruturas condicionais (if/else)

✅ Operadores relacionais

✅ Entrada de dados com Scanner

✅ Métodos com responsabilidades bem definidas

✅ Organização lógica do código

✅ Princípio da Responsabilidade Única (Single Responsibility Principle – SRP)

✅ Separação entre regra de negócio e interação com o usuário
