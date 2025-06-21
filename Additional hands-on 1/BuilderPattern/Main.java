public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
            .setCpu("Intel i3")
            .setRam("8GB")
            .setStorage("256GB SSD")
            .build();

        Computer gamingComputer = new Computer.Builder()
            .setCpu("Intel i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4080")
            .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
