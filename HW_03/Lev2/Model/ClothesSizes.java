package java_35e_HW.HW_03.Lev2.Model;

public enum ClothesSizes {
    XXS (32) {
        @Override
        public void getDescription() {
            System.out.println("Детский размер");
        }
    },
    XS (34),
    S (36),
    M (38),
    L (40);

    private int euroSize;

    ClothesSizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription() {
        System.out.println("Взрослый размер");
    }

    public int getEuroSize() {
        return euroSize;
    }
}
