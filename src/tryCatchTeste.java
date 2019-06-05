public class tryCatchTeste {
    public static void main(String[] args){

        try{
            int[] array = new int[4];

            System.out.println("== ANTES DA EXCEPTION ==");

            array[5] = 1;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("=== !EXCEÇÃO! ===");
//            System.exit(0);
        }
        finally {
            System.out.println("== APÓS EXCEPTION ==");
        }
    }
}
