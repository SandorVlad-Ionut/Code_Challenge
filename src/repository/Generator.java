package repository;

import domain.Product;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public class generateRandom{

        {


            // create instance of Random class
            Random rand = new Warehouse[];





            for(int i=0;i<200;i++) {








//nutritional value
                int nv = ThreadLocalRandom.current().nextInt(50, 601);

//name

                String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                        +"lmnopqrstuvwxyz";
                Random rnd = new Random();
                StringBuilder sb = new StringBuilder(10);
                for (int j = 0; j < 10; j++)
                    sb.append(chars.charAt(rnd.nextInt(chars.length())));
                String n=sb.toString();

                //numele firmei


                Random rnd2 = new Random();
                StringBuilder sb2 = new StringBuilder(10);
                for (int j = 0; j < 10; j++)
                    sb2.append(chars.charAt(rnd.nextInt(chars.length())));
                String v=sb2.toString();
                String c="other";
//storage unit

                int[ ] numbers = { 20,60,100 };
                int max = numbers.length;
                int random = (int)(Math.random() * max);
                int su = numbers[random];
                int p;

                if (su ==20) {
                    int p = ThreadLocalRandom.current().nextInt(15, 25);
                }

                else
                if (su==60)
                {                    int p = ThreadLocalRandom.current().nextInt(30, 60);
                }

                else
                if(su==100)
                {                    int p = ThreadLocalRandom.current().nextInt(100, 500);
                }
//p is the price





                int id = ThreadLocalRandom.current().nextInt(1, 10000);





                //public Product( int Id,String name, int storage_unit, int price, int nutri_value, String vendor,String category)

                Product k=new Product(id,n,su,p,nv,v,c);
                rand.add(id);
            }


        }
    }

}
