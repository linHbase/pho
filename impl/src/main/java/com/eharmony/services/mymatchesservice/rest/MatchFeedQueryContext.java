package com.eharmony.services.mymatchesservice.rest;

import java.util.Map;
import java.util.Set;

import com.eharmony.services.mymatchesservice.rest.internal.DataServiceStateEnum;

public interface MatchFeedQueryContext {

    public long getUserId();
    public String getLocale();
    public int getStartPage();
    public int getPageSize();
    public Set<String> getStatuses();
    public boolean isViewHidden();
    public boolean isAllowedSeePhotos();
    public int getTeaserResultSize();

    // Internal test flags.
    public DataServiceStateEnum getVoldyState();
    //platform and api request correlation info
    public Map<String, String> getRequestMetadata();
    
    public String getSortBy();
}
