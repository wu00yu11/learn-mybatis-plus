package com.learn.mp.service;

import com.learn.mp.exception.CoralException;

/**
 * @author jingjing.zhang
 */
public interface DownloadService {
    default void add() throws CoralException {
        throw new CoralException("error!");
    }
}
