package com.zbin.springcloud.controller;

import com.zbin.springcloud.entities.CommonResult;
import com.zbin.springcloud.entities.Payment;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * com.zbin.springcloud.controller.OrderController
 *
 * @author Zbin
 * @date 2020/03/17
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
@SuppressWarnings("unchecked")
public class OrderController {

//  public static final String PAYMENT_URL = "http://localhost:8001";

  public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

  @Resource
  private RestTemplate restTemplate;

  @Resource
  private DiscoveryClient discoveryClient;

  @GetMapping("/create")
  public CommonResult<Payment> create(Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
  }

  @GetMapping("/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
  }

//  @GetMapping(value = "/consumer/payment/lb")
//  public String getPaymentLB() {
//    List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
//
//    if (instances == null || instances.size() <= 0) {
//      return null;
//    }
//
//    ServiceInstance serviceInstance = loadBalancer.instances(instances);
//    URI uri = serviceInstance.getUri();
//
//    return restTemplate.getForObject(uri + "/payment/lb", String.class);
//
//  }
}
