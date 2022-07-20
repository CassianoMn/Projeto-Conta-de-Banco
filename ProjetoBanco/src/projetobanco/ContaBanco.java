package projetobanco;

/**
 *
 * @author Cassiano
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());  // ou this.NumConta
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------");
    }
    
    public ContaBanco() {   //Este é o método construtor
        this.setStatus (false);  // ou this.status = false
        this.setSaldo(0);
    }
    
    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);
        if ("CC".equals(this.getTipo())) {
            this.setSaldo (50);
        } else if ("CP".equals(this.getTipo())) {
            this.setSaldo(150); // ou this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() { 
        if (this.getSaldo() < 0) {
            System.out.println("Você está em débito, não pode fechar a conta! " 
                    + "Saldo: " + this.getSaldo());
        } else if (this.getSaldo() > 0) {
            System.out.println("Você ainda tem dinheiro na conta, não pode fecha-lá no momento! "
                    + "Saldo: " + this.getSaldo());
        } else {
            System.out.println("Fechando conta...");
            System.out.println("Conta encerrada com sucesso!");
            this.setStatus(false); 
        }
    }
    
    public void depositar(float valor) {
        if (this.getStatus() == false) {
            System.out.println("Você não pode efetuar um depósito, pois ainda não tem conta.");
        } else {
            this.setSaldo(this.getSaldo() + valor);  // ou this.saldo = this.saldo + valor; this.saldo += valor;
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    
    public void sacar(float valor) {
        // Não pode sacar valor maior que o saldo atual
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor); // ou  this.saldo = this.saldo - valor;
                System.out.println("Saque realizada na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) { // ou this.tipo == "CP"
            v = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                saldo -= v;
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar.");
        }
    }
    
    //Criar Métodos especiais (Getter e Setter)
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
     
}
  