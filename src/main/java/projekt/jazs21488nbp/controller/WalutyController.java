package projekt.jazs21488nbp.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.jazs21488nbp.service.WalutyService;

import java.util.Date;

@RestController
@RequestMapping("")
public class WalutyController {

    private final WalutyService walutyService;

    public WalutyController(WalutyService walutyService) {
        this.walutyService = walutyService;
    }

    @ApiResponses(value={
            @ApiResponse(code=200, message = "OK"),
            @ApiResponse(code=404,message = "404Błądzik"),
            @ApiResponse(code=500, message = "heheheee")
    })
    @GetMapping("{waluta}")
    public ResponseEntity<Double> getCurrencies( @RequestParam String start, @RequestParam String stop,@PathVariable String waluta){

        double gimme=walutyService.srednia(start,stop,waluta);

        return ResponseEntity.ok(gimme);
    }



}