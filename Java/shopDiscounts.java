
        Scanner input = new Scanner(System.in);
        double cost;
        
        // asks user for the amount of purchases
        System.out.print("Enter amount of purchases: ");
        cost = input.nextDouble();
        
        // checks if the amount of purchases is over $10 and under $50
        if (cost >= 10 && cost < 50){
            // prints discounted price
            System.out.print("Discounted price: ");
            System.out.print((cost) - (cost * 0.1));
        // checks if the amount of purchases is over $50
        } else if (cost >= 50){
            // prints discounted price
            System.out.print("Discounted price: ");
            System.out.print((cost) - (cost * 0.2));
        // by defalt if the top two are not true it would mean that no discount should be added
        } else {
            // tells user that they got no discounted price
            System.out.println("No discount added becuase the purchases was under $10");
            System.out.print("Final price: " + cost);
        }
    }
}