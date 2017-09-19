int adjacentElementsProduct(int[] inputArray) {
int currentHigh = 0;

for (int i = 0; i < inputArray.length -1 ; i++) 
{
    if(inputArray[i] * inputArray[i + 1] > inputArray[currentHigh] * inputArray[currentHigh + 1])
    {
        currentHigh = i;
    }
}


return inputArray[currentHigh] * inputArray[currentHigh + 1];
}