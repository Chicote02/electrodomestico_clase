public class Lavadora extends Electrodomestico{
    //Constantes:
    protected final static String TIPO = "Lavadora";

    //Atributos:
    protected double precio;
    protected boolean aguaCaliente;

    //Constructores:
    public Lavadora(String marca, double potencia) {
        super(TIPO, marca, potencia);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super(TIPO, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    //Métodos públicos:
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                "} " + super.toString();
    }

    @Override
    public double getConsumo(int horas) {
        if (!this.aguaCaliente) {
            return horas * this.potencia;
        } else {
            return horas * (this.potencia + this.potencia * 0.2);
        }
    }
}
