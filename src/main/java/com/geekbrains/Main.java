package com.geekbrains;

import com.geekbrains.market.Market;
import com.geekbrains.person.customer.Customer;
import com.geekbrains.person.salesman.Salesman;
import com.geekbrains.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //1) Salesman, который может добавлять продукты
    //2) Customer может покупать продукты
    //3) Когда Salesman продает продукты, то из списка продуктов убирается этот продукт, а также
    //ему добавляется cash, а у customer он убирается
    //4) Поиск товара осуществляется по продавцу и продукту, либо просто по продукту

    public static void main(String[] args) {
        Market market = new Market();

        Salesman firstSalesman = createFirstSalesman();
        Salesman secondSalesman = createSecondSalesman();
        Salesman thirdSalesman = createThirdSalesman();

        market.addSalesman(firstSalesman);
        market.addSalesman(secondSalesman);
        market.addSalesman(thirdSalesman);

        firstSalesman.whatSalesmanOffer();
        secondSalesman.whatSalesmanOffer();
        thirdSalesman.whatSalesmanOffer();

        Customer customer = createFirstCustomer();
        customer.findProduct(market);
        customer.buyFromSalesman(firstSalesman);
        customer.whatIBoughtInfo();

        firstSalesman.whatSalesmanOffer();

    }

    private static Salesman createThirdSalesman() {
        Salesman salesman = new Salesman();
        salesman.setName("Алекcандр");
        salesman.setSecondName("Насонов");
        salesman.setCash(100);
        List<Product> products = new ArrayList<>();
        salesman.setProducts(products);

        return salesman;

    }

    private static Customer createFirstCustomer() {
        Product firstProduct = new Product();
        firstProduct.setName("Помидоры");
        firstProduct.setCount(4);

        Product secondProduct = new Product();
        secondProduct.setName("Огурцы");
        secondProduct.setCount(2);

        return new Customer(List.of(firstProduct, secondProduct), 200);
    }

    private static Salesman createSecondSalesman() {
        Salesman salesman = new Salesman();
        salesman.setName("Алексей");
        salesman.setSecondName("Ушаков");
        salesman.setCash(0);

        Product firstProduct = new Product();
        firstProduct.setName("Помидоры");
        firstProduct.setPrice(50);
        firstProduct.setCount(40);

        Product secondProduct = new Product();
        secondProduct.setName("Огурцы");
        secondProduct.setPrice(5);
        secondProduct.setCount(12);

        List<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct);

        salesman.setProducts(products);

        return salesman;
    }

    private static Salesman createFirstSalesman() {
        Salesman salesman = new Salesman();
        salesman.setName("Виталий");
        salesman.setSecondName("Еремин");
        salesman.setCash(0);

        Product firstProduct = new Product();
        firstProduct.setName("Помидоры");
        firstProduct.setPrice(10);
        firstProduct.setCount(20);

        Product secondProduct = new Product();
        secondProduct.setName("Огурцы");
        secondProduct.setPrice(8);
        secondProduct.setCount(100);

        List<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct);

        salesman.setProducts(products);

        return salesman;
    }
}
