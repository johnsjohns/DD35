package DD5e.modelo;

public class Teste {
    
    public static void main(String[] args){
        Dado dado = new Dado(6,3);
        int forca = dado.roll();
        int destreza = dado.roll();
        int intelgencia = dado.roll();
        int sabedoria = dado.roll();
        int constituicao = dado.roll();
        int carisma = dado.roll();
        Personagem jao = new Personagem(forca, destreza, constituicao,intelgencia, sabedoria, carisma);
        System.out.println("força: " + jao.getStr());
        System.out.println("Constituição: " + jao.getCons());
        System.out.println("destreza: " + jao.getDex());
        System.out.println("inteligencia: " + jao.getInte());
        System.out.println("sabedoria: " + jao.getWis());
        System.out.println("Carisma: " + jao.getCha());
        jao.rollDices();
    }

}
