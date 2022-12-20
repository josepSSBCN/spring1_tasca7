package ClassPackage;

public class TreballadorPresencial extends Treballador {
    //region ATTRIBUTES
    private static int gasoline;
    @Deprecated
    private static int costExtraHour;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public TreballadorPresencial(String nom, String cognom, int preuHora, int inGasoline) {
        super(nom, cognom, preuHora);
        this.gasoline = inGasoline;
    }

    @Deprecated
    public TreballadorPresencial(String nom, String cognom, int preuHora, int inGasoline, int costExtraHour) {
        super(nom, cognom, preuHora);
        this.gasoline = inGasoline;
        this.costExtraHour = costExtraHour;
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

    @Deprecated
    public int calcularSouOld(int numHoursMonth){
        return numHoursMonth * super.getPreuHora();
    }

    @Deprecated
    public int calcuarHoresExtres(int numHoursMonth){
        return numHoursMonth * this.costExtraHour;
    }


    //endregion METHODS


}
