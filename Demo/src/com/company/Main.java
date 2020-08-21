package com.company;

class Newsdemo
{

    public static void main()
    {
        News nw =new News(1,"Cricket","Test Match", "Sports", "Ram;");
        nw.display();

    }

}

class News
{
    int newsid;
    String newstitle;
    String newscontent;
    String category;
    String editor;
    public News(int newsid, String newstitle, String newscontent,String category, String editor)
    {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newscontent= newscontent;
        this.category = category;
        this.editor= editor;
    }


    public void display()
    {
        System.out.println(newsid+""+newstitle+""+newscontent+""+category+""+editor);
    }
}