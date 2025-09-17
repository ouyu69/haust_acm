package com.haust_acm.entity.query;

import com.haust_acm.enums.PageSize;

public class SimplePage {
    private Long pageNo;
    private Long countTotal;
    private Long pageSize;
    private Long pageTotal;
    private Long start;
    private Long end;

    public SimplePage() {
    }

    public SimplePage(Long pageNo, Long countTotal, Long pageSize) {
        if (pageNo == null) pageNo = 0L;
        this.pageNo = pageNo;
        this.countTotal = countTotal;
        this.pageSize = pageSize;
        action();
    }

    public SimplePage(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    public void action() {
        if (this.pageSize <= 0) {
            this.pageSize = PageSize.SIZE20.getSize();
        }
        if (countTotal > 0) {
            this.pageTotal = (this.countTotal + this.pageSize - 1) / this.pageSize;
        } else {
            pageTotal = 1L;
        }
        if (pageNo <= 1) {
            pageNo = 1L;
        }
        if (pageNo > pageTotal) {
            pageNo = pageTotal;
        }
        this.start = (pageNo - 1) * pageSize;
        this.end = this.pageSize;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getCountTotal() {
        return countTotal;
    }

    public void setCountTotal(Long countTotal) {
        this.countTotal = countTotal;
        this.action();
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }
}
