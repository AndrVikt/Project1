package com.solvd.mycourse.generics;

import com.solvd.mycourse.builders.Builders;

import java.util.ArrayList;
import java.util.List;

public class DocumentsOfBuilders <T extends Builders> {
    private T inform;
    private List<T> buildinfo = new ArrayList<>();


    public T getInform() {
        return inform;
    }

    public void setInform(T inform) {
        this.inform = inform;
    }

    public List<T> getBuildinfo() {
        return buildinfo;
    }

    public void setBuildinfo(List<T> buildinfo) {
        this.buildinfo = buildinfo;
    }
}
