package ru.ssau.tk.Lilpank.WeatherZhigulevsk;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URL;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://yandex.ru/pogoda/zhiguliovsk";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        try {
            Document page = getPage();
            String date;

            Element divCountry = page.select("div.header-title.header-title_in-fact").first();
            Element nameCountry = divCountry.select("h1.title.title_level_1.header-title__title").first();

            Element divTheme = page.select("div.fact__time-yesterday-wrap").first();
            Elements valueTheme = divTheme.select("time.time.fact__time");


            Element divTemp = page.select("div.temp.fact__temp.fact__temp_size_s").first();
            Elements valueTemp = divTemp.select("span.temp__value");

            System.out.println(valueTheme.text());
            System.out.println(nameCountry.text() + " " + valueTemp.text());
        } catch (SocketTimeoutException e) {
            System.out.println("Упс, произошла ошибка.Запустите программу ещё разок.");
        }
    }
}
