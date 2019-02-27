package com.andreimironov.locatr;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

public class GalleryItem {
    @SerializedName("id") private String mId;
    @SerializedName("title") private String mCaption;
    @SerializedName("url_s") private String mUrl;
    @SerializedName("owner") private String mOwner;
    @SerializedName("latitude") private double mLat;
    @SerializedName("longitude") private double mLon;

    public String getCaption() {
        return mCaption;
    }

    public String getOwner() {
        return mOwner;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public double getLon() {
        return mLon;
    }

    public void setLon(double lon) {
        mLon = lon;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Uri getPhotoPageUri() {
        return Uri
                .parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" +
                "mLat:" + mLat + ", " +
                "mLon" + mLon +
                "]";
    }
}
