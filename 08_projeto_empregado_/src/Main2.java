import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Empregado> list = new ArrayList<>();
        list.add(new EmpregadoHorista(1, "A0", 10, 10));
        list.add(new EmpregadoComissionado(2, "B", 100, 20));

        // for tradicional
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).nome);
        }

        // for genérico
        for (Empregado e : list){
            System.out.println(e.toString());
        }

    }
}
