package main.java.com.backend.buyerEnd.model;
import java.util.*;

public class Cart {

	public Map<Goods,Integer> cart=new HashMap<>();
	
	public void addGoods(Goods goods,int num){
		if(cart.containsKey(goods))
			cart.put(goods, cart.get(goods)+num);
		else
			cart.put(goods, num);
	}
	
	public void removeGoods(Goods goods){
		if(cart.containsKey(goods))
			cart.remove(goods);
	}
	
	public void reduceGoods(Goods goods){
		if(cart.containsKey(goods))
			if(cart.get(goods)>0)
				cart.put(goods, cart.get(goods)-1);
	}
	
	public void increaseGoods(Goods goods){
		if(cart.containsKey(goods))
				cart.put(goods, cart.get(goods)+1);
	}
	
	public double getTotalCost(){
		double sum=0;
		for(Goods goods:cart.keySet()){
			sum+=cart.get(goods)*goods.getgoodsPrice();
		}
		return sum;
	}
	
	public double getCost(Goods goods){
		return cart.get(goods)*goods.getgoodsPrice();
	}
}
