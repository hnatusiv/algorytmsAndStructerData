package greedicealgoritms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {


        final Item item1 = new Item(4 , 20);
        final Item item2 = new Item(3 , 18);
        final Item item3 = new Item(2 , 14);

        final Item[] items = {item1 , item2 , item3};


        //  Sorting   O(n*log(n))
        Arrays.sort(items , Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int wKn = 7;

        int weightSoFar = 0;//текущий вес заполнения
        int valueSoFar = 0;//тукущая  стоимость заполнения
        int currentItem = 0;//индекс вещей

        while (currentItem < items.length && weightSoFar <= wKn) {
            if (weightSoFar + items[currentItem].getWeight() < wKn) { //берем объект целиком

              valueSoFar +=items[currentItem].getValue() ;
             weightSoFar +=items[currentItem].getWeight();

            }else {
               valueSoFar += ((wKn-weightSoFar)/ (double) items[currentItem].getWeight())*   //берем  часть объекта
                                   items[currentItem].getValue();

               weightSoFar = wKn; // full Knapsack
            }
            currentItem++;
        }
        System.out.println( " Best set value: " + valueSoFar);
    }

}

class Item {
    private int weight;
    private int value;

    public Item(int weight , int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{w : " + weight + ",v : " + value + "}";
    }
}
