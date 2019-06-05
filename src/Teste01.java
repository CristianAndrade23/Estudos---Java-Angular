import java.util.*;

public class Teste01 {

    public static void main(String[] args){

        Stack<Integer> pilha = new Stack<Integer>();

        pilha.push(1);
        pilha.push(3);
        pilha.push(5);

//        System.out.println(pilha.isEmpty()); //se esta vazio
//        System.out.println(pilha.size());   //tamanho
//        System.out.println(pilha.peek());   //olha o ultimo item da pilha

        pilha.pop();




        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(5);
        fila.add(15);   //adiciona no final da fila

        fila.remove(); //remove o primeiro item da fila

//        System.out.println(fila);



    }
}
