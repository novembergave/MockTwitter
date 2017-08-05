package com.novembergave.apps.mocktwitter;

/**
 * Created by novembergave on 05/08/2017.
 */

public class TweetObject {
    private String accountName;
    private String accountHandle;
    private boolean accountVerification;
    private long timeStamp;
    private int timeDifference;
    private String message;

    public TweetObject() {
        // Default empty constructor
        // Useful if using a third-party library to parse JSON etc
    }

    public TweetObject(String accountName, String accountHandle, boolean accountVerification, long timeStamp, int timeDifference, String message) {
        this.accountName = accountName;
        this.accountHandle = accountHandle;
        this.accountVerification = accountVerification;
        this.timeDifference = timeDifference;
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountHandle() {
        return accountHandle;
    }

    public void setAccountHandle(String accountHandle) {
        this.accountHandle = accountHandle;
    }

    public boolean isAccountVerification() {
        return accountVerification;
    }

    public void setAccountVerification(boolean accountVerification) {
        this.accountVerification = accountVerification;
    }

    public int getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(int timeDifference) {
        this.timeDifference = timeDifference;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
