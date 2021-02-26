package com.stockportfolio;

public class Stock {
        private String stockId;
        private final String name;
        private final int quantity;

        public Stock(String stockId, String name, int quantity){
            this.stockId = stockId;
            this.name = name;
            this.quantity = quantity;
        }

        public String getStockId() {
            return stockId;
        }

        public void setStockId(String stockId) {
            this.stockId = stockId;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getTicker() {
            return name;
        }
    }

