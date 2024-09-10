import java.util.Scanner;

public class AddressFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter street address: ");
        String street = scanner.nextLine();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter zip code: ");
        String zipCode = scanner.nextLine();


        String formattedAddress = String.format(
                "Address:\n\t%s\n\t%s\n\t%s",
                street,
                city,
                zipCode
        );


        System.out.println(formattedAddress);


        scanner.close();
    }
}
