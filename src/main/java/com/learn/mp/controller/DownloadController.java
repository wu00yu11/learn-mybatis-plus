package com.learn.mp.controller;

import com.learn.mp.exception.CoralException;
import com.learn.mp.service.DownloadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jingjing.zhang
 */
@RestController
@RequestMapping("/download")
public class DownloadController {
    private static Logger logger = LoggerFactory.getLogger(DownloadController.class);
    @Resource
    private DownloadService downloadService;

    @PostMapping(value = "/add")
    public String addDownloadLog(){
        try {
            downloadService.add();
        } catch (CoralException e) {
            logger.error("add exception!",e);
        }
        return "true";
    }
}
