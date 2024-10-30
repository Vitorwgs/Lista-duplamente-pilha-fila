package lista;

/*
 *  Professor Gerson Risso
 */
public class No {

    private No prox;
    private No ant;
    private int n;

    public No(No prox, No ant, int n) {
        this.prox = prox;
        this.ant = ant;
        this.n = n;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
