public class Flat {
    private int squareFeet;
    private int priceForSquareFeet;
    private int floorNumber;
    private int numberOfRooms;


    public Flat(int _squareFeet, int _priceForSquareFeet, int _floorNumber, int _numberOfRooms){
        squareFeet = _squareFeet;
        priceForSquareFeet = _priceForSquareFeet;
        floorNumber = _floorNumber;
        numberOfRooms = _numberOfRooms;

    }
    public int getFlatPrice(){
         return squareFeet * priceForSquareFeet;
    }
    public void printAll(){
        System.out.println("Square feet : " + squareFeet);
        System.out.println("Price for sq feet " + priceForSquareFeet);
        System.out.println("floor number : " + floorNumber);
        System.out.println("No of rooms : " + numberOfRooms);
    }
}
