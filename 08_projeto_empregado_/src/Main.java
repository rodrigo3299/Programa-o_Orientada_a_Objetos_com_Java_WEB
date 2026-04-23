public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];
        empregado[0] = new EmpregadoHorista(1, "Rodrigo", 140, 200);
        empregado[1] = new EmpregadoComissionado(2, "Fábio", 110, 100);
        empregado[2] = new EmpregadoHorista(3, "Maria", 120, 300);
        empregado[3] = new EmpregadoComissionado(4, "Marcelo", 180, 400);

        //for tradicional
        for (int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);
            System.out.println();
        }

        //for genérico
        System.out.println("########");
        for(Empregado e : empregado){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println();
        }
    }
}
