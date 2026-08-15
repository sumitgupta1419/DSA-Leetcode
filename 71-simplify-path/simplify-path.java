class Solution {
    public String simplifyPath(String path) {

        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String i : arr) {

            if (i.equals("..") && !stack.isEmpty()) {
                stack.pop();
            }
            else if (!i.isEmpty() && !i.equals(".") && !i.equals("..")) {
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String dir : stack) {
            sb.append("/");
            sb.append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}