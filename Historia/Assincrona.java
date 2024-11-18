public class Assincrona extends Thread {
    @Override
    public void run() {
        System.out.println("Tarefa em segundo plano em Java!");
    }

    public static void main(String[] args) {
        Assincrona tarefa = new Assincrona(); // Corrige a classe instanciada
        tarefa.start(); // Inicia a thread
    }
}
