package com.renault.monkey;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotDealsRestController {

    @GetMapping("/test")
    public List<String> test() {
        return Arrays.asList("product1", "product2", "product3");
    }

}
