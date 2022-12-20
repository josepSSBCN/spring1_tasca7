package ClassPackage;

public class Treballador {
    //region ATTRIBUTES
    private String nom;
    private String cognom;
    private int preuHora;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }


    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(int preuHora) {
        this.preuHora = preuHora;
    }

    //endregion GETTERS & SETTERS


    //region METHODS
    public int calcularSou(int numHours) {
        return numHours * this.preuHora;
    }

    //endregion METHODS


}
