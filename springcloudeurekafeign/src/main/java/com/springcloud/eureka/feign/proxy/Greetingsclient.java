package com.springcloud.eureka.feign.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "springcloudeurekaclient")
public interface Greetingsclient {

	/**
	 * Interface method to get the greetings information from a different microservice.
	 * @param langCode
	 * @return
	 */
	@GetMapping(value= "/welcome/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode);
}