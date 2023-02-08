public class HarmonikOrtalama {
    public static void main(String[] args) throws Exception {
        double[] nums={1,2,3,4,5};
        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=1/nums[i];
        }
        double result=nums.length/sum;
        System.out.println("Harmonik Ort: " + result);
    }
}
//www.patika.dev
