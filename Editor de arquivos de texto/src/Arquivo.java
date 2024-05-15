public class Arquivo {

    //Atributos
    private String nome;
    private int tamanho;
    private String conteudo;

    //Construtor
    public Arquivo(String nome, String conteudo) {
        this.nome = nome;
        this.tamanho = conteudo.length()*8;
        this.conteudo = conteudo;
    }

    //Metodos
    public String abrir(){
        return "Nome do arquivo: "+nome + "\nTamanho: " + tamanho + " bits" + "\nConteudo:"+ conteudo;
    }
    public void editar(String conteudo){
        this.conteudo += conteudo;
        this.tamanho += conteudo.length()*8;
    }
    public void renomear(String nome){
        this.nome = nome;
    }
    public void limpar(){
        this.conteudo = "";
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    //toString

    @Override
    public String toString() {
        return "Arquivo{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
