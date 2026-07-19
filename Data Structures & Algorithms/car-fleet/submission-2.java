class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int n = pos.length;
        int [][] car = new int[n][2];
        for(int i =0;i<n;i++){
            car[i][0]= pos[i];
            car[i][1] = speed[i];

        }
        int fleet =0;
        double lastfleet =0;
        Arrays.sort(car, (a,b)->b[0]-a[0]);
        for(int i =0;i<n;i++){
            double curtime = (double)(target-car[i][0])/car[i][1];
            if(curtime>lastfleet){
                fleet++;
                lastfleet = curtime;
            }
        }
return fleet;
    }
}
