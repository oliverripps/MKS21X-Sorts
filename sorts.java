public class sorts{
  public static void selectionsort(int[] ary){
    int[] ary2= new int[0];
    ary2[0]=ary[0];
    for(int i=0;i<ary.length;i++){
      for(int p=0; p<ary2.length;p++){
        if(ary[i]<ary2[p]){
          add(ary,p,i);
          i++;
          p=0;
        }
      }
    }}
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
