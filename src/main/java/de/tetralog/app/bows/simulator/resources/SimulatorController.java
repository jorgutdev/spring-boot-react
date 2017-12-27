package de.tetralog.app.bows.simulator.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulatorController {

    @GetMapping(path = "/simulator")
    public ResponseEntity<Map<String, String>> simulator() {
        Map<String, String> map = new HashMap<>();
        map.put("simulator", "ok");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    
    @GetMapping(path = "/")
    public ResponseEntity<Map<String, String>> index() {
        Map<String, String> map = new HashMap<>();
        map.put("index", "ok");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    
    // Another mappings for @POST 
    // ...
}
