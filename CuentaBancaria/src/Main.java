import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in).useDelimiter("\n");
        List<Cuenta> cuentas = new ArrayList<>();
        int i = 0;
        System.out.println("Bienvenido a App My Bank Yamato");

        System.out.println("Por favor ingresa el nombre del titular de la cuenta");
        String nombre = lee.next();
        System.out.println("Ingresa el Saldo de la cuenta");
        double sald = lee.nextDouble();
        Cuenta p1 = new Cuenta(nombre,sald);
        cuentas.add(p1);
        for ( i = 0; i<cuentas.size();i++){
            System.out.println("Ingresa el monto a retirar");
            double retiro = lee.nextDouble();
            System.out.println(cuentas.get(i).setRetiro(retiro));
            System.out.println("Ingresa el monto a depositar");
            double depos = lee.nextDouble();
            System.out.println(cuentas.get(i).setIngreso(depos));
            System.out.println("El saldo en la cuenta es de "+cuentas.get(i).getSaldoDeCuenta());
            System.out.println(cuentas.get(i).muestraDatos());
        }
    }
}