package com.gaoxiuser.gaoxiuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.LoginReq;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.UserEntity;
import com.gaoxicommonservicefacade.gaoxicommonservicefacade.user.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity login(LoginReq loginReq) {
        // 具体的实现代码
        return null;
    }
}
