package com.yubin.service;

import com.yubin.controller.ResponseVO;
import com.yubin.model.User;

/**
 * Created by percent on 16/3/29.
 */
public interface UserService extends BaseService<User>{

    public ResponseVO<Object> smsToPhone(User user);
}
