package com.haust_acm.controller;

import com.haust_acm.entity.vo.ResponseVO;
import com.haust_acm.enums.ResponseCodeEnum;

public class ABaseController {
    protected static final String STATUS_SUCCESS = "success" ;
    protected static final String STATUS_ERROR = "error" ;

    protected <T> ResponseVO getSuccessResponseVO(T t,String message) {
        ResponseVO<T> responseVO = new ResponseVO();
        responseVO.setStatus(STATUS_SUCCESS);
        responseVO.setCode(ResponseCodeEnum.CODE_200.getCode());
        responseVO.setInfo(message == null ? ResponseCodeEnum.CODE_200.getMsg():message);
        responseVO.setData(t);
        return responseVO;
    }
}
