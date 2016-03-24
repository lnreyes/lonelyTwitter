package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Ian on 22/03/2016.
 */
@SuppressWarnings("SameParameterValue")
class TweetList {
    private ArrayList<Tweet> tweets;

    public TweetList(){
        tweets = new ArrayList<Tweet>();
    }

    public TweetList(ArrayList<Tweet> t){
        tweets = t;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(){
        return tweets.get(0);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public int countImportant() {
        //Count important tweets
        int numImportant =0;
        for ( Tweet aTweet: tweets ){
            if (aTweet.isImportant() == Boolean.TRUE){
                numImportant++;
            }
        }
        return numImportant;
    }
}
