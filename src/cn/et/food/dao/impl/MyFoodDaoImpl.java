package cn.et.food.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.mapper.FoodMapper;

@Repository
public class MyFoodDaoImpl implements MyFoodDao {
	@Autowired
	FoodMapper map;
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#queryAllFood(java.lang.String)
	 */
	@Override
	public List<Map<String, Object>> queryAllFood(String foodname){
		return map.queryAllFood(foodname);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#deleteFood(java.lang.String)
	 */
	@Override
	public void deleteFood(String foodId){
		map.deleteFood(foodId);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	@Override
	public void saveFood(String foodName,String price){
		map.saveFood(foodName, price);	
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void updateFood(String foodId,String foodName,String price){
		map.updateFood(foodId, foodName, price);	
	}
	
}
