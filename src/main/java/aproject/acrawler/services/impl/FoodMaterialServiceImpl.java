package aproject.acrawler.services.impl;

import aproject.acrawler.dao.FoodMaterialMapper;
import aproject.acrawler.model.dto.FoodMaterial;
import aproject.acrawler.services.FoodMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FoodMaterialServiceImpl implements FoodMaterialService {

    @Autowired
    private FoodMaterialMapper foodMaterialMapper;

    @Override
    public List<FoodMaterial> getFoodMaterialList() {
        return foodMaterialMapper.queryFoodMaterialList();
    }


}
