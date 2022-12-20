package ClassPackage;

public class TreballadorOnline extends Treballador {
    //region ATTRIBUTES
    private static final int INTERNETCOST = 150;
    @Deprecated
    private int heatingCostHour;


    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }

    public TreballadorOnline(String nom, String cognom, int preuHora, int heatingCostHour) {
        super(nom, cognom, preuHora);
        this.heatingCostHour = heatingCostHour;
    }

    //endregion CONSTRUCTOR


    //region METHODS

    @Override
    public int calcularSou(int numHours) {
        return super.calcularSou(numHours) + INTERNETCOST;
    }

    @Deprecated
    public int calcularSouOld(int numHours, int heatingHours){
        return super.calcularSou(numHours) + heatingHours * this.heatingCostHour;

    }

    //endregion METHODS


}
