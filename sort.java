public class sort{
  public static int[] selectionsort(int[] ary){
    int templow;
    int counter = 0;
    int current;
    int currentindex;
    for(int i=0;i<ary.length;i++){
      templow=ary[i];
      current=ary[i];
      currentindex=i;
      for(int p=counter; p<ary.length;p++){
        if(ary[p]<templow){
          templow=ary[p];
          current=ary[i];
          currentindex=p;
        }}
      ary[currentindex]=current;
      ary[i]=templow;
      counter++;
    }
    return ary;
  }
  private static String toString(int[] ary){
    String str = "";
    for(int i=0;i<ary.length;i++){
      str+=ary[i];
      str+=",";
    }
    return str;
  }
  public static void main(String[] args){
    int[] ary = {5,2,6,64,6,8,3,2};
    System.out.println(toString(selectionsort(ary)));
  }
}
