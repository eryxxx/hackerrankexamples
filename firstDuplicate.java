int firstDuplicate(int[] a) {

    HashSet<Integer> set = new HashSet();
for (int i=0; i<a.length; i++){

if(set.contains(a[i])){
    return a[i];
}
else{
    set.add(a[i]);
}
}
return -1;
}

****************************
int firstDuplicate(int[] a) {
    for(int i=0;i<a.length;i++)
        if(a[Math.abs(a[i])-1]<0)
            return Math.abs(a[i]);
        else{
            a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
        }
    return -1;
}
*****************************
int firstDuplicate(int[] a) {
    for (int i:a){
        if (a[Math.abs(i)-1]<0) return Math.abs(i);
        a[Math.abs(i)-1]*=-1;
    }
    return -1;
}
 