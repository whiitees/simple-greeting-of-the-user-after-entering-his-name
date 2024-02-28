import java.util.Scanner;

public class Main {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to our program.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greet(name);
        scanner.close();
    }
}
greet(name):
    print("Hello,", name, "! Welcome to our program.")

if __name__ == "__main__":
    name = input("Enter your name: ")
    greet(name)
