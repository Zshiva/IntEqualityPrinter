public class IntEqualityPrinter {
    public static void printEqual(int x, int y, int z){
        if(x<0 || y<0 || z<0){
            System.out.println("Invalid Value");
        }else if(x==y && y==z){
            System.out.println("All numbers are equal");
        }else if(x!=y && y!=z && z!=x){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(2,3,4);
        printEqual(4,5,5);
        printEqual(-1,0,-1);
    }
}