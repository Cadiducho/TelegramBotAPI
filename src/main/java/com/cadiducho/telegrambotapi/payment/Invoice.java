/*
 * The MIT License
 *
 * Copyright 2018 Cadiducho.
 * Read more in https://github.com/Cadiducho/Telegram-Bot-API/blob/master/LICENSE
 */

package com.cadiducho.telegrambotapi.payment;

import com.squareup.moshi.Json;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This object contains basic information about an invoice.
 */
@ToString
@Getter @Setter
public class Invoice {
    
    /**
     * Product name
     */
    private String title;
    
    /**
     * Product description
     */
    private String description;
    
    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice
     */
    @Json(name = "start_parameter") private String startParameter;
    
    /**
     * Three-letter ISO 4217 currency code
     */
    private String currency;
    
    /**
     * Total price in the smallest units of the currency (integer, not float/double). 
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in https://core.telegram.org/bots/payments/currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    @Json(name = "total_amount") private Integer totalAmount;

}
