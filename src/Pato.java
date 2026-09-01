public class Pato {
    public String nome;
    public ComportamentoVoo comportamentoVoo;

    public Pato(String nome, ComportamentoVoo comportamentoVoo){
        this.nome = nome;
        this.comportamentoVoo = comportamentoVoo;
    }

    public void voar(){
        this.comportamentoVoo.voo();
    }

    public void fazerBarulho(){
        System.out.println("Quack!");
    }
}