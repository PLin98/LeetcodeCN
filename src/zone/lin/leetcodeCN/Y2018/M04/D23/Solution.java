//给定两个字符串 s 和 t，判断它们是否是同构的。
//如果 s 中的字符可以被替换最终变成 t ，则两个字符串是同构的。
//所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。
//两个字符不能映射到同一个字符上，但字符可以映射自己本身。
//例如，
//给定 "egg", "add", 返回 true.
//给定 "foo", "bar", 返回 false.
//给定 "paper", "title", 返回 true.
//注意：
//你可以假设 s 和 t 具有相同的长度。
package zone.lin.leetcodeCN.Y2018.M04.D23;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] m=new int[256];
        for(int i=0;i<s.length();i++)
        {
        	if(m[s.charAt(i)]!=m[t.charAt(i)+128])
        		return false;
        	m[s.charAt(i)]=m[t.charAt(i)+128]=i+1;
        }
        return true;
    }
}