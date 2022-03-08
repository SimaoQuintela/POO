import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Youtube {
    private String nomeVideo;
    private char[] conteudo;
    private LocalDateTime data;
    private int resolucao;
    private int minutos;
    private int segundos;
    private String[] comentarios;
    private int likes;
    private int dislikes;

    public Youtube(){
        this.nomeVideo = "";
        this.conteudo = new char[0];
        this.data = LocalDateTime.now();
        this.resolucao = 720;
        this.minutos = 0;
        this.segundos = 0;
        this.comentarios = new String[0];
        this.likes = 0;
        this.dislikes = 0;
    }

    public Youtube(String nomeVideo, char[] conteudo, LocalDateTime data, int resolucao, int minutos, int segundos){
        this.nomeVideo = nomeVideo;
        this.conteudo = new char[conteudo.length];
        System.arraycopy(conteudo, 0, this.conteudo, 0, conteudo.length);
        this.data = data;
        this.resolucao = resolucao;
        this.minutos = minutos;
        this.segundos = segundos;
        this.comentarios = new String[0];
        this.likes = 0;
        this.dislikes = 0;
    }

    public boolean equals(Youtube umVideo){
        return(this.nomeVideo.equals(umVideo.getNomeVideo()) && Arrays.equals(this.conteudo, umVideo.getConteudo()) &&
               this.data == umVideo.getData() && this.resolucao == umVideo.getResolucao() && this.minutos == umVideo.getMinutos() &&
               this.segundos == umVideo.getSegundos() && Arrays.equals(this.comentarios, umVideo.getComentarios()) &&
               this.likes == umVideo.getLikes() && this.dislikes == umVideo.getDislikes() );
    }

    public String toString(){
        return("Nome vídeo: " + this.getNomeVideo() +
               "\nData: " + this.getData() +
               "\nResolução: " + this.getResolucao() +
               "\nDuração: " + this.getMinutos() + ":" + this.getSegundos() +
               "\nLikes: " + this.getLikes() +
               "\nDislikes" + this.getDislikes()
            );
    }

    // 3. b)
    public void insereComentario(String comentario){
        String[] comentarios = this.getComentarios();
        String[] novo = new String[comentarios.length+1];
        System.arraycopy(comentarios, 0, novo, 0, comentarios.length);
        novo[comentarios.length] = comentario;
        this.setComentarios(novo);
    }

    // 3. c)
    public long qtsDiasDepois(){
        LocalDateTime present = LocalDateTime.now();
        LocalDateTime dataLancamento = this.data;

        return (ChronoUnit.DAYS.between(dataLancamento,present));
    }

    // 3. d)
    public void thumbsUp(){
        this.setLikes(this.getLikes() +1);
    }

    // 3. e)
    public String processa(){
        StringBuilder r = new StringBuilder();
        char[] content = this.getConteudo();
        int i;
        for(i = 0; i<content.length ; i+=1){
            r.append(content[i]);
        }

        return r.toString();
    }


    // 3. a)
    // gets
    public String getNomeVideo(){
        return this.nomeVideo;
    }

    public char[] getConteudo(){
        char[] r = new char[this.conteudo.length];

        System.arraycopy(this.conteudo, 0, r, 0, this.conteudo.length);
        return r;
    }

    public LocalDateTime getData(){
        return this.data;
    }

    public int getResolucao(){
        return this.resolucao;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public int getSegundos(){
        return this.segundos;
    }

    public String[] getComentarios(){
        String[] r = new String[this.comentarios.length];
        System.arraycopy(this.comentarios, 0, r, 0, this.comentarios.length);
        return r;
    }

    public int getLikes(){
        return this.likes;
    }

    public int getDislikes(){
        return this.dislikes;
    }

    // sets
    public void setNomeVideo(String nomeVideo){
        this.nomeVideo = nomeVideo;
    }

    public void setConteudo(char[] conteudo){
        this.conteudo = new char[this.conteudo.length];
        System.arraycopy(conteudo, 0, this.conteudo, 0, conteudo.length);
    }

    public void setData(LocalDateTime data){
        this.data = data;
    }

    public void setResolucao(int resolucao){
        this.resolucao = resolucao;
    }

    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    public void setComentarios(String[] comentarios){
        this.comentarios = new String[comentarios.length];
        System.arraycopy(comentarios, 0, this.comentarios, 0, comentarios.length);
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public void setDislikes(int dislikes){
        this.dislikes = dislikes;
    }

}

