package padroescomportamentais.visitor;

public class NotaFiscalServico implements DocumentoFiscal {

    private double valorDoServico;

    public NotaFiscalServico(double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public double getValorDoServico() {
        return valorDoServico;
    }

    @Override
    public double aceitar(Visitor visitor) {
        return visitor.visitarNotaFiscalServico(this);
    }
}