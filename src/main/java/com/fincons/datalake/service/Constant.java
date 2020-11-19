package com.fincons.datalake.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

public class Constant {
  public static final String CF = "MRORSS123123";
  public static final String PIVA = "IMP";
  public static final String IMPRESA_SRL = "impresa srl ";
  public static final String VIA = "via Roma ";
  public static final String VERONA = "Verona";
  public static final int CAP = 37120;
  public static final String PROVINCIA = "VR";
  public static final String NOME = "Mario ";
  public static final String COGNOME = "Rossi ";
  public static final int MAX_NUMERO_POSIZIONI = 10;
  public static final int MIN_RANDOM_PRICE = 1000;
  public static final int MAX_RANDOM_PRICE = 50000;
  public static final int MAX_RANDOM_CODICE_UT = 10000;
  public static final int MIN_RANDOM_CODICE_UT = 1;

  public static final int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

  public static final Date getRandomDate() {
    int minDay = (int) LocalDate.of(1970, 1, 1).toEpochDay();
    int maxDay = (int) LocalDate.of(2020, 11, 11).toEpochDay();
    Random random = new Random();
    long randomDay = minDay + random.nextInt(maxDay - minDay);
    return Date.valueOf(LocalDate.ofEpochDay(randomDay));
  }
}
