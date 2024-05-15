package simulador;

/**
 *
 * Larissa Fogaça Mendes       nº120147
 * Pedro Maschio Portes        nº120137
 * Thalita Martins Yamatsuka   nº120126
 * 
 */

public class Unidade_controle {

    private String instrucao;
    private Ula ula;
    private Memoria memoria;

    public Unidade_controle(Memoria memoria) {
        this.ula = new Ula();
        this.instrucao = "";
        this.memoria = memoria;
    }

    public void interpretador(String instrucao, Registrador r1, Registrador r2, Registrador r3) {
        if (instrucao.equals("add")) {
            r1.load1(ula.ADD(r2, r3));
        }
        if (instrucao.equals("sub")) {
            r1.load1(ula.SUB(r2, r3));
        }
        if (instrucao.equals("mult")) {
            r1.load1(ula.MULT(r2, r3));
        }
        if (instrucao.equals("div")) {
            r1.load1(ula.DIV(r2, r3));
        }
    }

    public void interpretador(String instrucao, Registrador r1, int endereco) {
        if (instrucao.equals("load")) {
            r1.load(endereco);
        }
    }
}
