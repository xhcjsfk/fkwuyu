package com.wlkg.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author 飞鸟
 * @create 2019-12-27 9:35
 */
@ConfigurationProperties(prefix = "wlkg.filter")
@Data
public class FilterProperties {
    private List<String> allowPaths;
}
