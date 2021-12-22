import java.io.*;

class Kertoma {
    public static void main(String [] args){
        int i = 1;
        int luku;
        long kertoma = 1;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Anna kokonaisluku:");
            luku = Integer.parseInt(in.readLine());

            for (i = 1;i<=luku ;i++){
                kertoma*=i;}
                {
                System.out.println("Luvun "+luku+" kertoma on "+kertoma);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
