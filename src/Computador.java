//É quem vai observar, no caso vai Observar a EstacaoClimatica.
public class Computador implements Observador {
    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(float temperatura) {
        System.out.println(nome + " recebeu atualização de temperatura: " + temperatura + "°C");
    }
}
