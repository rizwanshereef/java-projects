package com.stackroute;

public class News {

    int newsID;
    String newsTitle;
    String newsContent;
    String newsCategory;
    String editor;

    public int getNewsID() {
        return newsID;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(String newsCategory) {
        this.newsCategory = newsCategory;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsID=" + newsID +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsCategory='" + newsCategory + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
