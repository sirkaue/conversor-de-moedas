package com.sirkaue.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyConverterDto {

    @JsonProperty("base_code")
    private String baseCode;

    @JsonProperty("target_code")
    private String targetCode;

    @JsonProperty("conversion_rate")
    private double conversionRate;

    @JsonProperty("conversion_result")
    private double conversionResult;


    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }


    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }

    @Override
    public String toString() {
        return "CurrencyConverterDto{" +
                "baseCode='" + baseCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", conversionRate=" + conversionRate + '\'' +
                ", conversionResult=" + conversionResult +
                '}';
    }
}
