package com.backend.adminEnd.controller;

/**
 * Created by kevin on 2017/3/29.
 */

import com.backend.adminEnd.model.UserEntity;
import com.backend.adminEnd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    private UserService userService;
    private CompositionService compositionService;
    private GoodsService goodsService;
    private OrderService orderService;
    private SellerService sellerService;

    @Autowired(required=true)
    @Qualifier(value = "userService")
    public void setUserService(UserService us){
        this.userService = us;
    }

    @RequestMapping("/")
    public String adminIndex(){
        return "index";
    }

    @RequestMapping(value="/UserControl",method = RequestMethod.GET)
    public String adminUserControl(Model model){
        model.addAttribute("user",new UserEntity());
        model.addAttribute("listUsers",this.userService.listUser());
        return "user";
    }
    @RequestMapping(value="/UserControl/AddUser",method= RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserEntity user){
        if(Integer.parseInt(user.getUserId())==0){
            this.userService.addUser(user);
        }else{
            this.userService.updateUser(user);
        }
        return "redirect:/UserControl";
    }

    @RequestMapping("/UserControl/RemoveUser/{id}")
    public String removeUser(@PathVariable("id")String id){
        this.userService.removeUser(id);
        return "redirect:/UserControl";
    }

    @RequestMapping("UserControl/EditUser/{id}")
    public String editUser(@PathVariable("id")String id,Model model){
        model.addAttribute("user",this.userService.getUserById(id));
        model.addAttribute("listUsers",this.userService.listUser());
        return "redirect:/UserControl";
    }

    @RequestMapping("/GoodsControl")
    public String adminGoodsControl(){
        return "goods";
    }

    @RequestMapping("/OrderControl")
    public String adminOrderControl(){
        return "order";
    }

    @RequestMapping("/SellerControl")
    public String adminSellerControl(){
        return "seller";
    }

    @RequestMapping("/Composition")
    public String adminCompositionControl(){
        return "composition";
    }

}
