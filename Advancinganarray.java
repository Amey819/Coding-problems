// Advancing through an array


public boolean advancingthruarray(List<> A)
{
    // Appraoch: O(n) time and O(1) space
    int furthestsofar = 0; //  keep track of the farthest idex reached in the array
    int lastindex = A.size() -  1;
    for(int i = 0; i <= furthestsofar && furthestsofar <= lastindex ; i ++) // loop ends if entire loop furthestpoint doesnt increment which means its 0 or if the array is complete;y travaersed which means success.
    {
        furthestsofar = Math.max(furthestsofar, i + A.get(i)); // At every point in the array check if the value can take us to a point farther from the current point
    }
    return furthestsofar >= lastindex; // returns true if furthestpoint crosses array lastindex.
}



