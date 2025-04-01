public class patterns {
        public static void holopattern(int n,int m){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(i==1||i==n||j==1||j==m){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
        public static void reverse_pyramid(int n){
            for(int i=1;i<n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        public static void reverse_half_pyramid(int n){
            for(int i=1;i<=n;i++){
                // for(int j=1;j<=n-i;j++){
                //     System.out.print("\t");
                // }
                for(int j=1;j<=i-1;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        public static void half_number(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+"\t");
                }
                System.out.println();
            }
        }
        public static void half_forward(int n){
            int sum=0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    sum++;
                    System.out.print(sum+"\t");
                }
                System.out.println();
            }
        }
        public static void helf_forward_zeroone(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }
                System.out.println();
    
            }
        }
        public static void butterflypattern(){
            int n=4;
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        public static void solid_rohmbous(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
        public static void solid_holo_rohmbous(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void diamond(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=((2*i)-1);j++){
                    System.out.print("*");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=((2*i)-1);j++){
                    System.out.print("*");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int n=5;
            int m=5;
        //    holopattern(10, 5);
        // reverse_half_pyramid(7);
        // half_number(5);
        // half_forward(5);
        // helf_forward_zeroone(5);
        // butterflypattern();
        // solid_rohmbous(5);
        // solid_holo_rohmbous(5);
        // diamond(5);
    
        }
    }
    
