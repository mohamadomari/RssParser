package com.example.RssParser.service;

import com.example.RssParser.model.Job;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class RssService {
    public List<Job> fetchJobsFromRss() {
        List<Job> jobs = new ArrayList<>();
        try {
            URL feedUrl = new URL("https://careers.moveoneinc.com/rss/all-rss.xml/");
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new InputSource(feedUrl.openStream()));

            for (SyndEntry entry : feed.getEntries()) {
                String title = entry.getTitle();
                String[] parts = title.split(" - ");
                if (parts.length == 2) {
                    jobs.add(new Job(parts[0], parts[1]));
                } else {
                    jobs.add(new Job(parts[0], "Unknown Location"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jobs;
    }
}
