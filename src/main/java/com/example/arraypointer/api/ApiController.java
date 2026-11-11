package com.example.arraypointer.api;

import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  private static final UUID LOCATION_ID = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6");

  @GetMapping("/some")
  public List<String> users() {
    return List.of("alice", "bob");
  }

  @GetMapping("/locations")
  public List<LocationDto> locations() {
    return List.of(new LocationDto("Main office", LOCATION_ID));
  }

  @GetMapping("/configurations")
  public List<ConfigurationDto> configurations() {
    return List.of(new ConfigurationDto(LOCATION_ID, "default"));
  }

  @PostMapping("/configurations")
  public ConfigurationDto createConfiguration(@RequestBody ConfigurationDto configuration) {
    return configuration;
  }
}
