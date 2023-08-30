package br.edu.ifrs.pw1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorData implements Validador<ValidadorData>{

    public static boolean validarData(String data){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try{
            Date date = format.parse(data);

            return date.getYear() + 1900 >= 2019;
        }catch (ParseException e){
            return false;
        }
    }

    @Override
    public boolean validar(ValidadorData obj) {
        return false;
    }
}
