import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoBasicoTest {

    @Test
    void deveRetornarInformacoesDoPlano(){
        PlanoBasico planoBasico = new PlanoBasico();
        planoBasico.setValorMensal(25.9);
        assertEquals("Basico: {Valor Mensal=25.9, Detalhes=Telas Simultaneas=1 / Definicao=480p / Modo offline=Nao}", planoBasico.getInfo());
    }

    @Test
    void deveRetornarValorAssinaturaAnual(){
        PlanoBasico planoBasico = new PlanoBasico();
        planoBasico.setValorMensal(25.9);
        assertEquals(264.18, planoBasico.getValorAssinaturaAnual());
    }

}