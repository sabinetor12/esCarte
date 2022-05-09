public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("partita iniziata");
        Giocatore g1 = new Giocatore("marco");
        Giocatore g2 = new Giocatore("piero");
        Giocatore g3 = new Giocatore("sartorio");
    
        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        System.out.println("gioco finito");
        if(!((g1.getCarta() == g2.getCarta() && g3.getCarta() < g1.getCarta()) ||
            (g2.getCarta() == g3.getCarta() && g1.getCarta() < g2.getCarta()) || 
            (g3.getCarta() == g1.getCarta() && g2.getCarta() < g1.getCarta())))
            {
                if(g1.getCarta() > g2.getCarta() && g1.getCarta() > g3.getCarta())
            {
                System.out.println(g1.getNome() + " è il king");
            }
            else if(g2.getCarta() > g3.getCarta())
            {
                System.out.println(g2.getNome() + " è il king");
            }
            else
            {
                System.out.println(g3.getNome() + " è il king");
            }
        }
        else if(g1.getNome() == g2.getNome() && g1.getNome() == g3.getNome()){
            System.out.println("mega pareggio");
        }
        else{
            if(g1.getCarta() == g2.getCarta()){
                System.out.println(g1.getNome() + " e " + g2.getNome() + " hanno pareggiato");
            }
            else if(g1.getCarta() == g3.getCarta()){
                System.out.println(g1.getNome() + " e " + g3.getNome() + " hanno pareggiato");
            }
            else
            System.out.println(g2.getNome() + " e " + g3.getNome() + " hanno pareggiato");
        }
            
    }
}
