/**
 * DesPipe
 */
public class DesPipe extends des{

    private int minValue;

    public DesPipe(int nombreFaces ,String nomValue,int nbrMinimum)
    {
        this.minValue = nbrMinimum+1;
        this.nom = nomValue;
        this.nbrFaces = nombreFaces;
    }
    public int lancer(){
        return nbrRandom.nextInt(minValue)+1;
    }
    
    public String toString() {
        return String.valueOf(this.minValue) ;
    }
}