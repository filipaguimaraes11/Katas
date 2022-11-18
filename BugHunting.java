public class BugHunting {

    //TODO Problem 1
    //CORRECTION: bounds[j + i] will never be different from bounds[j + i] conditions not evaluated
    //line 10 = must be bounds[j + 1] != other.bounds[j + 1]
    private boolean checkDimensions(CLIQUEUnit other, int e) {
        for(int i= 0, j = 0; i < e; i++, j += 2) {
            if(dims[i] != other.dims[i]
            || bounds[j] != other.bounds[j]
            || bounds[j + 1] != bounds[j + 1]) {
                return false;
            }
        }
        return true;
    }

    //TODO Problem 2
    //CORRECTION: if the list has size 1, there is no index 1, only 0
    //line 22 should be = return points.size() == 1 ? points.get(1) : null;
    @Override
    public double[] computeMean() {
        return points.size() == 1 ? points.get(1) : null;
    }

    //TODO Problem 3
    //CORRECTION:
    // if(referenceSetSize < 0) will through an error, set can't be negative,
    // should be equal to 0 so the warning pops with empty reference set.

    //TODO Problem 4
    //CORRECTION: the if condition should be if(c == '' || c == '\n' || c == '\r' || c == '\t')
    //so it can keep going and stop only when it finds one of these characters.


    //TODO Problem 5
    //

    //TODO Problem 6
    //index_64.length must be changed to (index_64.length-1) or (x >= index_64.length)

    //TODO Problem 7
    //we cannot call methods in a null / non-existent instance of a class  ---> dataTmpFile.createNewFile()


    //TODO Problem 8
    //change the operator << to >> so it can make a shift right and not a shift left

    //TODO Problem 9
    //if(!rgsToRead[ix] continue; should be changed to

    //TODO Problem 10
    //

    //TODO Extra Problem
    //

}
