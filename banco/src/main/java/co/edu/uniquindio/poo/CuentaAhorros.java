package co.edu.uniquindio.poo;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(String nombre, String apellido, int numeroCuenta, double saldo, Boolean estado,
            double tasaInteres) {
        super(nombre, apellido, numeroCuenta, saldo, estado);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double consultarSaldo() {

        return getSaldo();
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "cuentaAhorro [tasaInteres=" + tasaInteres + ", getTasaInteres()=" + getTasaInteres()
                + ", consultarSaldo()=" + consultarSaldo() + ", getNombre()=" + getNombre() + ", getApellido()="
                + getApellido() + ", getNumeroCuenta()=" + getNumeroCuenta() + ", getSaldo()=" + getSaldo()
                + ", getEstado()=" + getEstado() + "]";
    }

}
