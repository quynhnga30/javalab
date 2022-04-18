package JPlab6;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class GenericCar {
    List<Car> carList = new LinkedList<Car>();
    public void addCars(String carName, float carPrice, int carProduction){
        Car car = new Car();
        car.setName(carName);
        car.setPrice(carPrice);
        car.setProduction(carProduction);
        carList.add(car);
    }
    public void displayCars(){
        for (Object car: carList){
            System.out.println(car);
        }
    }
    public void getSize(String nameGetSize){
        for(int i = 0; i < carList.size();i++){
            if(Objects.equals(nameGetSize, carList.get(i).getName())){
                System.out.println("Size of "+nameGetSize+" is: "+ carList.get(i).getProduction());
            }else if (i == (carList.size()-1)){
                System.out.println("Car not found !");

            }
        }
    }
    public void checkEmpty(String nameCheck){
        for(int i = 0; i < carList.size();i++){
            if(Objects.equals(nameCheck, carList.get(i).getName())){
                if(carList.get(i).getProduction()!=0){
                    System.out.println("Còn xe");
                    break;
                }else {
                    System.out.println("Hết xe");
                    break;
                }
            }else if (i == (carList.size()-1)){
                System.out.println("Car not found !");

            }
        }
    }
    public void delete(String nameDelete){
        for(int i = 0; i < carList.size();i++){
            if(Objects.equals(nameDelete, carList.get(i).getName())){
                carList.remove(i);
                System.out.println("Car removed !");
            }else if(i == (carList.size()-1)){
                System.out.println("Car not found !");
            }
        }
    }


}