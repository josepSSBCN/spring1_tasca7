package MainPackage;

import ClassPackage.Treballador;
import ClassPackage.TreballadorOnline;
import ClassPackage.TreballadorPresencial;

public class Main {
    public static void main(String[] args) {
        // DEFINITION VARIABLES
        Treballador myTreballador = new Treballador("Carlos", "Herrera", 200);
        TreballadorPresencial myTreballadorPresencial = new TreballadorPresencial("Iulius", "Magnus Irrumatus", 75, 50);
        TreballadorOnline myTreballadorOnline = new TreballadorOnline("Agustina","De Aragon", 350);


        System.out.println("CLASSE TREBALLADOR: 100 * 200 = " + myTreballador.calcularSou(100));
        System.out.println("CLASSE TREBALLADOR PRESENCIAL: 100 * 75 + 50 = " + myTreballadorPresencial.calcularSou(100));
        System.out.println("CLASSE TREBALLADOR ONLINE: 100 * 350 + 150 = " + myTreballadorOnline.calcularSou(100));


        // ACTIONS



        // OUT


    }
}