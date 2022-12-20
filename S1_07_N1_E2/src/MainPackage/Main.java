package MainPackage;

import ClassPackage.Treballador;
import ClassPackage.TreballadorOnline;
import ClassPackage.TreballadorPresencial;

public class Main {
    // EXERCICI S1_07_N1_E2: x eliminar els warinigs dels mètode deprecated
    @SuppressWarnings("deprection")
    public static void main(String[] args) {
        // DEFINITION VARIABLES
        String text = "";
        Treballador myTreballador = new Treballador("Carlos", "Herrera", 200);
        TreballadorPresencial myTreballadorPresencial = new TreballadorPresencial("Iulius", "Magnus Irrumatus", 75, 50);
        TreballadorOnline myTreballadorOnline = new TreballadorOnline("Agustina", "De Aragon", 350);
        // EXERCICI S1_07_N1_E2
        TreballadorPresencial myTreballadorPresencial2 = new TreballadorPresencial("Augusto", "Hernadnez", 150,50, 200);
        TreballadorOnline myTreballadorOnline2 = new TreballadorOnline("Susan",  "Kare", 150, 15);


        // ACTIONS
        try {
            text += "**** EXERCICI S1_07_N1_E1 ****\r\n";
            text += "CLASSE TREBALLADOR: 100 * 200 = " + myTreballador.calcularSou(100) + "\r\n";
            text += "CLASSE TREBALLADOR PRESENCIAL: 100 * 75 + 50 = " + myTreballadorPresencial.calcularSou(100) + "\r\n";
            text += "CLASSE TREBALLADOR ONLINE: 100 * 350 + 150 = " + myTreballadorOnline.calcularSou(100) + "\r\n";

            text += "\r\n**** EXERCICI S1_07_N1_E2 ****\r\n";
            text += "CLASSE TREBALLADOR PRESENCIAL METODE DEPRECATED 'calcularSouOld': 100 * 150 = " +
                    myTreballadorPresencial2.calcularSouOld(100) + "\r\n";
            text += "CLASSE TREBALLADOR PRESENCIAL METODE DEPRECATED 'calcuarHoresExtres': 100 * 150 = " +
                    myTreballadorPresencial2.calcuarHoresExtres(100) + "\r\n";
            text += "CLASSE TREBALLADOR ONLINE METODE DEPRECATED 'calcularSouOld': 100 * 150 + 15 * 50 = " +
                    myTreballadorOnline2.calcularSouOld(100, 50) + "\r\n";


        } catch (Exception ex) {
            text = ex.getMessage();
        }


        // OUT
        System.out.println(text);


    }
}