package br.com.alura.literalurachallengejava.model;

public enum Idioma {

    ES("es"),
    EN("en"),
    FR("fr"),
    PT("pt");

    private final String idioma;

    Idioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public static Idioma fromString(String idioma) {
        for (Idioma idiomaEnum : Idioma.values()) {
            if (idiomaEnum.idioma.equalsIgnoreCase(idioma)) {
                return idiomaEnum;
            }
        }
        throw new IllegalArgumentException("Idioma invalido: " + idioma);
    }
}
