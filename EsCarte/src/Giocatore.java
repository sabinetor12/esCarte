/**
 * 
 */
public class Giocatore extends Thread{
    private String nome;
    private int carta;
    /**
     * crea un oggetto Giocatore
     * @param nome nome da inserire
     */
    public Giocatore(String nome){
        this.nome = nome;
    }
    /**
     * in carta setta un num randomico tra 1 e 10
     */
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " il giocatore "+ nome+ " sta giocando");
        carta =(int) (10 * Math.random() + 1);
        System.out.println("il giocatore "+ nome+ " ha pescato "+carta);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarta() {
        return this.carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

}
