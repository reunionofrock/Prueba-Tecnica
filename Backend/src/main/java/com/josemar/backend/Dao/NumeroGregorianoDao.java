package com.josemar.backend.Dao;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class NumeroGregorianoDao {

    public NumeroGregorianoDao() throws SQLException {
    }




    public String calculateRomanNumber(String num){
        String numero = num;
        int position;
        String romanNumberFinded = "";
        Integer[] numerosGregorianos = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] numerosRomanos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Boolean data = Arrays.asList(numerosGregorianos).contains(Integer.parseInt(numero));
        if(data){
            position = Arrays.asList(numerosGregorianos).indexOf(Integer.parseInt(numero));
            if(position > -1){
                romanNumberFinded = numerosRomanos[position];
            }
        }else{
            romanNumberFinded = "";
        }
        return romanNumberFinded;
    }






}
