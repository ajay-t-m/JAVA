public class CPU {
private double price;
private Processor processor;
private RAM ram;
public CPU(double price, Processor processor, RAM ram) {
this.price = price;
this.processor = processor;
this.ram = ram;
}
public double getPrice() {
return price;
}
public Processor getProcessor() {
return processor;
}
public RAM getRam() {
return ram;
}
public static class Processor {
private int numberOfCores;
private String manufacturer;
public Processor(int numberOfCores, String manufacturer) {
this.numberOfCores = numberOfCores;
this.manufacturer = manufacturer;
}
public int getNumberOfCores() {
return numberOfCores;
}
public String getManufacturer() {
return manufacturer;
}
}
public static class RAM {
private int memory;
private String manufacturer;

public RAM(int memory, String manufacturer) {
this.memory = memory;
this.manufacturer = manufacturer;
}
public int getMemory() {
return memory;
}
public String getManufacturer() {
return manufacturer;
}
}
public static void main(String[] args) {
System.out.println("Name:Ajay T M\nRollno:23mca007\nTitle:CPU\nDate:14-02-2024\n");
Processor processor = new Processor(16, "Rayzen");
RAM ram = new RAM(16, "Sandisk");
CPU cpu = new CPU(80000.0, processor, ram);
System.out.println("CPU Price: " + cpu.getPrice());
System.out.println("Processor: " + cpu.getProcessor().getManufacturer() + " " +cpu.getProcessor().getNumberOfCores() + " cores");
System.out.println("RAM: " + cpu.getRam().getManufacturer() + " " + cpu.getRam().getMemory() + "GB");
}
}


