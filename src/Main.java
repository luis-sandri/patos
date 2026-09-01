public class Main {
    public static void main(String[] args) {
        ComportamentoVoo raiva = new VooRaivoso();
        ComportamentoVoo harmonia = new VooHarmonioso();
        Pato patolino = new Pato("Patolino", raiva);
        Pato Donald = new Pato("Donald", harmonia);

        patolino.voar();
        Donald.voar();
    }
}
