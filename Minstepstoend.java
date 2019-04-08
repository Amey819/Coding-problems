// count the minimum no of steps to reach the end

// Advancing through an array
// Reach the end of the array 
public int advancingthruarray(List<> A)
{
    // Appraoch: O(n) time and O(1) space
    int furthestsofar = 0; //  keep track of the farthest idex reached in the array
    int lastindex = A.size() -  1;
    int prev_val = 0;
    int counter = 0;
    for(int i = 0; i <= furthestsofar && furthestsofar <= lastindex ; i ++) // loop ends if entire loop furthestpoint doesnt increment which means its 0 or if the array is complete;y travaersed which means success.
    {
        furthestsofar = Math.max(furthestsofar, i + A.get(i)); // At every point in the array check if the value can take us to a point farther from the current point
        if(furthestsofar > prev_val)
        {
            counter += 1;
        }
        prev_val = furthestsofar;
        // check if current > previous if yes counter += 1
    }
    return counter; // returns true if furthestpoint crosses array lastindex.
}

