public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome;
    private float saldo;

    public ContaTerminal(int numero, String agencia, String nome, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {return numero;}
    public String getAgencia() {return agencia;}
    public String getNome() {return nome;}
    public double getSaldo() {return saldo;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setAgencia(String agencia) {this.agencia = agencia;}
    public void setNome(String nome) {this.nome = nome;}
    public void setSaldo(float saldo) {this.saldo = saldo;}

    public void ImprimirDados(){
        System.out.println("\"Olá " + nome + ",obrigado por criar uma conta em nosso banco" +
                ", sua agência é " + agencia + ", conta " + numero +" e seu saldo R$" + saldo +" já está disponível para saque\".");
    }

}
