package com.mary.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome!</h1>");
    }

    @GetMapping("/user")
    public String userHome(){
        return ("<h1>Welcome User!</h1>");
    }

    @GetMapping("/admin")
    public String adminHome(){
        return ("<h1>Welcome Admin!</h1>");
    }


//
//    @GetMapping("/search")
//    public ResponseEntity<Page<ProductDTO>> searchProducts(ProductPage productPage, @Param("keyword") String keyword) {
//        Page<Product> products = productService.searchAllProducts(productPage, keyword);
//        List<ProductDTO> productDTOList = getProductDTOList(products);
//        Page<ProductDTO> productDTOPage = new PageImpl<>(productDTOList);
//
//        return new ResponseEntity<>(productDTOPage, HttpStatus.OK);
//    }
//
//    Page<Product> searchAllProducts(ProductPage productPage, String keyword);
//
//    @Override
//    @Cacheable(cacheNames = "products", sync = true)
//    public Page<Product> searchAllProducts(ProductPage productPage, String keyword) {
//        Pageable pageable = MethodUtils.getPageable(productPage);
//        if (keyword != null) {
//            return productRepository.search(keyword, pageable);
//        }
//        return productRepository.findAll(pageable);
//    }
//
//    @Query("SELECT searchProduct FROM Product searchProduct WHERE CONCAT(searchProduct.name, ' ',searchProduct.category) LIKE %?1%")
//    Page<Product> search (String keyword, Pageable pageable);


}
