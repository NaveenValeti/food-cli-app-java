package com.naveen.foodcliapp.repository;

import com.naveen.foodcliapp.model.Dish;
import com.naveen.foodcliapp.util.CsvReader;

import java.io.FileNotFoundException;
import java.util.List;

public class DishesRepository {

    List<Dish> DishesList;

    public DishesRepository() throws FileNotFoundException {
        CsvReader csvReader = new CsvReader();
        this.DishesList = CsvReader.readDishesFromCsv();
    }
        public List<Dish> getDishesList(){
            return this.DishesList;
        }

    }
}
