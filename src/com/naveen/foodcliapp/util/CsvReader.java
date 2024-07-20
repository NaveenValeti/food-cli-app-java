package com.naveen.foodcliapp.util;

import com.naveen.foodcliapp.model.Customer;
import com.naveen.foodcliapp.model.Dish;
import com.naveen.foodcliapp.model.Order;
import com.naveen.foodcliapp.model.Restaurant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    /* Read the data from CSV files and create a List of objects */
    //CSV files read and create list of objects

    public List<Customer> readCustomersFromCsv() throws FileNotFoundException {
        String CUSTOMER_CSV_PATH = "E:\\java projects\\food-cli-app-java\\data\\customers.csv";
        List<Customer>customersList=new ArrayList<>();
        try(BufferedReader br= new BufferedReader(new FileReader(CUSTOMER_CSV_PATH))){
            String csvSpilitBy=",";
            String line;
            br.readLine();
            while((line = br.readLine()) !=null){
                String[] data=line.split(csvSpilitBy);
                Customer customer=new Customer();
                customer.setId(data[0]);
                customer.setName(data[1]);
                customer.setEmail(data[2]);
                customer.setPassword(data[3]);

                customersList.add(customer);
            }

        } catch (IOException e) {
            System.out.println("File not found in the path: "+CUSTOMER_CSV_PATH);
            System.exit(0);
            e.printStackTrace();
        }

        return customersList;


    }

//    public List<Restaurant> readOrdersFromCsv() throws FileNotFoundException {
//        String RESTAURANT_CSV_PATH = "E:\\java projects\\food-cli-app-java\\data\\restaurants..csv";
//        List<Restaurant>RestuarntsList=new ArrayList<>();
//        try(BufferedReader br= new BufferedReader(new FileReader(RESTAURANT_CSV_PATH))){
//            String csvSpilitBy=",";
//            String line;
//            br.readLine();
//            while((line = br.readLine()) !=null){
//                String[] data=line.split(csvSpilitBy);
//                Restaurant restaurant=new Restaurant();
//                restaurant.setId(data[0]);
//                restaurant.setName(data[1]);
//                restaurant.setAddress(data[2]);
//                //restaurant.setMenu(Arrays.asList(data[3].split(";")));
//            }
//
//        } catch (IOException e) {
//            System.out.println("File not found in the path: "+RESTAURANT_CSV_PATH);
//            System.exit(0);
//            e.printStackTrace();
//        }
//
//        return RestuarntsList;


//    }

    public static List<Dish> readDishesFromCsv() throws FileNotFoundException {
        String DISHES_CSV_PATH = "E:\\java projects\\food-cli-app-java\\data\\dishes.csv";
        List<Dish>DishesList=new ArrayList<>();
        try(BufferedReader br= new BufferedReader(new FileReader(DISHES_CSV_PATH))){
            String csvSpilitBy=",";
            String line;
            br.readLine();
            while((line = br.readLine()) !=null){
                String[] data=line.split(csvSpilitBy);
                Dish dish=new Dish();
                dish.setId(data[0]);
                dish.setName(data[1]);
                dish.setDescription(data[2]);
                dish.setPrice(Double.parseDouble(data[3]));
                DishesList.add(dish);
            }

        } catch (IOException e) {
            System.out.println("File not found in the path: "+DISHES_CSV_PATH);
            System.exit(0);
            e.printStackTrace();
        }

        return DishesList;


    }





}
