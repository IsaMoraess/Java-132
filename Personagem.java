import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    //METODO
    // void -> significa q não está retornado
    void mostrarStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Força: " + forca);
        System.out.println("----------------------------------");
    }
    int calcularDano(){
        Random gerador = new Random();
        //1....20
        //nextInt()0...19 ANTES DO MAIS 1
        //nextInt() 0 => 20 POR CAUSA DO MAIS 1
        int dado20Faces = 1 + gerador.nextInt(19);  // 1 + p/ comçar por 1
        int dano = forca + dado20Faces;
        return dano;
    }


    //METODO Q Ñ RETORNA NADA E RECEBE UM PARÂMETRO ALVO Q É DO TIPO STRING
    void atacar(String atacar, String habilidade){
        int danoCausado = calcularDano();
        // O TAMANHO DE LENGTH É IGUAL A 0 
        if (habilidade.length() == 0) { //length = tamanho
            System.out.println(nome +  " atacou " + atacar + " e causou " + danoCausado + " de dano!" );
        }
        else{
            System.out.println(nome +  " usou " + habilidade + " contra " + atacar + " e causou " + danoCausado + " de dano!");
        }
    }
}

