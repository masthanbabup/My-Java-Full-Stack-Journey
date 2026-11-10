class Solution {
    public String interpret(String command) {
     String s= command.replace("()","o");
    return s.replace("(al)","al");
    }
}