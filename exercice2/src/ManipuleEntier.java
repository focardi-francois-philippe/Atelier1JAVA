public class ManipuleEntier {
    protected int entier;
    protected int borneInf;
    protected int borneSup;
    public ManipuleEntier(int borneInf,int borneSup,int valeurEntier)
    {
        this.borneInf = borneInf;
        this.borneSup = borneSup;
        entier = 0;
        setEntier(valeurEntier);
    }
    public int getBorneInf() {
        return borneInf;
    }
    public int getBorneSup() {
        return borneSup;
    }
    public int getEntier() {
        return entier;
    }
    public void setEntier(int entier) {
        if(entier>=borneInf && entier<borneSup)
        {
            this.entier = entier;
        }
    }
    public void incremente()
    {
        setEntier(entier++);
    }
    public void incremente(int pas_de_n)
    {
        setEntier(entier+=pas_de_n);
    }
    @Override
    public boolean equals(Object obj) {
    
        return obj instanceof  ManipuleEntier && this.entier == ((ManipuleEntier)obj).getEntier();
    }
    @Override
    public String toString() {
     
        return "Valeur de l'entier "+String.valueOf(entier);
    }
}
