package com.stackroute;

import java.util.Scanner;

public class Main {
	News n = new News();

    public static void main(String[] args) {
	Main m= new Main();
	m.enter(1, "Cricket", "Test Match", "Sports", "James");
	m.display();
    }

	public void enter(int newsID, String newsTitle, String newsContent, String newsCategory, String editor)
	{
		n.setNewsID(newsID);
		n.setNewsTitle(newsTitle);
		n.setNewsContent(newsContent);
		n.setNewsCategory(newsCategory);
		n.setEditor(editor);

	}
	public void display()
	{
		System.out.println(n.getNewsID() + "\t"+ n.getNewsTitle() + "\t" + n.getNewsContent() + "\t" + n.getNewsCategory() + "\t" + n.getEditor() );
	}

}
