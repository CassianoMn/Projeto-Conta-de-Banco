package projetobanco;
/**
 *
 * @author Cassiano
 */
public class ProjetoBanco {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        
        c1.setDono("Cassiano");
        c1.setNumConta(11111);
        
        c1.estadoAtual();
        
        c1.abrirConta("CC");
        c1.estadoAtual();
        
        c1.depositar(400);
        c1.estadoAtual();
        
        c1.sacar(300);
        c1.estadoAtual();
        
        ContaBanco c2 = new ContaBanco();
        
        c2.setDono("Erick");
        c2.setNumConta(22222);
        c2.abrirConta("CP");
        
        c2.estadoAtual();
        
        
    }
    
}
