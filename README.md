##📄 Sistema de Cálculo de Impostos Fiscais (Padrão Visitor)
Este projeto implementa o Padrão de Projeto Comportamental Visitor.

O objetivo principal é separar o algoritmo (cálculo de imposto) da estrutura do objeto (documento fiscal) sobre o qual o algoritmo opera.

A estrutura do objeto (DocumentoFiscal, implementado por NotaFiscalServico e NotaFiscalProduto) possui o método aceitar(Visitor), que "aceita" a visita. O visitante (NotaFiscalVisitor) contém a lógica de negócio específica, como as alíquotas de imposto.

##📌 Diagrama de Classes
![Diagrama UML](diagrama_de_classes.jpeg)

##👩‍💻 Autora
Eduarda Araujo Carvalho
