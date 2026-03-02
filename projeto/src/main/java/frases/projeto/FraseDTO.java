package frases.projeto;

public record FraseDTO(String titulo,

                       String frase,

                       String personagem,

                       String poster) {

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public String frase() {
        return frase;
    }

    @Override
    public String personagem() {
        return personagem;
    }

    @Override
    public String poster() {
        return poster;
    }
}
