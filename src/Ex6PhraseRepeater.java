/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex6PhraseRepeater {
    String phrase;
    int repeat;

    public void setValues(String p,int r){
        phrase = p;
        repeat = r;
    }

    public String getrepeatedPhrase(){
        String result = "";
        for(int i=0; i<repeat; i++)
            result += phrase;
        return result;
    }

}
