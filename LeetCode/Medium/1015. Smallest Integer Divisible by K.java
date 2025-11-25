class Solution
{

    public
    int
    smallestRepunitDivByK
    (
        int k
    )
    {

        if
        (
            k % 2 == 0
            || k % 5 == 0
        )
        {
            return -1;
        }

        int ans = 1;
        int worker = 1;


        while
        (
            worker % k > 0
        )
        {
            worker = ( ( worker * 10 ) + 1 ) % k;
            ans ++;
        }


        return ans;
    }
    
}
