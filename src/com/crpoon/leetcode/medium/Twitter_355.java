package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter_355 {
	class Twitter {
	    Set<User> users;
	    
	    Twitter() {
	        users = new HashSet<>();
	    }
	    
	    public void addUser(int userId) {
	        User u = new User(userId);
	        users.add(u);
	    }
	    
	    private User findUser(int userId) {
	        for (User u : users) {
	            if (u.id == userId) {
	                return u;
	            }
	        }
	        return null;
	    }
	    
	    public void postTweet(int userId, int tweetId) {
	        User u = findUser(userId);
	        if (u != null) {
	            u.makeTweet(tweetId);
	        }
	    }
	    
	    public void follow(int userId, int followId) {
	        User u = findUser(userId);
	        if (u != null) {
	            u.addFollower(followId);
	        }
	    }
	    
	    public void unfollow(int userId, int followId) {
	        User u = findUser(userId);
	        if (u != null) {
	            u.removeFollower(followId);
	        }
	    }
	    
	    public List<Integer> getNewsFeed(int userId) {
	        User u = findUser(userId);
	        List<Integer> returnList = new ArrayList<>();
	        if (u != null) {
	            PriorityQueue<Tweet> queue = new PriorityQueue(10, new CompTweet());
	            System.out.println("LOL");
	            for (Tweet t : u.tweets) {
	                queue.offer(t);
	            }
	            
	            for (Integer followId : u.followers) {
	                User f = findUser(followId);
	                if (f != null) {
	                    for (Tweet t : f.tweets) {
	                        queue.offer(t);
	                    }
	                }
	            }
	            
	            for (int i = 0; i < 10 && !queue.isEmpty(); i++) {
	                returnList.add(queue.poll().id);
	            }
	        }
	        return returnList;
	    }
	}
	class User {
	    int id;
	    Set<Integer> followers;
	    List<Tweet> tweets;
	    
	    public User(int id) {
	        this.id = id;
	        this.followers = new HashSet<>();
	        this.tweets = new ArrayList<>();
	    }
	    
	    public void  addFollower(int id) {
	        followers.add(id);
	    }
	    
	    public void removeFollower(int id) {
	        if (followers.contains(id)) {
	            followers.remove(id);
	        }
	    }
	    
	    public void makeTweet(int id) {
	        Tweet t = new Tweet(id);
	        tweets.add(t);
	    }
	}

	class Tweet {
	    int id;
	    Date timestamp;
	    
	    public Tweet(int id) {
	        this.id = id;
	        this.timestamp = new Date();
	    }
	}

	class CompTweet implements Comparator<Tweet> {
	    public int compare(Tweet t1, Tweet t2) {
	        return t1.timestamp.compareTo(t2.timestamp);
	    }
	}
}
