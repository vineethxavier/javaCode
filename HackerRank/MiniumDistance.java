package HackerRank;

public class MiniumDistance {
    public static void main(String[] args) {
        int [] a = {3,5,4,1,6,6,5,4,8,3};
        int x =1;
        int y =3;
        int minDist = findMinDistanceBetween(x,y,a);
        System.out.println("min distance beween x:" +x+" y:"+y+" is " +minDist);
    }

    private static int findMinDistanceBetween(int x, int y, int[] a){
        //int minDist = Integer.MIN_VALUE;
        int minDist =-1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((a[i]==x && a[j]==y)||(a[i]==y && a[j]==x) && minDist >Math.abs(i-j)){
                    minDist = Math.abs(i-j);
                }
            }
        }
        return minDist;
    }
}
