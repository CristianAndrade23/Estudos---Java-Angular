import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Number> arrayNumbers = new ArrayList<Number>();


        arrayList.add("Cristian");
        arrayList.add("Rafaela");

        arrayNumbers.add(3);
        arrayNumbers.add(4);
        arrayNumbers.add(5);

        System.out.println(arrayList);
        System.out.println(arrayNumbers);

        boolean existe = arrayList.contains("João");
        if (existe){
            System.out.println("Nome contém no array");
        } else {
            System.out.println("Nome nao contém no array");
        }

        boolean existe2 = arrayNumbers.contains(5);
        if (existe2){
            System.out.println("Numero contém no array");
        } else {
            System.out.println("Numero não contém no array  ");
        }
    }
}
