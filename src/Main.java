public class Main {
    public static void main(String[] args) {
        EstacaoClimatica estacao = new EstacaoClimatica();

        Computador computador = new Computador("Meu Computador");

        estacao.registrarObservador(computador);
        //notifica a mudança duas vezes
        estacao.definirTemperatura(25.0f);
        estacao.definirTemperatura(30.0f);

        estacao.removerObservador(computador);
        //Não vai notificar a mudança
        estacao.definirTemperatura(28.0f);
    }
}
