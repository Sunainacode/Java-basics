public class labeledbreak {
    public static void main(String args[]) {
        sunaina:    //label
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==2){
                    break sunaina;  //labeled break
                }
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}
