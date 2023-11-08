package org.example;

public class Livro implements Comparable<Livro>{

    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    public Livro(String nome, String autor, String editora, int qtdPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public void mostraInfo(){

    }

    @Override
    public int compareTo(Livro o) {
        return Integer.compare(this.qtdPaginas, o.qtdPaginas);
    }
}
