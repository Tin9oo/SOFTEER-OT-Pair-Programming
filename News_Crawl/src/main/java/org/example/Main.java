package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String URL = "https://news.sbs.co.kr/news/newsflash.do?plink=SNB&cooper";
        Document doc = Jsoup.connect(URL).get();

        List<Element> elements = doc.select(".w_news_list ul > li");

        for(Element e : elements) {
            System.out.println(e.getElementsByClass("sub").text());
        }
    }
}