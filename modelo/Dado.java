package DD5e.modelo;

public class Dado {
    int lados, quantidade;
        public Dado(int lados, int quantidade) {
            this.lados = lados;
            this.quantidade = quantidade;
    }
    
    public int roll(){
        int dice = 0;
        for(int count= 0; count<quantidade ; count++)
            dice = dice + (int)((Math.random()*lados+1));
        return dice;
      }
}
