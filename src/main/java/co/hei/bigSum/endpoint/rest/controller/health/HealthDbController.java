package co.hei.bigSum.endpoint.rest.controller.health;

import static co.hei.bigSum.endpoint.rest.controller.health.PingController.KO;
import static co.hei.bigSum.endpoint.rest.controller.health.PingController.OK;

import co.hei.bigSum.PojaGenerated;
import co.hei.bigSum.repository.DummyRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthDbController {

  DummyRepository dummyRepository;

  @GetMapping("/health/db")
  public ResponseEntity<String> dummyTable_should_not_be_empty() {
    return dummyRepository.findAll().isEmpty() ? KO : OK;
  }
}
