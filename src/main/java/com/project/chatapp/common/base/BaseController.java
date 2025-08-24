package com.project.chatapp.common.base;

import org.springframework.stereotype.Controller;

@Controller
public interface BaseController<Service> {

    public Service getService();

}
