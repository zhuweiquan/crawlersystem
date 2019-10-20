package aproject.acrawler.dao;

import aproject.acrawler.common.AprojectBaseDao;
import aproject.acrawler.model.dto.FoodMaterial;

import java.util.List;

public interface FoodMaterialMapper extends AprojectBaseDao<FoodMaterial>{

    List<FoodMaterial> queryFoodMaterialList();
}
