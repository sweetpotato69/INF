public class Sphere extends Forme3D {

    double rayon;

    @Override
    double calculVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
