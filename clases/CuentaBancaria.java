package clases;
import java.util.ArrayList;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<CuentaBancaria>();

    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = (int)((Math.random()*(999999-100000))+100000);
        listaDeCuentasBancarias.add(this);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }

    public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> lista) {
        listaDeCuentasBancarias = lista;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if(monto <= saldo) {
            this.saldo -= monto;
        }
    }

    public void despliegaInformacion() {
        System.out.println("Titular: " + titular.getNombre() + " - Nro. Cuenta: " + numeroCuenta + " - Saldo: " + saldo);
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }
}
