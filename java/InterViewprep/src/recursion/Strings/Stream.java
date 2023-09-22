package recursion.Strings;

public class Stream {
    public static void main(String[] args) {
        //skip("" , "baccad");
        System.out.println(skip("vaav"));
        System.out.println("vineet".length());
        System.out.println(skipString("vineetapplehere"));
        System.out.println(skipnotApp("vineetappapplehere"));
    }

//approach 1
    static void skip(String p , String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        if(ch== 'a'){
            skip(p , unp.substring((1)));
        }else{
          skip(p+ch , unp.substring(1));
        }
    }
//approach 2
    static String skip(String unp){
        if(unp.isEmpty()){
            return "";
        }
        char ch = unp.charAt(0);
        if(ch== 'a'){
          return  skip(unp.substring((1)));
        }else{
           return ch+skip(unp.substring(1));
        }

    }

// skip a string
    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return  skipString(up.substring((5)));
        }else{
            return up.charAt(0)+skipString(up.substring(1));
        }

    }

    static String skipnotApp(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return  skipnotApp(up.substring((3)));
        }else{
            return up.charAt(0)+skipnotApp(up.substring(1));
        }

    }

}
