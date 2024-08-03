package com.example.RssParser.controller;

import com.example.RssParser.model.Job;
import com.example.RssParser.service.RssService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private RssService rssService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return rssService.fetchJobsFromRss();
    }
}

