package DD5e.modelo;
import java.util.Arrays;
public class Personagem {
    
    //Habilidades
    private int str, dex, cons, inte, wis, cha;
    //Pericias
    private int acrobacia,
                arcanismo,
                atletismo,
                atuacao,
                blefar,
                furtividade,
                historia,
                intimidacao,
                intuicao,
                investigacao,
                lidarComAnimais,
                medicina,
                natureza,
                percepcao,
                persuasao,
                prestidigitacao,
                religiao,
                sobrevivencia;
    private double xp;
    private int vida, vidaTemp;



    public Personagem(int str, int dex, int cons, int inte, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.cons = cons;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
        acrobacia = modificador(dex);
        arcanismo = modificador(inte);
        atletismo = modificador(str);
        atuacao = modificador(cha);
        blefar = modificador(cha);
        furtividade = modificador(dex);
        historia = modificador(inte);
        intimidacao = modificador(cha);
        intuicao = modificador(wis);
        investigacao = modificador(inte);
        lidarComAnimais = modificador(wis);
        medicina = modificador(wis);
        natureza = modificador(inte);
        percepcao = modificador(wis);
        persuasao = modificador(cha);
        prestidigitacao = modificador(dex);
        religiao = modificador(inte);
        sobrevivencia = modificador(wis);
    }

    public int getStr() {
        return this.str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return this.dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCons() {
        return this.cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getInte() {
        return this.inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getWis() {
        return this.wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return this.cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getAcrobacia() {
        return this.acrobacia;
    }

    public void setAcrobacia(int acrobacia) {
        this.acrobacia = acrobacia;
    }

    public int getArcanismo() {
        return this.arcanismo;
    }

    public void setArcanismo(int arcanismo) {
        this.arcanismo = arcanismo;
    }

    public int getAtletismo() {
        return this.atletismo;
    }

    public void setAtletismo(int atletismo) {
        this.atletismo = atletismo;
    }

    public int getAtuacao() {
        return this.atuacao;
    }

    public void setAtuacao(int atuacao) {
        this.atuacao = atuacao;
    }

    public int getBlefar() {
        return this.blefar;
    }

    public void setBlefar(int blefar) {
        this.blefar = blefar;
    }

    public int getFurtividade() {
        return this.furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getHistoria() {
        return this.historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }

    public int getIntimidacao() {
        return this.intimidacao;
    }

    public void setIntimidacao(int intimidacao) {
        this.intimidacao = intimidacao;
    }

    public int getIntuicao() {
        return this.intuicao;
    }

    public void setIntuicao(int intuicao) {
        this.intuicao = intuicao;
    }

    public int getInvestigacao() {
        return this.investigacao;
    }

    public void setInvestigacao(int investigacao) {
        this.investigacao = investigacao;
    }

    public int getLidarComAnimais() {
        return this.lidarComAnimais;
    }

    public void setLidarComAnimais(int lidarComAnimais) {
        this.lidarComAnimais = lidarComAnimais;
    }

    public int getMedicina() {
        return this.medicina;
    }

    public void setMedicina(int medicina) {
        this.medicina = medicina;
    }

    public int getNatureza() {
        return this.natureza;
    }

    public void setNatureza(int natureza) {
        this.natureza = natureza;
    }

    public int getPercepcao() {
        return this.percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getPersuasao() {
        return this.persuasao;
    }

    public void setPersuasao(int persuasao) {
        this.persuasao = persuasao;
    }

    public int getPrestidigitacao() {
        return this.prestidigitacao;
    }

    public void setPrestidigitacao(int prestidigitacao) {
        this.prestidigitacao = prestidigitacao;
    }

    public int getReligiao() {
        return this.religiao;
    }

    public void setReligiao(int religiao) {
        this.religiao = religiao;
    }

    public int getSobrevivencia() {
        return this.sobrevivencia;
    }

    public void setSobrevivencia(int sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public double getXp() {
        return this.xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaTemp() {
        return this.vidaTemp;
    }

    public void setVidaTemp(int vidaTemp) {
        this.vidaTemp = vidaTemp;
    }

    public int modificador(int atributo){
        int ponto = 0;
        if(atributo%2 == 0){
            ponto = (atributo/2)-5;
        } else {
            ponto = ((atributo-1)/2)-5;
        }
        return ponto;
    }

    public int[] rollDices(){
        Dado dado = new Dado(6, 1);
        int dados[] = {0,0,0,0};
        dados[0] = dado.roll();
        dados[1] = dado.roll();
        dados[2] = dado.roll();
        dados[3] = dado.roll();
        Arrays.sort(dados);
        System.out.println("1: " + dados[0] + ", 2: " + dados[1] + ", 3: " + dados[2] +", 4: " + dados[3]);
        return dados;
    }
}