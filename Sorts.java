public class Sorts{
  public static void selectionSort(int[] ary){
    if(ary.length!=0){
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
  }
  public static void bubbleSort(int[] data){
    if(data.length!=0){
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
}
  public static void insertionSort(int[] ary){
    if(ary.length!=0){
      int current;
      int amntsorted=1;
      int currentplace=0;
      for(int i = amntsorted;i<ary.length;i++){
        if(ary[i]>=ary[i-1]){
          amntsorted++;
        }
        else{
          current=ary[i];
          for(int l=amntsorted;l>=0;l--){
            if(ary[l]>current){
              ary[l+1]=ary[l];
          }
          else{
            currentplace = l;
            l=-1;
            System.out.println(currentplace);
          }
        }
          ary[currentplace]=current;
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
    int[] ary = {57,-364,698,-8,3,2,0,14,-11, 457, 9};
    System.out.println("Unsorted Array: " + toString(ary));
    selectionSort(ary);
    System.out.println("Sorted Using selectionSort: " + toString(ary));
    int[] resetary = {57,-364,698,-8,3,2,0,14,-11, 457, 9};
    System.out.println("Unsorted Array: " + toString(resetary));
    bubbleSort(resetary);
    System.out.println("Sorted Using bubbleSort: " + toString(resetary));
  }
}
