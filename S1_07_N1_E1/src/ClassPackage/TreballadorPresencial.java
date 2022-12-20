package ClassPackage;

public class TreballadorPresencial extends Treballador {
    //region ATTRIBUTES
    private static int gasoline;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public TreballadorPresencial(String nom, String cognom, int preuHora, int inGasoline) {
        super(nom, cognom, preuHora);
        this.gasoline = inGasoline;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public static int getGasoline() {
        return gasoline;
    }

    public static void setGasoline(int benzina) {
        TreballadorPresencial.gasoline = benzina;
    }

    //endregion GETTERS & SETTERS


    //region METHODS
    @Override
    public int calcularSou(int numHoursMonth) {
        return super.calcularSou(numHoursMonth) + this.gasoline;
    }


    //endregion METHODS


}
