public class Main {
    public static void main(String[] args) {
        MonitorEnergia_ex01 monitor = new MonitorEnergia_ex01(10);
        monitor.registrar(2);
        monitor.registrar(1);
        monitor.registrar(3);
        monitor.registrar(4);
        monitor.registrar(2);
        monitor.registrar(1);

        System.out.println("Média de consumo" +monitor.calcularMedia());
        System.out.println("Média do intervalo: " +monitor.calcularMedia(3,5));

    }
}
