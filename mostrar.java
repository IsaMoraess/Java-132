public class mostrar {
    public static void main(String args[]) {
        Personagem heroi = new Personagem();
        heroi.nome = "Volverine";
        heroi.nivel = 7;
        heroi.forca = 20;

        heroi.mostrarStatus();

        //CHAMEI UM MÉTODO ATACAR E PASSEI COMO ARGUMENTO UMA STRING "Dente-De-Sabre"
        heroi.atacar("Dente-De-Sabre", "");

        System.out.println(heroi.calcularDano()); //vai retorna o numero q random der

    } 
}
