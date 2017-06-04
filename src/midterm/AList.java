package midterm;

/**
 * Created by sanjaysaha on 11/28/16.
 */
public class AList {
    private int [] array;
    public AList(int n) {
        array = new int[n];
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AList other = (AList) obj;
        if (this.array.length != other.array.length)
            return false;

        for(int i=0; i<array.length; i++) {
            if (array[i] != other.array[i])
                return false;
        }
        return true;
    }
}
