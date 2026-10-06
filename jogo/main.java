package jogo;

public class main{
    public static void main(String[] args){
        personagem heroi = new personagem();
        heroi.nome = "Guerreiro Java";
        heroi.vida = 100;

        System.out.println("Iniciar jogo");
        heroi.receberDano(40);//60
        heroi.receberDano(10);//50
        heroi.tomarPocaoCurativa(10);//60
        heroi.tomarPocaoCurativa(70);//100
 
}        

}    