package com.learn.mp.service;

import com.learn.mp.exception.CoralException;
import com.learn.mp.mapper.DownloadCenterMapper;
import com.learn.mp.model.DownloadCenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author jingjing.zhang
 */
@Service
public class DownloadServiceImpl implements DownloadService {
    private static Logger logger = LoggerFactory.getLogger(DownloadServiceImpl.class);

    @Resource
    private DownloadCenterMapper downloadCenterMapper;

    @Override
    public void add() throws CoralException {
        logger.info("add ---start");
        DownloadCenter downloadCenter = new DownloadCenter();
        downloadCenter.setCreaterId(1L);
        downloadCenter.setCreateTime(new Date());
        downloadCenter.setUpdateTime(new Date());
        downloadCenterMapper.insert(downloadCenter);
        logger.info("add ---end");
    }
}
