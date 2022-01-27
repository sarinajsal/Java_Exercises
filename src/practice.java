

        public class practice {
            public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */
                String result = "" ;
                String[] content = {"you", "are", "how", "hello"};
                for (int i = content.length-1; i >= 0; i--) {
                    System.out.println(content[i]);

                    result = result + content[i] + " ";
//                result += content[i] + " ";

                }
                //System.out.println(result.substring(0, result.length() - 1) + "?");
//                System.out.println(result.substring(0, result.length()) + "?");

                System.out.println(result + "?");



            }
        }









