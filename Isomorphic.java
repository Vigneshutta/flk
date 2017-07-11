import java.util.*;
public class Isomorphic {
      public static void main(String[] args) {
            String str1 = "foo";
            String str2 = "bar";
            boolean res = TestIsomorphic.checkIsomorphic(str1,str2);
            System.out.println(res);
      }

      static boolean checkIsomorphic(String str1, String str2) {
            int length = str1.length();
           
            if (length != str2.length()) {
                  return false;
            }

           
            char visited[] = new char[26];
            for (int i = 0; i < visited.length; i++) {
                  visited[i] = '#';
            }

            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();

            
            for (int i = 0; i<length; i++) {
                  char ch = visited[strArr1[i]-'a'];
                  if(ch=='#') {
                        visited[strArr1[i]-'a'] = strArr2[i];
                  } else if (ch != strArr2[i]) {
                        return false;                      
                  }
            }
            return true;
      }
}
