// Base Class
class Seller {

    String sellerName;
    int sellerID;
    String contactDetails;

    // Constructor
    Seller(String sellerName, int sellerID, String contactDetails) {
        this.sellerName = sellerName;
        this.sellerID = sellerID;
        this.contactDetails = contactDetails;
    }

    // Display seller information
    void displaySellerInfo() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Seller ID: " + sellerID);
        System.out.println("Contact: " + contactDetails);
    }

    // Commission method (to be overridden)
    void calculateCommission() {
        System.out.println("Commission calculation depends on seller type.");
    }
}


// Individual Seller
class IndividualSeller extends Seller {

    int numberOfProducts;

    IndividualSeller(String name, int id, String contact, int numberOfProducts) {
        super(name, id, contact);
        this.numberOfProducts = numberOfProducts;
    }

    void calculateCommission() {
        double commission = numberOfProducts * 50;
        System.out.println("Individual Seller Commission: " + commission);
    }
}


// Business Seller
class BusinessSeller extends Seller {

    String businessLicense;

    BusinessSeller(String name, int id, String contact, String businessLicense) {
        super(name, id, contact);
        this.businessLicense = businessLicense;
    }

    void calculateCommission() {
        double commission = 5000;
        System.out.println("Business Seller Commission: " + commission);
    }
}


// Wholesale Seller
class WholesaleSeller extends Seller {

    double bulkDiscountRate;

    WholesaleSeller(String name, int id, String contact, double bulkDiscountRate) {
        super(name, id, contact);
        this.bulkDiscountRate = bulkDiscountRate;
    }

    void calculateCommission() {
        double commission = 10000 - (10000 * bulkDiscountRate);
        System.out.println("Wholesale Seller Commission: " + commission);
    }
}


// Main Class
public class FlipkartSellerSystem {

    public static void main(String[] args) {

        IndividualSeller s1 = new IndividualSeller("Akanksha", 101, "akanksha@email.com", 20);
        BusinessSeller s2 = new BusinessSeller("ABC Electronics", 102, "abc@email.com", "LIC12345");
        WholesaleSeller s3 = new WholesaleSeller("Bulk Traders", 103, "bulk@email.com", 0.10);

        System.out.println("----- Individual Seller -----");
        s1.displaySellerInfo();
        s1.calculateCommission();

        System.out.println();

        System.out.println("----- Business Seller -----");
        s2.displaySellerInfo();
        s2.calculateCommission();

        System.out.println();

        System.out.println("----- Wholesale Seller -----");
        s3.displaySellerInfo();
        s3.calculateCommission();
    }
}