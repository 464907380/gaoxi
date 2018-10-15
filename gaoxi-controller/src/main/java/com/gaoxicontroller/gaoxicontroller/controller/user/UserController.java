package com.gaoxicontroller.gaoxicontroller.controller.user;

import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.LoginReq;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

public interface UserController {
    Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
