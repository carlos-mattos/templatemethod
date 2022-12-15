import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoPremiumTest {

    @Test
    void deveRetornarInformacoesDoPlano(){
        PlanoPremium planoPremium = new PlanoPremium();
        planoPremium.setValorMensal(55.9);
        assertEquals("Premium: {Valor Mensal=55.9, Detalhes=Telas Simultaneas=4 / Definicao=1080p / Modo offline=Sim}", planoPremium.getInfo());
    }

    @Test
    void deveRetornarValorAssinaturaAnual(){
        PlanoPremium planoPremium = new PlanoPremium();
        planoPremium.setValorMensal(55.9);
        assertEquals(570.18, planoPremium.getValorAssinaturaAnual());
    }

}