package padroescomportamentais.visitor;

public class NotaFiscalProduto implements DocumentoFiscal {

    private double valorDosProdutos;
    private double valorFrete;

    public NotaFiscalProduto(double valorDosProdutos, double valorFrete) {
        this.valorDosProdutos = valorDosProdutos;
        this.valorFrete = valorFrete;
    }

    public double getValorDosProdutos() {
        return valorDosProdutos;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    @Override
    public double aceitar(Visitor visitor) {
        return visitor.visitarNotaFiscalProduto(this);
    }
}