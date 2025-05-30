package Controllers;

import Models.Casa;
import Models.Inmubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    List<Inmubles> inmublesList = new ArrayList<>();
    double ventasTotal = 0;

    //casa
    public void agregarInmuble(String id, String tipo, boolean estado, double precio, double area, double maxmetrosTerreno, double maxmetrosAltura, int numCuarto){
        Casa casa = new Casa(id,tipo,estado, precio,area, maxmetrosTerreno,maxmetrosAltura, numCuarto);

        inmublesList.add(casa);

    }

    public void crearInmuble(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el id: ");
        String id = sc.nextLine();
        String tipo = "Casa";
        boolean estado = true;
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el area: ");
        double area = sc.nextDouble();
        System.out.println("Ingrese el maximo de metros de terreno: ");
        double maxmetrosTerreno = sc.nextDouble();
        System.out.println("Ingrese el maximo de metros de altura");
        double maxmetrosAltura = sc.nextDouble();
        System.out.println("Ingrese el numero de cuartos");
        int numCuartos = sc.nextInt();

        agregarInmuble(id,tipo,estado,precio,area,maxmetrosTerreno,maxmetrosAltura,numCuartos);

    }

    //departamento

    //terreno

    public void registrarVenta(){
        Scanner sc = new Scanner(System.in);
        listado();
        System.out.println("Ingresa el id del inmuble que desea vender: ");
        String id = sc.nextLine();
        for(Inmubles inmuble : inmublesList){
            if(inmuble.getId().equals(id)){
                ventasTotal += inmuble.getPrecio();
                inmuble.setEstado(false);
            }
        }
    }

    public void listado(){
        int i = 0;
        String tipo;

        for(Inmubles inmuble : inmublesList){

            if (inmuble.getClass().equals(Casa.class)){
                tipo = "Casa";
                System.out.println("#\t\ttipo\t\tPrecio\t\tEstdo\t\tMax terreno\t\tMax altura\t\tnumCuartos");
                if (inmuble instanceof Casa){
                    Casa casa = (Casa) inmuble;
                    System.out.println((i+1)+"\t\t"+casa.getId()+"\t\t"+ tipo +"\t\t"+ casa.getPrecio() +"\t\t"+ casa.isEstado()+"\t\t"+ casa.getMaxmetrosTerreno()+"\t\t"+ casa.getMaxmetrosAltura()+"\t\t"+ casa.getNumCuarto());
                }
            }

        }

    }

    public void busqueda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de inmuble que desea buscar");
        String tipo = sc.nextLine();

        for(Inmubles inmuble : inmublesList){

            if (inmuble.getTipo().equals(tipo)){

                if (inmuble instanceof Casa){
                    System.out.println("Tipo: Casa");
                    Casa casa = (Casa) inmuble;
                    System.out.println("Id: " + casa.getId()+" Precio" + casa.getPrecio());
                }
            }

        }
    }
}
