package testb;

///*
// * Given a 2D list of Strings, return the String found at index x and y.
// *
// * Example input [[["test", "strings"],["more"],["quite a long string"]], 0, 0]
// * Example output "test"
// *
// * Example input [[["test", "strings"],["more"],["quite a long string"]], 0, 1]
// * Example output "strings"
// *
// * Example input [[["test", "strings"],["more"],["quite a long string"]], 2, 0]
// * Example output "quite a long string"
// *
// */

/**
 * Given a list of emails, return a new list containing only emails
 * which are valid.
 *
 * Valid emails in this case contain exactly one '@' and have at least 1 '.' after the '@'.
 *
 * Example input ["a string", "emails@email.com", "test.com", "@email", "test.user@email.co.uk"]
 * Example output ["emails@email.com", "test.user@email.co.uk"]
 *
 * @param inputEmails
 * @return
 */
//public List<String> findValidEmails(List<String> inputEmails) {
 //       return null;
  //      }



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//public String getByIndex(List<List<String>> strings, int x, int y) {
//        return null;
 //       }
public class MainE {

    public static void main(String[] args) {

        String[] inputs = {"a string", "emails@email.com", "test.com", "@email", "test.user@email.co.uk"};
        List<String> emails = Arrays.asList(inputs);
        List<String> output = emails.stream().filter(s->isValidEmail(s)).collect(Collectors.toList());
        System.out.println(output);
    }


    public static boolean isValidEmail(String email){

        boolean isEmailValid = false;

        if(email==null && email.length()<3){
            return isEmailValid;
        }

        String[] inputs = email.split("@");

        if(inputs.length ==2 ){

            if(inputs[1].contains(".")){
                return true;
            }
        }
        else{
            return isEmailValid;
        }
        return false;
    }




}
