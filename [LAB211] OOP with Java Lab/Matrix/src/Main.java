 
public class Main {

   public static void main(String[] args) {
        // TODO code application logic here
         Validate v = new Validate();
                  
            while(true){
                v.printMenu();
            int choice = v.getChoice();
            switch(choice){
                case 1:
                    v.add();
                    break;
                case 2:
                    v.sub();
                    break;
                case 3:
                    v.multi();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            }
        
    }
    
    
}