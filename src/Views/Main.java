package Views;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execut
//Una inmobilaria necesit aa un software qeu le permite gestionar los inmubles, los cules se diferencian en 3 tipos: casa, departamento y terreno
// funcionalidades: registrar los bienes inmubles, poder registrar una venta de los binenes inmubles, poder listar todos los bienes inmubles, poder buscar
//los bienes inmubles por tipo

import Controllers.Sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema si = new Sistema();
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while(opc!=5){

            System.out.println("Menu");
            System.out.println("1. Registro");
            System.out.println("2- Venta");
            System.out.println("3. Lsita");
            System.out.println("4. Busqueda");
            System.out.println("Salir");
            System.out.println("Ingrese la opcionb");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingresa el tipo de inmuble que deseas crear");

                    si.crearInmuble();
                    break;
                case 2:
                    si.registrarVenta();
                    break;
                case 3:
                    si.listado();
                    break;
                case 4:
                    si.busqueda();
                    break;
                case 5:
                    System.out.printf("Saliendo...");
                    break;
            }
        }
    }
}