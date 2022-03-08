import java.lang.System;

public class Telemovel {
    private String marca;
    private String modelo;
    private int xDisplay;
    private int yDisplay;

    private int numeroMensagens;
    private String[] mensagens;
    private int armazenamentoFotosApps;
    private int armazenamentoFotos;
    private int armazenamentoApps;
    private int espacoOcupado;

    private int numFotosGuardadas;
    private int numAppsInstaladas;
    private String[] nomeAppsInstaladas;

    public Telemovel(String marca, String modelo, int xDisplay, int yDisplay, int numeroMensagens, int armFotosApps, int armFotos, int armApps){
        this.marca = marca;
        this.modelo = modelo;
        this.xDisplay = xDisplay;
        this.yDisplay = yDisplay;
        this.numeroMensagens = 0;
        this.mensagens = new String[numeroMensagens];
        this.armazenamentoFotosApps = armFotosApps;
        this.armazenamentoFotos = armFotos;
        this.armazenamentoApps = armApps;
        this.espacoOcupado = 0;
        this.numFotosGuardadas = 0;
        this.numAppsInstaladas = 0;
        this.nomeAppsInstaladas = new String[armApps];

    }

    public boolean equals(Telemovel umTelemovel){
        return (this.marca.equals(umTelemovel.getMarca()) && this.modelo.equals(umTelemovel.getModelo())        &&
                this.xDisplay == umTelemovel.getxDisplay() && this.yDisplay == umTelemovel.getyDisplay()        &&
                this.numeroMensagens == umTelemovel.getNumeroMensagens() && this.armazenamentoFotosApps == umTelemovel.getArmazenamentoFotosApps() &&
                this.armazenamentoFotos == umTelemovel.getArmazenamentoFotos() && this.armazenamentoApps == umTelemovel.getArmazenamentoApps()     &&
                this.espacoOcupado == umTelemovel.getEspacoOcupado() && this.numFotosGuardadas == umTelemovel.getNumFotosGuardadas()               &&
                this.numAppsInstaladas == umTelemovel.getNumAppsInstaladas()
            );
    }

    public String toString(){
        return(
                "Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nDisplay: " + this.getxDisplay() + "x" + this.getyDisplay() +
                "\nNumero mensagens: " + this.getNumeroMensagens() +
                "\nArmazenamento: " + this.getArmazenamentoFotosApps() +
                "\nArmazenamento Fotos: " + this.getArmazenamentoFotos() +
                "\nArmazenamento Apps: " + this.getArmazenamentoApps() +
                "\nEspaço Ocupado: " + this.getEspacoOcupado() +
                "\nNumero de fotos guardadas: " + this.getNumFotosGuardadas() +
                "\nNumero de apps instaladas: " + this.getNumAppsInstaladas()
            );
    }


    // 2. a)
    public boolean existeEspaco(int numeroBytes){
        return(this.getEspacoOcupado() +numeroBytes <= this.getArmazenamentoFotosApps());
    }

    // 2. b)
    public void instalaApp(String nome, int tamanho){
        if(existeEspaco(tamanho)){
            this.setArmazenamentoApps(getArmazenamentoApps() + tamanho); // atualizar o armazenamento das apps
            this.nomeAppsInstaladas[getNumAppsInstaladas()] = nome;
            this.setNumAppsInstaladas(getNumAppsInstaladas() +1);
            this.setEspacoOcupado(this.getEspacoOcupado() + tamanho);
        } else {
            System.out.println("Espaço insuficiente");
        }
    }

    // 2. c)
    public void recebeMsg(String msg){
        int n = this.getNumeroMensagens() +1;
        String[] novo = this.getMensagens();
        this.mensagens = new String[n];
        System.arraycopy(novo, 0, this.mensagens, 0, n-1);
        this.mensagens[n-1] = msg;
        this.setNumeroMensagens(n);
    }

    // 2. d)
    public double tamMedioApps(){
        return (getArmazenamentoApps()/(double)getNumAppsInstaladas());
    }

    // 2. e)
    public String maiorMsg(){
        int max_index = 0;
        int len_max_msg = 0;
        String[] msg = this.getMensagens();

        for(int i=0; i<this.getNumeroMensagens(); i+=1){
            if(msg[i].length() > len_max_msg){
                max_index = i;
                len_max_msg = msg[i].length();
            }
        }

        return (msg[max_index]);
    }

    // 2. f)
    public void removeApp(String nome, int tamanho){
        int n  = getNumAppsInstaladas() -1;
        String[] novo = new String[n];
        String[] apps = this.getNomeAppsInstaladas();
        this.nomeAppsInstaladas = new String[n];

    /*  Debugg
        for(int i =0; i<n+1; i+=1)
            out.println(apps[i]);
        out.println(this.getNumAppsInstaladas());
    */

        for(int i=0, j=0; i<n+1; i+=1){
            if(apps[i] == null)
                break;

            if(!apps[i].equals(nome)) {
                novo[j] = apps[i];
                j += 1;
            }
        }

        this.setEspacoOcupado(this.getEspacoOcupado() - tamanho);
        this.setArmazenamentoApps(this.getArmazenamentoApps() - tamanho);
        this.setNumAppsInstaladas(n);
        System.arraycopy(novo, 0, this.nomeAppsInstaladas, 0, this.getNumAppsInstaladas());
    }








    // Gets
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getxDisplay(){
        return this.xDisplay;
    }

    public int getyDisplay(){
        return this.yDisplay;
    }

    public int getNumeroMensagens(){
        return this.numeroMensagens;
    }

    public int getArmazenamentoFotosApps(){
        return this.armazenamentoFotosApps;
    }

    public int getArmazenamentoFotos(){
        return this.armazenamentoFotos;
    }

    public int getArmazenamentoApps(){
        return this.armazenamentoApps;
    }

    public int getEspacoOcupado(){
        return this.espacoOcupado;
    }

    public int getNumAppsInstaladas(){
        return this.numAppsInstaladas;
    }

    public int getNumFotosGuardadas(){
        return this.numFotosGuardadas;
    }

    public String[] getMensagens(){
        String[] r = new String[this.numeroMensagens];

        if(this.numeroMensagens > 0){
            System.arraycopy(this.mensagens, 0, r, 0, this.numeroMensagens);
        }

        return r;
    }

    public String[] getNomeAppsInstaladas(){
        String[] r = new String[this.numAppsInstaladas];

        if(this.numAppsInstaladas > 0){
            System.arraycopy(this.nomeAppsInstaladas, 0, r, 0, this.numAppsInstaladas);
        }

        return r;
    }

    // Sets
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setxDisplay(int xDisplay){
        this.xDisplay = xDisplay;
    }

    public void setyDisplay(int yDisplay){
        this.yDisplay = yDisplay;
    }

    public void setNumeroMensagens(int numeroMensagens){
        this.numeroMensagens = numeroMensagens;
    }

    public void setArmazenamentoFotosApps(int armazenamentoFotosApps){
        this.armazenamentoFotosApps = armazenamentoFotosApps;
    }

    public void setArmazenamentoFotos(int armazenamentoFotos){
        this.armazenamentoFotos = armazenamentoFotos;
    }

    public void setArmazenamentoApps(int armazenamentoApps){
        this.armazenamentoApps = armazenamentoApps;
    }

    public void setEspacoOcupado(int espacoOcupado){
        this.espacoOcupado = espacoOcupado;
    }

    public void setNumFotosGuardadas(int numFotosGuardadas){
        this.numFotosGuardadas = numFotosGuardadas;
    }

    public void setNumAppsInstaladas(int numAppsInstaladas){
        this.numAppsInstaladas = numAppsInstaladas;
    }
}
