import java.util.ArrayList;
import java.util.List;

public class EstacaoClimatica implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        //caso tenha mais de uma instância interessada em saber da informação é melhor utilizar um forEach, no caso de
        //teste, so utilizei uma instância então não precisaria dessa estrutura.
        for (Observador o : observadores) {
            o.atualizar(temperatura);
        }
    }

    public void definirTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}
