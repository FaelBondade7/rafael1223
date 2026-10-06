public class personagem{
    // Atributos  totalmente deprotegidos 
    String nome;
    int vida;

    public Personagem(String nomeEscolhido){
        this.nome = nomeEscolhido;// o nome vem
        this.vida = 100; // vida fixada interna
        System.out.println("Aqui nasce o heroi")

    // Metodo que tenta impor uma regra;
    void tomarPocaoCurativa(int cura){
        vida = vida + cura;
        if (vida > 100){
            vida = 100;
    }
    System.ou.println("Vida " + cura);
}
void receberDano(int dano){
    vida = vida - dano;
    if (vida <= 0){
        vida = 0;
        System.out.println("Voce foi derrotado"
    }else{
        System.out.println("Sofreu dano" + dano);
    }
};            
}    