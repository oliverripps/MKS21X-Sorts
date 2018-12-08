public class Sorts{
  public static void selectionSort(int[] ary){
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
  }
  public static void bubbleSort(int[] data){
    boolean ready= false;
    int current;
    while(!ready){
      ready=true;
      for(int i = 0;i<data.length-1;i++){
        if(data[i]>data[i+1]){
          current=data[i];
          data[i]=data[i+1];
          data[i+1]=current;
          ready=false;
        }
      }
    }
  }
  private static String toString(int[] ary){
    String str = "";
    for(int i=0;i<ary.length;i++){
      str+=ary[i];
      if(i<ary.length-1){
        str+=",";
      }
    }
    return str;
  }

  public static void main(String[] args){
    int[] ary = {5,2,6,64,6,8,3,2, -1, 57, 0};
    System.out.println(toString(ary));
    bubbleSort(ary);
    System.out.println(toString(ary));
  }
}
