package com.example.android.p6_newsbynormacmartinez;

import java.util.Date;

public class News {

    /**
     * Title of the news
     */
    private final  String newsTitle;

    /**
     * Topic of the news
     */
    private final String newsTopic;

    /**
     * Author of the news
     */
    private final String newsAuthor;

    /**
     * Date of the news
     */
    private final Date newsDate;

    /**
     * Website URL of the news
     */
    private final String newsUrl;

    /**
     * image of the newsImage
     */
    private final String newsImage;

    /**
     * Constructs a new {@link News} object.
     * @param title is the title of the news
     * @param topic is the subject where the news is classified
     * @param author is author's name
     * @param date the publication date
     * @param url is the Website where the news information is located
     * @param image is the image about news
     */

    public News(String title, String topic, String author, Date date, String url, String image){
        newsTitle = title;
        newsTopic = topic;
        newsAuthor = author;
        newsDate = date;
        newsUrl = url;
        newsImage = image;

    }

    /**
     * Returns the title of the news.
     */
    public String getTitle() {
        return newsTitle;
    }

    /**
     * Returns the topic of the news.
     */
    public String getTopic() {
        return newsTopic;
    }

    /**
     * Returns the Author of the news.
     */
    public String getAuthor() {
        return newsAuthor ;
    }

    /**
     * Returns Date of the news.
     */
    public Date getDate(){
        return newsDate;
    }

    /**
     *  Return the Website where the news information is located
     */
    public String getUrl() {
        return newsUrl;
    }

    /**
     * Return the image about the news
     */
    public String getImage() {
        return newsImage;
    }
}
