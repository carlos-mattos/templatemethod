public class PlanoPremium extends Plano{
    @Override
    public String consultaDetalhes() {
        return "Telas Simultaneas=4 / Definicao=1080p / Modo offline=Sim";
    }

    @Override
    public String getNomePlano() {
        return "Premium";
    }
}
