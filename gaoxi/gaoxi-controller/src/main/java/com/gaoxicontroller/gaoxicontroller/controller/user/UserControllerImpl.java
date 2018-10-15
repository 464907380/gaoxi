package com.gaoxicontroller.gaoxicontroller.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.LoginReq;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.UserEntity;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {

        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);

        return null;
    }
}
