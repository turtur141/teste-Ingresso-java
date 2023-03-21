public class Ingresso {
    private float valor;
    public Ingresso(){
        this.valor = 0;
    }
    public Ingresso(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return this.valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public String toString() {return "O valor do ingresso é: " + valor;}
}
