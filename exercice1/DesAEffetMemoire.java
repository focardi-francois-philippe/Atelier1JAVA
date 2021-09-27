/**
 * DesAEffetMemoire
 */
public class DesAEffetMemoire extends des{

    private int valeurMemoire;

    public DesAEffetMemoire()
    {
        valeurMemoire = -1;
    }
    public int lancer(){
        boolean memoireValue = true;
        int nbrAlea = 0;
        while (memoireValue){
            nbrAlea = nbrRandom.nextInt(nbrFaces+1);
            if(nbrAlea != valeurMemoire)
            {
                memoireValue = false;
                valeurMemoire = nbrAlea;
            }
        }
        return valeurMemoire;
    }
}