public class Sorts{
  public static void selectionSort(int[] ary){
    if(ary.length!=0){
    int templow;
    int counter = 0;
    int currentindex;
    for(int i=0;i<ary.length;i++){
      templow=ary[i];//setting the temporary lowest and current lowest as the first thing in the ary
      currentindex=i;
      for(int p=i; p<ary.length;p++){
        if(ary[p]<templow){//looping through each element and seeing if it is lower than the current lowest
          templow=ary[p];//if lowest, set as lowest
          currentindex=p;
        }}
      ary[currentindex]=ary[i];//insert the lowest into the next position in the order
      ary[i]=templow;
    }
  }
  }
  public static void bubbleSort(int[] data){
    if(data.length!=0){
    boolean ready= false;//boolean to see if a change was made this round
    int current;
    while(!ready){
      ready=true;
      for(int i = 0;i<data.length-1;i++){//looping through each element
        if(data[i]>data[i+1]){//if they are in the wrong order, switch them
          current=data[i];
          data[i]=data[i+1];
          data[i+1]=current;
          ready=false;//showing a change was made
        }
      }
    }
  }
}
  public static void insertionSort(int[] ary){
    if(ary.length!=0){//testing for not being 0
      int current;
      int amntsorted=1;//amount of peices that are in the correct place from theleft
      for(int i = amntsorted;i<ary.length;i++){//starting with the first wrong one, loop through
        current=ary[i];//current is the one you want to sort
        for(int l=i-1;l>=0;l--){//starting with the first sorted element loop backword
          if(current<ary[l]){//if the current one is less shift right
            ary[l+1]=ary[l];
            ary[l]=current;//insert into the empty space
          }
          else{
            l=-10000;//if its sorted, stop the loop by making it -10000
          }
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
    int[] resetary2 = {57,-364,698,-8,3,2,0,14,-11, 457, 9};
    System.out.println("Unsorted Array: " + toString(resetary2));
    insertionSort(resetary2);
    System.out.println("Sorted Using insertionSort: " + toString(resetary2));
  }
}
