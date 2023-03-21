public class IngressoVIP extends Ingresso{
    private float valorAdicional;
    private float valorTotal;
    public float getValorTotal(){
        return getValor() + getValorAdicional();
    }
    public IngressoVIP(){
        super();
        this.valorAdicional=0;
    }
    public IngressoVIP(float valor, float valorAdicinal){
        super(valor);
        this.valorAdicional = valorAdicinal;
    }

    public float getValorAdicional(){
        return this.valorAdicional;
    }
    public void setValorAdicional (float valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    @Override
    public String toString() {
        return "O valor do ingresso é: " + getValorTotal();
    }
}
