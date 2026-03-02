package computerobject;

public final class Computer {

    private final String cpu;
    private final String ram;

    private final String hdd;
    private final String graphics;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.graphics = builder.graphics;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getGraphics() {
        return graphics;
    }

    public static class Builder {

        private final String cpu;
        private final String ram;

        private String hdd;
        private String graphics;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder setGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
