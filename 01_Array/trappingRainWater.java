// Ques. Given n non-negative integer represting an elevation map where the width of each bar is 1,
//       compute how much water it can trap after raining.
// Note: Trap water = (water level - bar level height) * width
//               water level =  min(maxleftboundary , maxrightboundary)
// height = [4, 2, 0, 6, 3, 2, 5]  (Auxiliary array / Helper array / normal array nothing special)
// maxleftboundary = [4, 4, 4, 6, 6, 6, 6]
// maxrightboundary = [6, 6, 6, 6, 5, 5, 5]


public class trappingRainWater {
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));

    }

    public static int trappedRainWater(int height[]){
        int n = height.length;
        // calculate maxleftboundary
        int maxleftboundary[] = new int[n];
        maxleftboundary[0] = height[0];
        for(int i=1; i<n; i++){
            maxleftboundary[i] = Math.max(maxleftboundary[i-1], height[i]);
        }

        // calculate maxrightboundary
        int maxrightboundary[] = new int[n];
        maxrightboundary[n-1] = height[n-1];
        for(int i = n-2; i>= 0; i--){
            maxrightboundary[i] = Math.max(maxrightboundary[i+1], height[i]);
        }

        int trapwater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(maxleftboundary[i], maxrightboundary[i]);
            trapwater += waterLevel - height[i];
        }

        return trapwater;
    }
}
