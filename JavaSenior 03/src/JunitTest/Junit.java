package JunitTest;

import org.junit.Test;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 关于String算法的一些题目
 * @date 2022/2/13 22:25
 */
public class Junit {
    public static void main(String[] args) {
        Junit j = new Junit();
        String the = j.getServer1("abcdefg",2,5);
        System.out.println(the);
        int num = j.getNum("abkkcadkabkebfkabkskab","ab");
        System.out.println(num);
        String xin = j.getSort("abcwerthlyuiodfz");
        System.out.println(xin);
        String stringBuffer = j.getServer2("abcdefg",2,5);
        System.out.println(stringBuffer);
        String test = j.getTrim("  he llo   ");
        System.out.println(test);
    }

    public String getServer(String ziFu,int startWith,int endWith){
        if (ziFu != null){
            char[] chars = ziFu.toCharArray();
            for (int x = startWith,y = endWith; x< y;x++,y--) {
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            String theEnd = new String(chars);
            return theEnd;
        }
        return null;
    }


    public String getServer1(String ziFu1,int startWith,int endWith){
        if (ziFu1 != null){
            String start = ziFu1.substring(0, startWith);
            String end = ziFu1.substring(endWith+1);
            for (int i = endWith; i >= startWith; i--) {
                start += ziFu1.charAt(i);
            }
            start += end;
            return start;
        }
        return null;
    }

    public String getServer2(String zi1,int start,int end){
        if (zi1!= null){
                StringBuffer str = new StringBuffer(zi1.length());
            str.append(zi1.substring(0,start));
            for (int i = end; i >= start; i--) {
                str.append(zi1.charAt(i));
            }
            str.append(zi1.substring(end+1));
            return str.toString();
        }
        return null;
    }

    @Test
    public String getTrim(String xin){
        int startWith = 0;
        int endWith = xin.length()-1;

        if (xin != null){
            while (startWith < endWith && xin.charAt(startWith) == ' '){
                startWith++;
            }
            while(startWith < endWith && xin.charAt(endWith) == ' '){
                endWith--;
            }
            if (xin.charAt(startWith) == ' '){
                return " ";

            }
            return xin.substring(startWith,endWith +1 );
        }
        return null;
    }


    public int getNum(String zi1,String zi2){
        int num = 0;
        if (zi1.length() >= zi2.length()){
            while ((zi1.indexOf(zi2) != -1)){
                zi1 = zi1.substring(zi1.indexOf(zi2) + zi2.length());
                num++;
            }
        }
        return num;
    }


    public String getSort(String zi3){
    char[] chars = zi3.toCharArray();
    for (int i = 0; i < chars.length-1; i++) {
            for (int j= 0;j < chars.length-1-i;j++){
                if (chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        String xin = new String(chars);
        return xin;
    }
}
