package modelo;

public enum CategoriaLibro {
        SUSPENSO("Suspenso"),
        CIENCIA("Ciencia"),
        FICCION("Ficcion"),
        TERROR("Terror"),
        AUTOAYUDA("Auto ayuda");

        private String categoriaLibro;
        CategoriaLibro(String categoriaLibro) {
            this.categoriaLibro = categoriaLibro;
        }

        public String getCategoriaLibro() {
            return this.categoriaLibro;
        }
}
