package ClassPackage;

public class TreballadorOnline extends Treballador {
    //region ATTRIBUTES
    private static final int INTERNETCOST = 150;


    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    //endregion CONSTRUCTOR


    //region METHODS

    @Override
    public int calcularSou(int numHours) {
        return super.calcularSou(numHours) + INTERNETCOST;
    }


    //endregion METHODS


}
