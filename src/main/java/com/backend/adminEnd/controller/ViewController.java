package com.backend.adminEnd.controller;

/**
 * Created by kevin on 2017/3/29.
 */

import com.backend.adminEnd.model.*;
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

    @Autowired(required = true)
    @Qualifier(value = "userService")
    public void setUserService(UserService us) {
        this.userService = us;
    }

    @Autowired(required = true)
    @Qualifier(value = "compositionService")
    public void setCompositionService(CompositionService cs) {
        this.compositionService = cs;
    }

    @Autowired(required = true)
    @Qualifier(value = "goodsService")
    public void setGoodsService(GoodsService gs) {
        this.goodsService = gs;
    }

    @Autowired(required = true)
    @Qualifier(value = "orderService")
    public void setOrderService(OrderService os) {
        this.orderService = os;
    }

    @Autowired(required = true)
    @Qualifier(value = "sellerService")
    public void setSellerService(SellerService ss) {
        this.sellerService = ss;
    }

    @RequestMapping("/")
    public String adminIndex() {
        return "index";
    }

    @RequestMapping(value = "/UserControl", method = RequestMethod.GET)
    public String adminUserControl(Model model) {
        model.addAttribute("user", new UserEntity());
        model.addAttribute("listUsers", this.userService.listUser());
        return "user";
    }

    @RequestMapping(value = "/UserControl/AddUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserEntity user) {
        if (Integer.parseInt(user.getUserId()) == 0) {
            this.userService.addUser(user);
        } else {
            this.userService.updateUser(user);
        }
        return "redirect:/admin/UserControl";
    }

    @RequestMapping("/UserControl/RemoveUser/{id}")
    public String removeUser(@PathVariable("id") String id) {
        this.userService.removeUser(id);
        return "redirect:/admin/UserControl";
    }

    @RequestMapping("/UserControl/EditUser/{id}")
    public String editUser(@PathVariable("id") String id, Model model) {
        model.addAttribute("user", this.userService.getUserById(id));
        model.addAttribute("listUsers", this.userService.listUser());
        return "redirect:/admin/UserControl";
    }

    @RequestMapping(value = "/GoodsControl", method = RequestMethod.GET)
    public String adminGoodsControl(Model model) {
        model.addAttribute("goods", new GoodsEntity());
        model.addAttribute("listGoods", this.goodsService.listGoods());
        return "goods";
    }

    @RequestMapping("/GoodsControl/RemoveGoods/{id}")
    public String removeGoods(@PathVariable("id") String id) {
        this.goodsService.removeGoods(id);
        return "redirect:/admin/GoodsControl";
    }

    @RequestMapping(value = "/GoodsControl/FindGoods/{id}", method = RequestMethod.GET)
    public String findGoods(@PathVariable("id") String id, Model model) {
        model.addAttribute("goods", this.goodsService.getGoodsByGoodsId(id));
        model.addAttribute("listGoods", this.goodsService.listGoods());
        return "redirect:/admin/GoodsControl";
    }

    @RequestMapping(value = "/GoodsControl/FindGoods/{id}", method = RequestMethod.POST)
    public String findGoodsByID(@PathVariable("id") String id, Model model) {
        model.addAttribute("goods", this.goodsService.getGoodsByGoodsId(id));
        model.addAttribute("listGoods", this.goodsService.listGoods());
        return "redirect:/admin/GoodsControl";
    }

    @RequestMapping(value = "/OrderControl", method = RequestMethod.GET)
    public String adminOrderControl(Model model) {
        model.addAttribute("order", new OrderEntity());
        model.addAttribute("listOrder", this.orderService.listOrder());
        return "order";
    }

    @RequestMapping("/OrderControl/RemoveOrder/{id}")
    public String removeOrder(@PathVariable("id") String id) {
        this.orderService.removeOrder(id);
        return "redirect:/admin/OrderControl";
    }

    @RequestMapping(value = "/OrderControl/FindOrder/{id}", method = RequestMethod.GET)
    public String findOrder(@PathVariable("id") String id, Model model) {
        model.addAttribute("order", this.orderService.getOrderById(id));
        model.addAttribute("listOrder", this.orderService.listOrder());
        return "redirect:/admin/OrderControl";
    }

    @RequestMapping(value = "/OrderControl/FindOrder/{id}", method = RequestMethod.POST)
    public String findOrderById(@PathVariable("id") String id, Model model) {
        model.addAttribute("order", this.orderService.getOrderById(id));
        model.addAttribute("listOrder", this.orderService.listOrder());
        return "redirect:/admin/OrderControl";
    }

    @RequestMapping(value = "/SellerControl", method = RequestMethod.GET)
    public String adminSellerControl(Model model) {
        model.addAttribute("seller", new SellerEntity());
        model.addAttribute("listSellers", this.sellerService.listSeller());
        return "seller";
    }

    @RequestMapping(value = "/SellerControl/AddSeller", method = RequestMethod.POST)
    public String addSeller(@ModelAttribute("seller") SellerEntity seller) {
        if (Integer.parseInt(seller.getSellerId()) == 0) {
            this.sellerService.addSeller(seller);
        } else {
            this.sellerService.updateSeller(seller);
        }
        return "redirect:/admin/SellerControl";
    }

    @RequestMapping("/SellerControl/RemoveSeller/{id}")
    public String removeSeller(@PathVariable("id") String id) {
        this.sellerService.removeSeller(id);
        return "redirect:/admin/SellerControl";
    }

    @RequestMapping("/SellerControl/EditSeller/{id}")
    public String editSeller(@PathVariable("id") String id, Model model) {
        model.addAttribute("seller", this.sellerService.getSellerById(id));
        model.addAttribute("listSellers", this.sellerService.listSeller());
        return "redirect:/admin/SellerControl";
    }

    @RequestMapping(value = "/CompositionControl", method = RequestMethod.GET)
    public String adminCompositionControl(Model model) {
        model.addAttribute("composition", new CompositionEntity());
        model.addAttribute("listComposition", this.compositionService.listComposition());
        return "composition";
    }

    @RequestMapping("/CompositionControl/RemoveComposition/{id}")
    public String removeComposition(@PathVariable("id") String id) {
        this.compositionService.removeComposition(id);
        return "redirect:/admin/CompositionControl";
    }

    @RequestMapping(value = "/CompositionControl/FindSingleComposition/{id}", method = RequestMethod.GET)
    public String findComposition(@PathVariable("id") String id, Model model) {
        model.addAttribute("composition", this.compositionService.getCompositionByOrderGoodsId(id));
        model.addAttribute("listComposition", this.compositionService.listComposition());
        return "redirect:/admin/CompositionControl";
    }

    @RequestMapping(value = "/CompositionControl/FindSingleComposition/{id}", method = RequestMethod.POST)
    public String findCompositionById(@PathVariable("id") String id, Model model) {
        model.addAttribute("composition", this.compositionService.getCompositionByOrderGoodsId(id));
        model.addAttribute("listComposition", this.compositionService.listComposition());
        return "redirect:/admin/CompositionControl";
    }

    @RequestMapping(value = "/CompositionControl/FindCompositionBySellerID/{id}", method = RequestMethod.POST)
    public String findCompositionBySellerID(@PathVariable("id") String id, Model model) {
        model.addAttribute("composition", new CompositionEntity());
        model.addAttribute("listComposition", this.compositionService.getCompositionBySellerId(id));
        return "redirect:/admin/CompositionControl";
    }
}
