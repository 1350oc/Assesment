class Pangram
{
  public static void main(String args[]){
    String str="The quick brown fox jumps over a lazy dog";
    str=str.replace(" ","");
    str=str.toUpperCase();
    char str1[]=str.toCharArray();
    int size=str1.length;
    int a[]=new int[26];
    int i=0,index=0;
    while(i!=size){
        index=str1[i]-65;
        a[index]=1;
        i++;
    }
    i=0;
    while(i!=26){
        if(a[i]==1){
            i++;
        }
        else{
            System.out.println("not an pangram");
            break;
        }
    }
    if(i==26){
    
    System.out.println("pangram");
    }
  }

  }