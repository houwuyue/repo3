package com.bunfly.bean;

import java.util.List;

public class Page {
    private Long tatil;
    private List<?> rows;

    public Long getTatil() {
        return tatil;
    }

    public void setTatil(Long tatil) {
        this.tatil = tatil;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
