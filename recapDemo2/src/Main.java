public class Main {
    public static void main(String[] args) {

        double total = 0;

        double[] myList = new double[4];//1.yol
        double[] myList2 = {1.2, 1.3, 4.3, 5.6};//2.yol
	double[] myList3 =  new double[]{1.2, 1.3, 4.3, 5.6};//3.yol

        double max = myList2[0];

        for (double list : myList2) {
            System.out.println(list);
            total += list;
            if(max<list){
                max=list;
            }
        }
        System.out.println(total);
        System.out.println(max);


    }
}