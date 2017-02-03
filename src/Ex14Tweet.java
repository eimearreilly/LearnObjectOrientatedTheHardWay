/**
 * Created by eimearreilly on 02/02/2017.
 */
public class Ex14Tweet {

    private String createdAt;
    private int favouriteCount;
    private boolean favourited;
    private long id;
    private int retweet_count;
    private boolean retweeted;
    private String text;

    public Ex14Tweet(String createdAt, int favouriteCount, boolean favourited, long id, int retweet_count, boolean retweeted, String text){

        this.createdAt = createdAt;
        this.favouriteCount = favouriteCount;
        this.favourited = favourited;
        this.id = id;
        this.retweet_count = retweet_count;
        this.retweeted = retweeted;
        this.text = text;
    }

    public String toString(){
        String out = "";
        out += text +"\n";

        if(this.retweet_count>0){
            out += "Retweets: " + this.retweet_count + " ";
        }

        if (favouriteCount >0){
            out += "Favourites: " + favouriteCount + "\n";
        }

        else{
            out += "\n";
        }

        out += createdAt + "\n";
        if(retweeted){
            out += "[^v]";
        }

        else{
            out +="[ ]";
        }
        if( this.favourited){
            out +="[*]";
        }
        else{
            out +="[ ]";
        }
        return out;
    }
}
