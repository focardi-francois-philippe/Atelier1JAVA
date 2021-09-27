import java.util.Scanner;
public class App {
    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);
        System.out.println("Entrez le nombre de faces");
        int nbrFaces = myScan.nextInt();
        System.out.println("Ainsi que son nom");
        String nomDuString = myScan.nextLine();


        des myDes = new des(6);
        des myDes2 = new des();
        des myDes3 = new des(nomDuString,nbrFaces);
        DesPipe monDesPipe = new DesPipe(10,"Francois",6);
        DesAFacesAutres monDesAFacesAutres = new DesAFacesAutres();
        System.out.println(monDesPipe.getNom()+"\n\n\n");
        System.out.println("Meilleur lancer "+myDes3.lancer(50));
        System.out.println("Nombre de des "+des.getNbrDeDes());
        System.out.println("Nom: "+myDes.getNom() + "Nombres de faces " + myDes.getNbrFaces());
        System.out.println("Nom: "+myDes.getNom() + "Nombres de faces " + myDes2.getNbrFaces());
        System.out.println("Nom: "+myDes.getNom() + "Nombres de faces " + myDes3.getNbrFaces());
        System.out.println("la valeurs minimum est "+monDesPipe + "valeur du lancer :" +monDesPipe.lancer());
        System.out.println("la valeurs minimum est "+monDesPipe + "valeur du lancer :" +monDesPipe.lancer());
        System.out.println("La valeur du lancer est DES A FACES AUTRES"+ monDesAFacesAutres.lancer());
        myScan.close();
    }
}
