package com.mytest;
 
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.HttpMediaTypeNotSupportedException;
 
@RestController
public class SignatureController {
 
  ///  @Autowired
  //  private CustomerService  customerService;
  
                                        //produces = MediaType.APPLICATION_JSON_VALUE) 
    @ResponseBody
    @RequestMapping(value="/signature")//, consumes = MediaType.APPLICATION_JSON_VALUE,
    public Sample getSignature() { // @RequestBody SignatureData sigData ) {
		System.out.println(" IN ");
//		System.out.println(" sigData :" + sigData.toString());
//		System.out.println(" nonce "+ sigData.getNonce());
//		System.out.println(" payload "+ sigData.getPayload());
       return new Sample("OK");
    }

    @ResponseBody
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
public String HttpMediaTypeNotSupportedException() {
	return "acc "+MediaType.APPLICATION_JSON_VALUE;
}
}

