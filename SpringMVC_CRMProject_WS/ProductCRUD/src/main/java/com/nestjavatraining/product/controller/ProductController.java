package com.nestjavatraining.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nestjavatraining.product.entity.Product;
import com.nestjavatraining.product.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/displayAddProduct")
	public String addProduct(Model model) {

		Product product = new Product();

		model.addAttribute(product);

		return "displayAddProduct";

	}

	@PostMapping("/addProduct")
	public String saveProduct(@ModelAttribute("addProduct") Product product) {

		productService.addProduct(product);
		return "redirect:/product/viewProducts";

	}

	@GetMapping("/viewProducts")
	public String viewProducts(Model model) {

		List productList = productService.getProducts();

		model.addAttribute("productList", productList);

		return "viewProducts";

	}

	@GetMapping("/diplayUpdateProduct")
	public String diplayUpdate(@RequestParam("productId") int productId, Model theModel) {
		System.out.println(productId);
		Product updateProduct = productService.updateProduct(productId);

		theModel.addAttribute("diplayUpdateProduct", updateProduct);
		return "diplayUpdateProduct";
	}

	@GetMapping("/deleteProduct")
	public String deleteCustomer(@RequestParam("productId") int productId) {

		productService.deleteProduct(productId);

		return "redirect:/product/viewProducts";
	}

}
