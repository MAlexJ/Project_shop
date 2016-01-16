package com.shop.controller;

import com.shop.constant.Constant;
import com.shop.service.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by malex on 12.01.16.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private Constant constant;

    @Autowired
    @Qualifier(value = "productCatalogServiceImpl")
    private ProductCatalogService service;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute(constant.PRODUCT_CATALOG,service.getAll());
        model.addAttribute(constant.CURRENT_PAGE,"home");
        return constant.PAGE;
    }
}
