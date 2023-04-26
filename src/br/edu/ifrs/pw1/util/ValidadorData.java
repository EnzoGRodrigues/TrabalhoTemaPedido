package br.edu.ifrs.pw1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorData {

    public static boolean validarData(String data){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try{
            Date date = format.parse(data);

            if(date.getYear() + 1900 >= 2019){
                return true;
            }else {
                return false;
            }
        }catch (ParseException e){
            return false;
        }
    }
}
