//É quem vai ser observado
public interface Sujeito {
    void registrarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores();
}
