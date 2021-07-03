package projekt.jazs21488nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import projekt.jazs21488nbp.exception.ErrorHandler;
import projekt.jazs21488nbp.exception.GatewayTimeoutException;
import projekt.jazs21488nbp.model.Rate;
import projekt.jazs21488nbp.model.Root;

import java.util.Date;
import java.util.List;

@Service
public class WalutyService {

//    private final WalutyRepository walutyRepository;

//    public List<Root> findAll(){
//        return walutyRepository.findAll();
//
//    }
    private final RestTemplate restTemplate;
    private final String url ="http://api.nbp.pl/api/exchangerates/rates/a/";


    public WalutyService(  RestTemplate restTemplate) {
//        this.walutyRepository = walutyRepository;
        this.restTemplate = restTemplate;
    }

    public double srednia(String start,String stop, String kod){
        try {
            restTemplate.setErrorHandler(new ErrorHandler());
            Root root = restTemplate.getForObject(url + kod + "/" + start + "/" + stop, Root.class);


            return calculation(root.getRates());
        } catch (ResourceAccessException ex) {
            throw new GatewayTimeoutException();
        }

    }
    public double calculation(List<Rate> rateList){

        double sum=0.0;
        for(Rate rate :rateList){

            double aDouble = rate.getMid();


            sum+= aDouble;
        }
        return sum/rateList.size();
    }


}