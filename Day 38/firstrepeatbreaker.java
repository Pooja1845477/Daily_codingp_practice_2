 import java.util.*;

public class firstrepeatbreaker {
   


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        int maxlen=0;
        
LinkedHashSet<Character> ob=new LinkedHashSet<>();
for(int i=0;i<s.length();i++){

char ch=s.charAt(i);
if(ob.contains(ch)){
break;}
ob.add(ch);
System.out.print(ch);
}
}
}

}
