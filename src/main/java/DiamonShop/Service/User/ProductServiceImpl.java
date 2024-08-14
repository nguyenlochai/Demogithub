package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductsDao productDao = new ProductsDao();
	
	@Override
	public ProductsDto GetProductsByID(long id) {
		List<ProductsDto> listProducts = productDao.GetProductByID(id);
		return listProducts.get(0);
	}

	@Override
	public List<ProductsDto> GetProductsByIDCategory(int id) {
		return productDao.GetAllProductsByID(id);
	}
	
}
