public class Cube {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(edge, 2); 
    }

    public double getVolume() {
        return Math.pow(edge, 3); 
    }

    public double getMainDiagonal() {
        return edge * Math.sqrt(3);
    }
    
    @Override
    public String toString() {
        return String.format("Куб з ребром %.2f: площа поверхнi = %.2f, об'єм = %.2f, велика дiагональ = %.2f",
                edge, getSurfaceArea(), getVolume(), getMainDiagonal());
    }

    public static void main(String[] args) {
        Cube cube = new Cube(5.0); 
        
        System.out.println(cube.toString());
    }
}

