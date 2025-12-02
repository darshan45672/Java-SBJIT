public class ExceptionHandling {
   try{
     public static void main(String[] args) {
        System.out.println(10/0);
    }
   }catch(Exception e){
        System.out.println("An error occurred: Division by zero is not allowed.");
   }
}