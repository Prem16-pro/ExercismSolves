import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        int z = 1000 + random.nextInt(9000);
        return "NCC-"+z;
    }

    double randomStardate() {
        double a = 41000.0 + 1000.0 * random.nextDouble();
        return a;
    }
}
