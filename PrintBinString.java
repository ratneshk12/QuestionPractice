public class PrintBinString {
    public static void PrintBinString(int n,int lastPlace, StringBuilder str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        PrintBinString(n-1,0, new StringBuilder(str + "0"));
        if(lastPlace==0){
            PrintBinString(n-1,1, new StringBuilder(str + "1"));
        }
    }

    public static void main(String[] args) {
        PrintBinString(3,0, new StringBuilder(""));
    }
}

