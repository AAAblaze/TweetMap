package io.zmyzheng.restapi.service;

import io.zmyzheng.restapi.domain.Tweet;

import java.util.List;

/**
 * @Author: Mingyang Zheng
 * @Date: 2020-02-17 17:54
 */
public interface TweetService {
    List<Tweet> getTweets(long timeFrom, long timeTo);
}
