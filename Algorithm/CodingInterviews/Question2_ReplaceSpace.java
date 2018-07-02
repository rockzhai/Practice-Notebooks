package CodingInterviews;

public class Question2_ReplaceSpace {
    /**
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    public class Solution {
        public String replaceSpace(StringBuffer str) {
            StringBuffer stb = new StringBuffer();
            for(int i = 0;i<str.toString().length();i++)
            {
                char b = str.charAt(i);
                if(String.valueOf(b).equals(" "))
                {
                    stb.append("%20");
                }else{
                    stb.append(b);
                }
            }
            return stb.toString();
        }

    }
}
