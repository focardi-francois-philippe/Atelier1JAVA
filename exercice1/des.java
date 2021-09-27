import java.util.*;
/**
 * des
 */

class des {
    protected String nom;
    protected int nbrFaces;
    private static int nbrDeDes = 0;
    protected static Random nbrRandom = new Random();

    public des(){
        des.nbrDeDes++;
        this.nom = "Des n°"+des.nbrDeDes;
        this.nbrFaces = 6;
    }
    public des(String nomDuDes){
        des.nbrDeDes++;
        this.nom = nomDuDes;
        this.nbrFaces = 3;
    }
    public des(int nbrFaces){
        des.nbrDeDes++;
        this.nom = "Des";
        setNbrFaces(nbrFaces);
    }
    public des(String nomDuDes,int nbrFaces){
        des.nbrDeDes++;
        if(nomDuDes != "" || nomDuDes != null)
        {
            this.nom = nomDuDes;
        }
        setNbrFaces(nbrFaces);
        
    }
    public int getNbrFaces() {
        return nbrFaces;
    }
    public void setNbrFaces(int nbrFaces) {
        if(nbrFaces>=3 && nbrFaces <=120)
        {
            this.nbrFaces = nbrFaces;
        }
        else
        {
            System.err.println("Erreur nombre");
            nbrFaces = 6;
        }
    }
    public String getNom(){
        return nom;
    }
    public int lancer(){
        return nbrRandom.nextInt(nbrFaces)+1;
    }
    public int lancer(int nbrDeFois){
        int nombreMaximum = 0;
        int nouveauNombre = 0;
        for(int i =1;i<nbrDeFois;i++)
        {
            nouveauNombre =lancer();
            if(nombreMaximum<nouveauNombre)
            {
                nombreMaximum = nouveauNombre;
            }
        }
        return nombreMaximum;
    }
    public static int getNbrDeDes() {
        return nbrDeDes;
    }

}