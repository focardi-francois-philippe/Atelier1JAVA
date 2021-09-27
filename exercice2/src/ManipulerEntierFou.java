import java.lang.Math;


public class ManipulerEntierFou extends ManipuleEntier{
    private int niveauDeFolie;
    
    public ManipulerEntierFou(int niveauDeFolie,int entier)
    {
        super(10, 80, entier);
        this.niveauDeFolie = niveauDeFolie;
    }
    public void incremente()
    {
        int nombreAlea =   (int)((Math.random()*10)%niveauDeFolie);
        setEntier(entier += nombreAlea);
    }
    public String toString() {
       
        return "Valeur de l'entier "+String.valueOf(entier);
    }
}
