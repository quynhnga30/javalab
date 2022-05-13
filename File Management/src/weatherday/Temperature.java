package jdbcapp.weatherday;

public class Temperature {
    private float value;
    private String unit;
    private int unitType;

    public Temperature(float value, String unit, int unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }
}
