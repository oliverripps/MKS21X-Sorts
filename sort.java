public class sort{
  public static void selectionsort(int[] ary){
    int templow;
    int counter = 0;
    for(int i=0;i<ary.length;i++){
      templow=ary[i];
      for(int p=counter; p<ary.length;p++){
        if(ary[p]<templow){
          templow=ary[p];
        }}
      ary[i]=templow;
      counter++;
    }
  }
}
