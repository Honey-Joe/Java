public class carRental{
    private String customername;
    private String carType;
    private int rentalDays;

    carRental(){
        this.customername="unknown";
        this.carType="not mentioned";
        this.rentalDays=0;
    }
    carRental(String cname, String ctype, int rdays){
        customername= cname;
        carType= ctype;
        rentalDays= rdays;
    }
    carRental(carRental c1){
        this.customername=c1.customername;
        this.carType=c1.carType;
        this.rentalDays=c1.rentalDays;
    }

    String getcname(){
        return customername;
    }
    String getctype(){
        return carType;
    }
    int getrdays(){
        return rentalDays;
    }


}