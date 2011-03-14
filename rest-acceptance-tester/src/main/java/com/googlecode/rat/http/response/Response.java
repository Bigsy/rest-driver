package com.googlecode.rat.http.response;

import java.util.List;

import com.googlecode.rat.http.Header;

/**
 * Encapsulates a response from an HTTP server
 */
public interface Response {

    /**
     * Get the HTTP status code of the response
     */
    int getStatusCode();

    /**
     * Get the response body of the response as a String
     */
    String getContent();

    /**
     * Get a list of the HTTP headers which came with the response
     */
    List<Header> getHeaders();

    /**
     * How long did the response take?
     * 
     * @return Round-trip response time in milliseconds
     */
    long getResponseTime();

}