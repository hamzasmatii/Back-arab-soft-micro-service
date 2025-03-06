package tn.esprit.artifact.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.artifact.dto.ServiceEqDTO;

import java.util.List;

@FeignClient(name = "serviceEq")

public interface IServiceEquipeUser {

    @GetMapping("/api/serviceEq")
    List<ServiceEqDTO> getAllServiceEqs();

    @GetMapping("/api/serviceEq/{serviceEqId}")
    ServiceEqDTO getServiceEqById(@PathVariable("serviceEqId") Long id);

}
