class j40{
public static void simple(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*\t");
}
System.out.println();
}
}
public static void simple_reverse(int n){
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*\t");
}
System.out.println();
}
}
public static void simple_mirror(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("\t");
}
for(int j=1;j<=n-i+1;j++){
	System.out.print("*\t");
}
System.out.println();
}
}
public static void simple_mirror_reverse(int n){
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("\t");
}
for(int j=1;j<=n-i+1;j++){
	System.out.print("*\t");
}
System.out.println();
}
}
public static void simple_triangle(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print("\t");
}
for(int j=1;j<=(2*i)-1;j++){
	System.out.print("*\t");
}
System.out.println();
}
}
public static void simple_tilledbox(int n){
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
public static void simple_holo_tilledbox(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print("\t");
}
for(int j=1;j<=n;j++){
	if(i==1||i==n||j==1||j==n){
	System.out.print("*\t");
	}else{
	System.out.print("\t");
}
}
System.out.println();
}
}
public static void simple_butterfly(int n){
for(int i=1;i<=n;i++){
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
public static void simple_01(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
	if((i+j)%2==0){
System.out.print("0\t");
	}else{
		System.out.print("1\t");
}
}
System.out.println();
}
}
public static void main(String[] args){
/*simple(5);
simple_reverse(5);
simple_mirror(5);
simple_mirror_reverse(5);
simple_triangle(5);
simple_tilledbox(5); 
simple_holo_tilledbox(5);
simple_butterfly(5);*/
simple_01(5);
}
}