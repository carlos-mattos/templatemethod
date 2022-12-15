public class PlanoPadrao extends Plano{
    @Override
    public String consultaDetalhes() {
        return "Telas Simultaneas=2 / Definicao=720p / Modo offline=Sim";
    }

    @Override
    public String getNomePlano() {
        return "Padrao";
    }
}
