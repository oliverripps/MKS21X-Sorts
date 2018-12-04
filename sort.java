public class sort{
  public static void selectionsort(int[] ary){
    int low;
    for(int i=0;i<ary.length;i++){
      low=ary[i];
      for(int p=0; p<ary.length;p++){
        if(ary[p]<low){
          low=ary[p];
        }}
      ary[i]=low;
      }
    }


    /*
    int low;
    int high;
    int cur;
    for(int i=0; i<ary.length;i++){
      if(ary[i]<=low){
        cur=ary[i];
        shiftright(ary,i);
        ary[0]=cur;
      }
    }
  }*/
  public static void add(int[] ary, int origin, int newvalue){
    for(int i=ary.length;i>origin;i++){
      ary[i+1]=ary[i];
    }
    ary[origin]=newvalue;
  }
  /*public static void main(args[] String){
    int[] ary = {1,3,6,3,6,3,8};
    System.out.println(selectionsort(ary));
  }*/

}
