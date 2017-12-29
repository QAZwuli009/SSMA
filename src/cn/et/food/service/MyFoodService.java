package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#queryAllFood(java.lang.String)
	 */
	public abstract List<Map<String, Object>> queryAllFood(String foodname);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#deleteFood(java.lang.String)
	 */
	public abstract void deleteFood(String foodId);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodName, String price);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

}