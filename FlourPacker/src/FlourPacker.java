public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 10));
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
//        int totalKilosAvailable = bigCount * 5 + smallCount;
//        if (goal > totalKilosAvailable) return false;
//
//        for (int i=0; i<bigCount; i++) {
//            if (goal - 5 < 0) break;
//            goal -= 5;
//        }
//        for (int i=0; i<smallCount; i++) {
//            if (goal - 1 < 0) break;
//            goal -= 1;
//        }
//        return goal == 0;
//    }


    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal%5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }


}
