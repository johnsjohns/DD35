package DD5e.modelo;

public class Modificador {
    private int mod;
    public Modificador(int mod){
        this.mod = mod;
    }
    public int ponto(){
        int ponto = 0;
        if(mod%2 == 0){
            ponto = (mod/2)-5;
        } else {
            ponto = ((mod-1)/2)-5;
        }

        return ponto;
    }
}
