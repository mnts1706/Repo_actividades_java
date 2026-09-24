//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int edad = 20;
        double descuento = 0.10;   //Esta variable solo indica el valor del descuento, aún no se calcula;

        double total = 50000;
        double totalFinal = total - (total * descuento);

        System.out.println("El valor final con el descuento aplicado es de: " +totalFinal);

        /*Esta operacion permite calcular el descuento
         se resta al valor total que se maneja
        y así obtenemos el valor final total.*/

    }
}