public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int l=nums.length;
        int current_Streak=0;
        int max_streak=0;
        for(int i=0;i<l;i++){
            if(nums[i]==1){
                current_Streak++;
                max_streak=Math.max(max_streak,current_Streak);
                
            }else{
                current_Streak=0;
            }

        }return max_streak;
    }

public static void main(String[]args){
int nums[]={0,1,1,0,1,1,1,1,1,0,0,0,0,0};
System.out.println(findMaxConsecutiveOnes(nums));

    }
    
}