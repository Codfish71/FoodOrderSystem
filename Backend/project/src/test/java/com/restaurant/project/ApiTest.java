package com.restaurant.project;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restaurant.project.admin.controller.AdminController;
import com.restaurant.project.admin.repository.AdminRepository;
import com.restaurant.project.admin.service.AdminService;
import com.restaurant.project.admin.service.AdminServiceImpl;
import com.restaurant.project.customer.controller.CustomerController;
import com.restaurant.project.customer.repository.CustomerRepository;
import com.restaurant.project.customer.service.CustomerService;
import com.restaurant.project.customer.service.CustomerServiceImpl;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({AdminController.class,CustomerController.class})
class ApiTest {
	@Autowired
    private MockMvc mvc;

   
	
	
    @MockBean
    AdminRepository adminRepository;
    
    @MockBean
    CustomerRepository customerRepository; 
    
    

    
    @MockBean
    AdminController adminController;
    
    @MockBean 
    AdminService adminService;
    
    @MockBean 
    AdminServiceImpl adminServiceImpl;
    
    @MockBean
    CustomerController customerController;
    
    @MockBean 
    CustomerService customerService;
    
    @MockBean 
    CustomerServiceImpl customerServiceImpl;
    
	@Test
    public void getMenusApi() throws Exception{
		 	
        mvc.perform(MockMvcRequestBuilders
                .get("admin/menus")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
	
	
	
	 public static String asJsonString(final Object obj) {
	        try {
	            final ObjectMapper mapper = new ObjectMapper();
	            final String jsonContent = mapper.writeValueAsString(obj);
	            return jsonContent;
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

}
