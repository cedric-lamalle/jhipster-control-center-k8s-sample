package tech.jhipster.sampleapp.web.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sample")
public class SampleAppResource {

    @GetMapping("/hello")
    @ApiOperation(value = "Sample Hello Resource", notes = "This is only a sample operation that returns hello")
    public String hello() {
        return "Hello";
    }
}
