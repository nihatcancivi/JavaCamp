public class Main {
    public static void main(String[] args) {
       char harf ='e';

       //1.YOL
       char[] inceArray = {'e','i','ö','ü'};

       boolean incemi= false;

       for(char ince : inceArray){
           if(harf==ince){
               incemi = true;
           }
       }
       if(incemi){
           System.out.println("ince harftir.");
       }else{
           System.out.println("Kalın Harftir.");
       }
       //2.yol
    switch (harf){
        case 'A':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Kalin sesli harftir.");
            break;
        default:
            System.out.println("İnce sesli harftir.");
    }


    }
}