public class sort{
  public static int[] selectionsort(int[] ary){
    int templow;
    for(int i=0;i<ary.length;i++){
      templow=ary[i];
      for(int p=0; p<ary.length;p++){
        if(ary[p]<templow){
          templow=ary[p];
        }}
      ary[i]=templow;
      }
    return ary;
    }

  public static void main(String[] args){
    int[] hi = {1,3,6,3,6,3,8};
    System.out.println(selectionsort(hi));
  }

}
