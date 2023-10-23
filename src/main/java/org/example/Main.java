package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while(true){
            try{
                System.out.println("If you want to quit wirte exit");
                String exit = scan.next();
                if(exit.equalsIgnoreCase("exit")){
                    break;
                }

                System.out.println("Give a product price" + Category.BEVERAGE);
                double s = scan.nextInt();
                productsList.add(new Product(s,Category.BEVERAGE));

                System.out.println("Give a product price" + Category.FRUIT);
                double x = scan.nextInt();
                productsList.add(new Product(x,Category.FRUIT));

                System.out.println("Give a product price" + Category.SNACK);
                double b = scan.nextInt();
                productsList.add(new Product(b,Category.SNACK));

                System.out.println("Give a product price" + Category.VEGETABLE);
                double a = scan.nextInt();
                productsList.add(new Product(a,Category.VEGETABLE));


                productsList.forEach(System.out::println);

                Product maxPrice = productsList.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
                Product minPrice = productsList.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
                System.out.println("Product with highest price is " + maxPrice + "" +
                        "And product with lowest price is " + minPrice);

                sortCategory(productsList,Comparator.comparing(Product::getPrice));

            }catch(InputMismatchException e){
                System.out.println("Wrong" + e.getMessage());
                scan.next();
            }
        }

        Map<Category, Double> averagePrices = calculateAveragePrices(productsList);
        System.out.println("Average Prices per Category: " + averagePrices);
    }

    private static Map<Category, Double> calculateAveragePrices(List<Product> products) {

        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
    }

    private static void removeCategory(List<Product> products, Category category) {
        products.removeIf(product -> product.getCategory() == category);
    }

    public static void sortCategory(List<Product> productList, Comparator<Product> comparator){
        Collections.sort(productList, comparator);
    }
}