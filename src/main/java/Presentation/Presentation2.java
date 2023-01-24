package Presentation;

import dao.DaoInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Astuce utiliser juste ça :       throws Exception

        //instanciation dynamique
        Scanner scanner=new Scanner(new File("C:\\Users\\Public\\Documents\\JEETest\\src\\config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        DaoInterface dao=(DaoInterface) cDao.newInstance();
        System.out.println(dao.getData());

    }
}
