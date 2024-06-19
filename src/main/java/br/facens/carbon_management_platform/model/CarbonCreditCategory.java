package br.facens.carbon_management_platform.model;

public enum CarbonCreditCategory {
    RENEWABLE_ENERGY(5.0),
    FOREST_CONSERVATION(4.0),
    ENERGY_EFFICIENCY(3.5),
    WASTE_MANAGEMENT(3.0),
    OTHER(2.5);

    private final double priceMultiplier;

    CarbonCreditCategory(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}