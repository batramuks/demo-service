package com.batra.api;

import com.batra.model.ProductListResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-25T17:14:59.355Z[GMT]")
@RestController
public class ProductsApiController implements ProductsApi {

    public ResponseEntity<ProductListResponse> productsGet() {


        return new ResponseEntity<ProductListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
