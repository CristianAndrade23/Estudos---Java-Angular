package com.exceptions;

public class tryCatch {
    public static void main(String[] args){

        try{
            int[] array = new int[5];

            throw new RuntimeException ( "ERRO" );
//            array[10] = 1;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("DETECTOU EXCEPTION =>" + exception);
//            System.exit(0);
        }
        catch(RuntimeException exception2){
            System.out.println (exception2);
        }
        finally {
            System.out.println("Após exceção");
        }
    }
}
