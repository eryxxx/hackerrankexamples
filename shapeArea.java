int shapeArea(int n) {
    if(n==1){
    return 1;
}
    else{
        return shapeArea(n-1)+4*(n-1);
    }
}
*************************
int shapeArea(int n) {
  return (n*n)+( (n-1)*(n-1) ); 
}
*****************************
int shapeArea(int n) {
    return (int) (Math.pow(n,2)+(Math.pow(n-1,2)));
}
**********************
