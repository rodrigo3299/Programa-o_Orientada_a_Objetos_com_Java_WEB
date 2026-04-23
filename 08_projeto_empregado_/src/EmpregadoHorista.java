public class EmpregadoHorista  extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHora;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double  valorDaHoraTrabalhada){
        super(matricula,nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double caclSalario(){
        return totalDeHorasTrabalhadas * valorDaHora;
    }
}
