class Solution {
    int count=0;
    public int hammingDistance(int x, int y) {
        recursion(x,y);
        return count;
    }
    public void recursion(int x, int y) {
        if (x!=0 || y!=0) {
            if (x%2!=y%2) {
                count++;
            }
            //x=(int)Math.floor(x/2);
            //y=(int)Math.floor(y/2);
            recursion((int)Math.floor(x/2),(int)Math.floor(y/2));
        }
    }
}
