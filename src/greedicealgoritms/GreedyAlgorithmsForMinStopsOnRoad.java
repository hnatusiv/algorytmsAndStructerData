package greedicealgoritms;

public class GreedyAlgorithmsForMinStopsOnRoad {
    public static void main(String[] args) {
        int[] stations = {0 , 200 , 375 , 550 , 750 , 950 , 1050 , 1250 , 1350 ,1500,1550,1600,1650,1700,1750,1800};
        System.out.println("Optimus fuel = " + minStopsForFuel(stations , 400));
    }
    private static int minStopsForFuel(int[] stations , int capacity) {
        int result = 0;//optimise numbers stops
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;

    }
}
