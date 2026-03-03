package LaptopOrder;

import StudentBuilder.Student;

public class LapOrder 
{
    private final String brand;
    private final int ram;
    
    private final  boolean ssd;
    private final boolean graphicsCard;
    private final boolean extendedWarranty;
    private final boolean msOfficeInstalled;

    public LapOrder(Builder builder)
    {
        this.brand =builder.brand;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphicsCard = builder.graphicsCard;
        this.extendedWarranty = builder.extendedWarranty;
        this.msOfficeInstalled = builder.msOfficeInstalled;
    }

    public int getRam() {
        return ram;
    }

    public boolean isSsd() {
        return ssd;
    }

    public boolean isGraphicsCard() {
        return graphicsCard;
    }

    public boolean isExtendedWarranty() {
        return extendedWarranty;
    }

    public boolean isMsOfficeInstalled() {
        return msOfficeInstalled;
    }

    public String getBrand() {
        return brand;
    }
    
    public static class Builder
    {
        private final String brand;
        private final int ram;
     
        private boolean ssd;
        private boolean graphicsCard;
        private boolean extendedWarranty;
        private boolean msOfficeInstalled;

        public Builder(String brand, int ram) {
            this.brand = brand;
            this.ram = ram;
        }

        public Builder setSsd(boolean ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setExtendedWarranty(boolean extendedWarranty) {
            this.extendedWarranty = extendedWarranty;
            return this;
        }

        public Builder setMsOfficeInstalled(boolean msOfficeInstalled) {
            this.msOfficeInstalled = msOfficeInstalled;
            return this;
        }
        
        public LapOrder build(){
            return new  LapOrder(this);
        }
    }
    
}
