package com.example.patboyle.criminalintent;

import java.util.UUID;

/**
 * Created by patboyle on 1/2/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
