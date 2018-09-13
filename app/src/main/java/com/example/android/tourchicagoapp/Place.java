package com.example.android.tourchicagoapp;

/***
 *  {@link Place} represents an attraction which can comprise of a site, museum, restaurant,
 *  sports arena, etc. Members include place name, place description, and image file if it exists
 */
public class Place {

    private int mPlaceNameId;
    private int mPlaceDescriptionId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Place (int placeNameId, int placeDescriptionId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
    }

    public Place (int placeNameId, int placeDescriptionId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
        mImageResourceId = imageResourceId;
    }

    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
