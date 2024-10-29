import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Karla", 25);
        Persona persona2 = new Persona("Felipe", 24);
        Persona persona3 = new Persona("Matias", 1);

        CuentaBancaria cuenta1 = new CuentaBancaria(10000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(50000, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(3000, persona3);

        cuenta1.depositar(10000);
        cuenta2.retirar(150000);
        cuenta3.retirar(1000);

        System.out.println("Saldo Cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo Cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Saldo Cuenta 3: " + cuenta3.getSaldo());

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
