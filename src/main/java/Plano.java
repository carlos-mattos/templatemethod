public abstract class Plano {

    private double valorMensal;

    public void setValorMensal(double valorMensal){
        this.valorMensal = valorMensal;
    }

    public double getValorMensal(){
        return valorMensal;
    }

    public abstract String consultaDetalhes();

    public String getNomePlano() {
        return "Basico";
    }

    public double getValorAssinaturaAnual() {
        return (double) Math.round(0.85 * valorMensal * 12 * 100) / 100;
    }

    public String getInfo() {
        return getNomePlano() + ": {" +
                "Valor Mensal=" + valorMensal +
                ", Detalhes=" + consultaDetalhes() +
                '}';
    }

}
