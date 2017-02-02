/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex5StringFunObject {
    String message;

    public void setMessage(String s){
        message = s;
    }

    public String getMessage(){
        return message;
    }

    public void reverse(){
        String rev = "";
        for (int i=message.length()-1; i>=0; i--)
            rev += message.substring(i, i+1);
        message = rev;
    }

    public void camelCase(){
        String[] words = message.toLowerCase().split(" ");
        String result = "";
        for (String w:words)
            result += w.substring(0,1).toUpperCase() + w.substring(1);

        message = result;
    }

    public void halfMessage(){
        String half = "";
        int halfpos = message.length()/2;
        message = message.substring(0,halfpos);
    }
}
