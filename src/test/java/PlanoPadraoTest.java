import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoPadraoTest {

    @Test
    void deveRetornarInformacoesDoPlano(){
        PlanoPadrao planoPadrao = new PlanoPadrao();
        planoPadrao.setValorMensal(39.9);
        assertEquals("Padrao: {Valor Mensal=39.9, Detalhes=Telas Simultaneas=2 / Definicao=720p / Modo offline=Sim}", planoPadrao.getInfo());
    }

    @Test
    void deveRetornarValorAssinaturaAnual(){
        PlanoPadrao planoPadrao = new PlanoPadrao();
        planoPadrao.setValorMensal(39.9);
        assertEquals(406.98, planoPadrao.getValorAssinaturaAnual());
    }

}