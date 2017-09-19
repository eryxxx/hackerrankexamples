int largestNumber(int n) {
    String maxNumber = "1";
    for(int i=0; i<n; i++){
        maxNumber += "0";
    }
    return Integer.parseInt(maxNumber) - 1;
}
