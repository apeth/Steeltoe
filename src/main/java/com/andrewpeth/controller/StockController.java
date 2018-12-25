package com.andrewpeth.controller;

import com.andrewpeth.model.Stock;
import com.andrewpeth.utility.StockUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StockController {

    @Autowired
    private StockUtils stockUtils;

    @RequestMapping("/v1/stock/{ticker}")
    ResponseEntity<Stock> getStock(@PathVariable("ticker") String ticker) {
        Stock requestedStock = stockUtils.getSingleStock(ticker);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<Stock>(requestedStock, httpHeaders, HttpStatus.OK);
    }
}
