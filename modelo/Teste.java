package DD5e.modelo;
import java.util.Arrays;

public class Teste {
    
    public static void main(String[] args){
        Teste teste = new Teste();
        int forca = teste.rollDices();
        int destreza = teste.rollDices();
        int intelgencia = teste.rollDices();
        int sabedoria = teste.rollDices();
        int constituicao = teste.rollDices();
        int carisma = teste.rollDices();
        Personagem jao = new Personagem(forca, destreza, constituicao,intelgencia, sabedoria, carisma);
        System.out.println("força: " + jao.getStr());
        System.out.println("Constituição: " + jao.getCons());
        System.out.println("destreza: " + jao.getDex());
        System.out.println("inteligencia: " + jao.getInte());
        System.out.println("sabedoria: " + jao.getWis());
        System.out.println("Carisma: " + jao.getCha());
        
    }
    public int rollDices(){
        Dado dado = new Dado(6, 1);
        int dados[] = {0,0,0,0};
        dados[0] = dado.roll();
        dados[1] = dado.roll();
        dados[2] = dado.roll();
        dados[3] = dado.roll();
        Arrays.sort(dados);
        
        return dados[1] + dados[2] + dados[3];
    }
}
