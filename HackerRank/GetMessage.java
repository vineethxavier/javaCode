package HackerRank;

public class GetMessage{
    public static void main(String[] args) {
       /* String s = "cdeo";
        int[] a = {3,2,0,1};*/
                //  012345678
        String s = "cdeenetpi";
        int[] a = {5,2,0,1,6,4,8,3,7};
        System.out.println(getMessage(s,a));
    }

    private static String getMessage(String s, int[] a)
    {
        char[] chars = s.toCharArray();
        // Initial message
        // First letter in the array
        String finalMessage = String.valueOf(chars[0]);
        // Person in spot 0 will tell me where to send the message
        int destination = a[0];
        while (destination != 0)
        {
            finalMessage += chars[destination];
            destination = a[destination];
        }
        return finalMessage;
    }
}
