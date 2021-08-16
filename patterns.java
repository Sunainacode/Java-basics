public class patterns {
    public static void main(String args[]) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.println();
            
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
        for(int i=3;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.printf("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if((i==1) || (i==4) || (j==1) || (j==4)){
                    System.out.printf("* ");
                }
                else{
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.printf("1");
                }
                else{
                    System.out.printf("0");
                }
                
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}