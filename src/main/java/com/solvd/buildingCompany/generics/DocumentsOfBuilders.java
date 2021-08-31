package com.solvd.buildingCompany.generics;

import java.util.ArrayList;
import java.util.List;

public class DocumentsOfBuilders <T> {
    private T inform;
    private List<T> buildInfo = new ArrayList<>();

    public DocumentsOfBuilders(T inform, List<T> buildInfo) {
        this.inform = inform;
        this.buildInfo = buildInfo;
    }

    public DocumentsOfBuilders(T s) {
    }

    public List<T> getBuildInfo() {
        return buildInfo;
    }

    public void setBuildInfo(List<T> buildInfo) {
        this.buildInfo = buildInfo;
    }
}
