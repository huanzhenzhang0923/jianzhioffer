public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0, mx=-1, index=gas.length-1;
        for (int i=gas.length-1;i>=0;i--) {
            total+=gas[i]-cost[i];
            if(total>mx){
                index=i;
            }
        }
        return (total<0)? -1: index;
    }
}
