public class DiamondPattern {
    
    public static void printPattern(int n){
        
        for (int i=1; i<=n; i++) {
            
            for (int j=1; j<=(2*n-i-1); j++)
                System.out.print(" ");
            
            for (int j=1; j<=(2*i-1); j++)
                System.out.print("1");
            
            System.out.println();
        }

        for (int i=1; i<=n-1; i++) {
            
            for (int j=1; j<=n-i-1; j++)
                System.out.print(" ");
            
            for (int j=1; j<=n; j++)
                System.out.print("1");
            
            for (int j=1; j<=(2*i-1); j++)
                System.out.print(" ");
            
            for (int j=1; j<=n; j++)
                System.out.print("1");
            
            System.out.println();
        }

        for (int i=1; i<=n-2; i++) {
            
            for (int j=1; j<=i; j++)
                System.out.print(" ");
            
            for (int j=1; j<=n; j++)
                System.out.print("1");
            
            for (int j=1; j<=((2*n-3)-2*i); j++)
                System.out.print(" ");
            
            for (int j=1; j<=n; j++)
                System.out.print("1");
            
            System.out.println();
        }
        
        for (int i=1; i<=n; i++) {
            
            for (int j=1; j<=n+i-2; j++)
                System.out.print(" ");
            
            for (int j=1; j<=((2*n+1)-2*i); j++)
                System.out.print("1");
            
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        printPattern(11);
    }
}