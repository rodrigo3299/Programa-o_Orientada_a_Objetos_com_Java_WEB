public class Moto extends Veiculo{
    private int numCilindradas;

    public Moto(String placa, String marca, int numCilindradas) {
        super(placa, marca);
        this.numCilindradas = numCilindradas;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Número de cilindradas" +numCilindradas;
        return aux;
    }

    public int getNumCilindradas() {
        return numCilindradas;
    }

    public void setNumCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }
}
