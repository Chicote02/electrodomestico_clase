public abstract class Electrodomestico {
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomestico(java.lang.String tipo, java.lang.String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public abstract double getConsumo(int horas);

    public double getCosteConsumo(int horas, double costeHoras) {
        return getConsumo(horas) * costeHoras;
    }
}
