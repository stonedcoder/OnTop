package com.example.vraun.ontop;

/**
 * Created by vraun on 09-02-2017.
 */

public class News {

    private String mImageResouce ;
    private String  mHeadline;
    private String mAuthor;
    private String mUrl;

    /**
     * Construct {@link News}
     *
     * @param image
     * @param headline
     * @param author
     * @param url
     */
    public News(String image , String headline ,String author , String url) {
        mImageResouce = image ;
        mHeadline = headline ;
        mAuthor = author;
        mUrl = url;

    }

    /**
     * Returns the url of the image.
     */
    public String getImageResource() {
        return mImageResouce;
    }

    /**
     * Returns the title of the news.
     */
    public String getTitle() {
        return mHeadline;
    }

    /**
     * Return the author of the news article.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Return the url of the News Article.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Return (Boolean) True if Article has Image, False if article has no image.
     *
     * @return
     */
    public boolean hasImage() {
        return mImageResouce != NO_IMAGE_PROVIDED;
    }

}
