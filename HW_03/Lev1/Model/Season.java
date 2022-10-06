package java_35e_HW.HW_03.Lev1.Model;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public void getDescription() {
            System.out.println("Теплое время года");
        }
    },
    AUTUMN(5);

    private final double averageTemp;
    Season(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getTemp (){
        return averageTemp;
    }

    public void iLike(Season season) {
        switch (season) {
            case AUTUMN -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }
}
