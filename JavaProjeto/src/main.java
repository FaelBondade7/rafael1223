package JavaProjeto.src;

public class main{
    
    public static void main(String[] args){

        contaCorrente contaCorrente = new contaCorrente();

        //deposito deposito = new deposito();

        //deposito.deposito();

        sacar sacar = new sacar ();

        sacar.sacar();
        

        contaCorrente.saldo = 1000000;
        contaCorrente.banco = "brasil";
        contaCorrente.nomeUser = "Rafael";
        contaCorrente.numConta = 21;
        contaCorrente.unidade = "008";
        contaCorrente.ativo = true;

            
            System.out.println("saldo: " + contaCorrente.saldo);
            System.out.println("banco: " + contaCorrente.banco);
            System.out.println("nomeUser: " + contaCorrente.nomeUser);
            System.out.println("numconta: " + contaCorrente.numConta);
            System.out.println("unidade: " + contaCorrente.unidade);
            System.out.println("ativo: " + contaCorrente.ativo);

            depositar depositar = new depositar();

            depositar.depositar();
            

     }       
                    
}      

