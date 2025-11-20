package padroescomportamentais.visitor;

public class NotaFiscalVisitor implements Visitor {

    // Método auxiliar para realizar a visita e obter o resultado do cálculo
    public double calcularImposto(DocumentoFiscal documento) {
        return documento.aceitar(this);
    }

    @Override
    public double visitarNotaFiscalServico(NotaFiscalServico nf) {
        // Exemplo de cálculo: 10% de imposto sobre o valor do serviço
        return nf.getValorDoServico() * 0.10;
    }

    @Override
    public double visitarNotaFiscalProduto(NotaFiscalProduto nf) {
        // Exemplo de cálculo: 5% de imposto sobre o total (produtos + frete)
        double total = nf.getValorDosProdutos() + nf.getValorFrete();
        return total * 0.05;
    }
}