package padroescomportamentais.visitor;

public interface Visitor {
    double visitarNotaFiscalServico(NotaFiscalServico nf);
    double visitarNotaFiscalProduto(NotaFiscalProduto nf);
}