package com.fernandoim.newsappstage1;

public class News {

    private String mTitle;
    private String mSection;
    private String mUrl;
    private final String mAuthor;



    public News(String title, String section, String url, String author ) {
        this.mTitle = title;
        this.mSection = section;
        this.mUrl = url;
        this.mAuthor = author;

    }



    public String getTitle(){return mTitle;}
    public String getSection(){return mSection;}
    public String getUrl(){return mUrl;}
    public String getAuthor(){return mAuthor;}


}
