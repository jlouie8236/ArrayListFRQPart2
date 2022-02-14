import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> array = new ArrayList<>();
        for (String token : tokens)
        {
            if (token.equals(openDel) || token.equals(closeDel))
            {
                array.add(token);
            }
        }
        return array;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int open = 0;
        int close = 0;
        for (String delimiter : delimiters)
        {
            if (delimiter.equals(openDel))
            {
                open++;
            }
            if (delimiter.equals(closeDel))
            {
                close++;
            }
            if (close > open)
            {
                return false;
            }
        }
        return open == close;

    }
}