package DD5e.modelo;

public class Dado {
    int lados, quantidade;
        public Dado(int lados, int quantidade) {
            this.lados = lados;
            this.quantidade = quantidade;
    }
    
    public int roll(){
        int dice=(int)((Math.random()*6+1)* quantidade);
        return dice;
      }
}
