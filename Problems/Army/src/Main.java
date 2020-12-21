class Army {

    public static void createArmy() {
        // Create all objects here
        Unit unit = new Unit("Bob1");
        Unit unit1 = new Unit("Bob2");
        Unit unit2 = new Unit("Bob3");
        Unit unit3 = new Unit("Bob4");
        Unit unit4 = new Unit("Bob5");
        Knight knight = new Knight("Bill");
        Knight knight1 = new Knight("Bill1");
        Knight knight2 = new Knight("Bill2");
        General general = new General("Jonn");
        Doctor doctor = new Doctor("Dip");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}