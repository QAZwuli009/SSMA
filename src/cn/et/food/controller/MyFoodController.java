package cn.et.food.controller;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.MyFoodService;

@Controller
public class MyFoodController {
	
	@Autowired
	MyFoodService my;
	
	/**
	 * 直接返回对象springMVC自动转换成json
	 * @param foodname
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="/queryFoodList",method=RequestMethod.GET)
	public List<Map<String, Object>> queryFoodList(String foodname) throws Exception{
		List<Map<String, Object>> queryAllFood = my.queryAllFood(foodname);
		return queryAllFood;
	}
	
	/**
	 * 删除food
	 * @param foodId 菜品id
	 * @param os
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/food/{foodId}",method=RequestMethod.DELETE)
	public String deleteFood(@PathVariable String foodId , OutputStream os) throws Exception{
		try {
			my.deleteFood(foodId);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	/**
	 * 修改food
	 * @param foodId 菜品id
	 * @param foodName 菜品名
	 * @param price菜品价格
	 * @param os
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/food/{foodId}",method=RequestMethod.PUT)
	public String updateFood(@PathVariable String foodId,String foodName,String price , OutputStream os) throws Exception{
		try {
			my.updateFood(foodId, foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	/**
	 * 添加food
	 * @param foodName 菜品名
	 * @param price	菜品价格
	 * @param os
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/food",method=RequestMethod.POST)
	public String saveFood(String foodName,String price , OutputStream os) throws Exception{
		try {
			my.saveFood(foodName, price);
			os.write("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
}
