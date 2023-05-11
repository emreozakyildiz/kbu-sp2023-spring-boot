package com.recommender.recommendersystem.controller;

import com.recommender.recommendersystem.model.Market;
import com.recommender.recommendersystem.model.Product;
import com.recommender.recommendersystem.service.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/market")
public class MarketController {
    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    @PostMapping("/add")
    public ResponseEntity<Market> addMarket(@RequestBody() Market market){
        Market newMarket = marketService.addMarket(market);
        return new ResponseEntity<>(newMarket, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Market>> getAllMarkets(){
        List<Market> markets = marketService.getAllMarkets();
        return new ResponseEntity<>(markets,HttpStatus.OK);
    }
}
