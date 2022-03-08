import java.util.Scanner;
import static java.lang.System.out;
public class Ficha3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        out.println("Exercício: ");
        int ex = scan.nextInt();
        out.println("Alínea: ");
        String alinea = scan.next();

        switch(ex){
            case 1:
                Circulo circulo = new Circulo(1, 1, 9);

                switch(alinea){
                    case "a":
                        double x = circulo.getX();
                        out.println("Valor em x: " + x);
                    case "b":
                        double y = circulo.getY();
                        out.println("Valor em y: " + y);
                    case "c":
                        double raio = circulo.getRaio();
                        out.println("Valor do raio: " + raio);
                    case "d":
                        circulo.setX(2);
                        circulo.setY(2);
                        circulo.setRaio(16);
                        out.println("X: " + circulo.getX());
                        out.println("Y: " + circulo.getY());
                        out.println("Raio: " + circulo.getRaio());
                    case "e":
                        circulo.alteraCentro(10, 10);
                        out.println("X: " + circulo.getX());
                        out.println("Y: " + circulo.getY());
                    case "f":
                        out.println("Área: " + circulo.calculaArea());
                    case "g":
                        out.println("Perímetro: " + circulo.calculaPerimetro());
                        break;
                    default:
                        out.println("Não existe essa alínea");
                }
            case 2:
                Telemovel telemovel = new Telemovel("Huawei", "P20 Lite",300, 600, 40,10000,4000, 6000);
                telemovel.instalaApp("Youtube", 1000);
                telemovel.instalaApp("Instagram", 1000);
                telemovel.instalaApp("Twitter", 1000);
                telemovel.instalaApp("Twitch", 1000);
                telemovel.instalaApp("Blackboard", 1000);
                switch (alinea){
                    case "a":
                        boolean espaco = telemovel.existeEspaco(3000);
                        out.println("Existe espaço: " + espaco);
                        espaco = telemovel.existeEspaco(2000);
                        out.println("Existe espaço: " + espaco);
                        espaco = telemovel.existeEspaco(2000);
                        out.println("Existe espaço: " + espaco);
                    case "b":
                        String[] apps = telemovel.getNomeAppsInstaladas();
                        out.println("-------------- Apps instaladas --------------");
                        for(int i=0; i< telemovel.getNumAppsInstaladas(); i+=1){
                            out.println(apps[i]);
                        }
                    case "c":
                        telemovel.recebeMsg("I'm not very good at advice");
                        telemovel.recebeMsg("Can I interest you a sarcastic comment?");
                        telemovel.recebeMsg("Some cheese?");
                        String[] mensagens = telemovel.getMensagens();
                        out.println("-------------- Mensagens --------------");
                        for(int i =0; i<telemovel.getNumeroMensagens(); i+=1){
                            out.println(mensagens[i]);
                        }
                    case "d":
                        double tamMedio = telemovel.tamMedioApps();
                        out.println("Tamanho medio das apps: " + tamMedio);
                    case "e":
                        String maiorMsg = telemovel.maiorMsg();
                        out.println("Maior mensagem: " + maiorMsg);
                    case "f":
                        telemovel.removeApp("Twitter", 1000);
                        telemovel.removeApp("Youtube", 1000);
                        telemovel.removeApp("Blackboard", 1000);

                        String[] appps = telemovel.getNomeAppsInstaladas();
                        out.println("-------------- Apps instaladas --------------");
                        for(int i=0; i< telemovel.getNumAppsInstaladas(); i+=1){
                            out.println(appps[i]);
                        }
                        break;
                    default:
                        out.println("Não existe essa alínea");
                }

        }

    }


}
