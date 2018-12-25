package com.andrewpeth.utility;

import com.andrewpeth.model.Stock;
import org.springframework.stereotype.Service;

@Service
public class StockUtils {
    public Stock getSingleStock(String ticker) {
        /*TODO: Connect to a database and return valid entries.*/

        return new Stock("MSFT", 100.00, 100.00, 100.00, 100000);
    }
}
