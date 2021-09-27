public class App {
    public static void main(String[] args) throws Exception {
        ManipuleEntier monEntier = new ManipuleEntier(10, 50, 20);
        monEntier.incremente();
        monEntier.incremente(5);
        ManipulerEntierFou monEntierFou  = new ManipulerEntierFou(30,10);
        monEntierFou.incremente();
        System.out.println(monEntier);
        System.out.println(monEntierFou);
    }
}
