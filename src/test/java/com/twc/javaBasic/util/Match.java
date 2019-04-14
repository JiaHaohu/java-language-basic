package com.twc.javaBasic.util;

public class Match {
    private final String matchedString;
    private final int startIndex;
    private final int endIndex;

    public Match(String matchedString, int startIndex, int endIndex) {
        this.matchedString = matchedString;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public String getMatchedString() {
        return matchedString;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        // The end index is exclusive.
        return endIndex;
    }
}
