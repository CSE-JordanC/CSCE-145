//Jordan Chavous

public class Apple {
    //This creates the instance variables
    private String type;
    private double weight;
    private double price;

    //This sets up the default constructor
    public Apple() {
        //This sets the default values
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    //This is the user input/parameter constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    //This is the getter and setter for the apple's type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        //This checks to see if the type is one of the allowed apple types
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") ||
            type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            System.out.println("Invalid apple type! Setting type to default 'Gala'.");
            //This is the default type if the input is invalid
            this.type = "Gala";
        }
    }

    //This is the getter and setter for the apple's weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        //This checks to see if weight is between 0 and 2 kg
        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight! Setting weight to default 0.5 kg.");
            //This is the default weight if the input is invalid
            this.weight = 0.5;
        }
    }

    //This is the getter and setter for the apple's price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //This checks to see that the price is not negative
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Setting price to default $0.88.");
            //This is the default price if the input is invalid
            this.price = 0.88;
        }
    }

    //This is the Method that displays the apple's details
    public void writeOutput() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}

