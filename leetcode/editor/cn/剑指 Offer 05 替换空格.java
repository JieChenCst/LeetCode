//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 189 👎 0


package leetcode.editor.cn;
/**
 * title   ti-huan-kong-ge-lcof
 * @author chenjiecst
 * 2021-12-15 14:15:46
 */
public class TiHuanKongGeLcof{
    public static void main(String[] args){                                                               
        Solution solution = new TiHuanKongGeLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        if(s == null) return  new String();
        String temp = "%20";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
