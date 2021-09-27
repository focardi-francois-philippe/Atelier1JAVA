public class DesAFacesAutres extends des{

    int []elementDuDes;
    int nbr_element;
    public DesAFacesAutres() {
        super("Francois",10);
        nbr_element = nbrFaces/2;
        elementDuDes = new int[nbrFaces/2];
        for(int i = 2,j=0;i<=nbrFaces && j<nbr_element;i+=2,j++)
        {
            this.elementDuDes[j] = i;
        }
    }
    public int lancer(){
        int retour =  nbrRandom.nextInt(nbr_element);
        return this.elementDuDes[retour];
    }
}
