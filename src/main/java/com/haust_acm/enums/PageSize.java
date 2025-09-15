package com.haust_acm.enums;

public enum PageSize {
    SIZE15(15L), SIZE20(20L), SIZE25(30L), SIZE40(40L), SIZE50(50L);
    Long size;

    private PageSize(Long size) {
        this.size = size;
    }

    public Long getSize() {
        return size;
    }
}
