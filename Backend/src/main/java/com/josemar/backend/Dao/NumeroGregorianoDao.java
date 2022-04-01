package com.josemar.backend.Dao;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class NumeroGregorianoDao {

    public NumeroGregorianoDao() throws SQLException {
    }




    public String calculateRomanNumber(int num){

        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (num > 0 || arab.length == (i - 1)) {
            while ((num - arab[i]) >= 0) {
                num -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }






}
