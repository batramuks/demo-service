package com.batra.api;

import com.batra.model.Product;
import com.batra.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-25T17:14:59.355Z[GMT]")
@RestController
public class ProductApiController implements ProductApi {

    @Autowired
    public ProductService productService;

    public ResponseEntity<Void> productPost(@Parameter(in = ParameterIn.DEFAULT, description = "body to be saved", required=true, schema=@Schema()) @Valid @RequestBody Product product) {
        productService.createProduct(product);
    return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> productProductIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("productId") String productId) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> productProductIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("productId") String productId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Product body) {

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
