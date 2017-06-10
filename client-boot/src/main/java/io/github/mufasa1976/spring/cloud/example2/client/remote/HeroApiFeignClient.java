package io.github.mufasa1976.spring.cloud.example2.client.remote;

import io.github.mufasa1976.spring.cloud.example2.common.HeroApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "hero-service", path = "${hero-service.ribbon.context-path:/}", fallback = HeroApiFeignClientFallback.class, decode404 = true)
public interface HeroApiFeignClient extends HeroApi {
}
