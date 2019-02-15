package ru.tsc.srb.leftjoin;

import java.util.ArrayList;
import java.util.List;

public class Row implements Comparable<Row> {

    private int id;
    private List<String> valuesList;

    public Row(int id, List<String> valuesList) {
        this.id = id;
        this.valuesList = valuesList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<String> valuesList) {
        this.valuesList = valuesList;
    }

    @Override
    public int compareTo(Row o) {
        return this.getId() - o.getId();
    }
}
