package car_dealership;

public class Employee {
//Metoda określa z jakie czynnosci będą podejmowane
    public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle){
                if(finance==true){
                    double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
                    runCreditHistory(cust,loanAmount);
                } else if(vehicle.getPrice()<=cust.getCashOnHand()){

                    processTransaction(cust,vehicle);
                } else {
                    System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
                }
    }


     public void runCreditHistory(Customer cust, double loanAmount) {
            System.out.println("Run credyt history for Customer...");
            System.out.println("Customer has been approved to purchase the vehicle");
        }
        public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: " + vehicle + "for the price" + vehicle.getPrice());
            }

        }


