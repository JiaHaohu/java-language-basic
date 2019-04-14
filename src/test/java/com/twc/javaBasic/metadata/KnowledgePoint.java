package com.twc.javaBasic.metadata;

public enum KnowledgePoint {
    /**
     * The test can be finished using the desired knowledge point.
     */
    SINGLE_KNOWLEDGE_POINT,

    /**
     * The test can be finished using 1 or 2 knowledge points from current category.
     * For example. The test can be finished by resize array and get item at specified
     * index of the array.
     */
    TWO_KNOWLEDGE_POINTS,

    /**
     * The test can be finished using multiple knowledge points from current category.
     */
    MULTIPLE_KNOWLEDGE_POINTS,

    /**
     * The test can be finished using multiple knowledge points form different categories.
     */
    MULTIPLE_CROSS_CATEGORY
}
