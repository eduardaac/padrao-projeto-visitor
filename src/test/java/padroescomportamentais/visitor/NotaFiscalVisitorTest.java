package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Renomeado e focado em testar o cálculo fiscal
class NotaFiscalVisitorTest {

    @Test
    void deveCalcularImpostoParaNotaFiscalServico() {
        // Serviço de R$ 1000.00. O Visitor calcula 10% (R$ 100.00)
        NotaFiscalServico nfServico = new NotaFiscalServico(1000.00);

        NotaFiscalVisitor visitor = new NotaFiscalVisitor();
        double impostoCalculado = visitor.calcularImposto(nfServico);

        // Espera-se 100.00
        assertEquals(100.00, impostoCalculado, 0.001); // 0.001 é a margem de erro
    }

    @Test
    void deveCalcularImpostoParaNotaFiscalProduto() {
        // Produtos: R$ 500.00, Frete: R$ 50.00. Total: R$ 550.00
        // O Visitor calcula 5% sobre o total (R$ 550.00 * 0.05 = R$ 27.50)
        NotaFiscalProduto nfProduto = new NotaFiscalProduto(500.00, 50.00);

        NotaFiscalVisitor visitor = new NotaFiscalVisitor();
        double impostoCalculado = visitor.calcularImposto(nfProduto);

        // Espera-se 27.50
        assertEquals(27.50, impostoCalculado, 0.001); // 0.001 é a margem de erro
    }
}