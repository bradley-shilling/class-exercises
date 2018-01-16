package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnABranch = 4;
		int birdsLeft = birdsOnABranch - 1;
		System.out.println("Birds left " + birdsLeft);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		int nests = 3;
		int bigBirds = 6;
		int moreBirdsThanNest = bigBirds - nests;
		System.out.println("There are " + moreBirdsThanNest + " more birds than nests.");

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		
		int raccoonInWoods = 3;
		int raccoonLeaving = 2;
		int raccoonLeft = raccoonInWoods - raccoonLeaving;
		System.out.println("Raccoons left " + raccoonLeft);

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int flowersLessBees = flowers - bees;
		System.out.println(flowersLessBees);

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int lonelyPigeon = 1;
		lonelyPigeon += 1 ;
		System.out.println(lonelyPigeon);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int fenceOwls = 3;
		fenceOwls += 2 ;
		System.out.println(fenceOwls);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beavers = 2;
		beavers -= 1 ;
		System.out.println(beavers);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int taucanSams = 2;
		taucanSams += 1 ;
		System.out.println(taucanSams);

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrelsInATree = 4;
		int nutsInATree = 2;
		System.out.println(squirrelsInATree - nutsInATree);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		float quarter = 0.25f;
		float dime = 0.10f;
		float nickle = 0.05f;
		float foundMoney = ((1 * quarter) + (1 * dime) + (2 * nickle));
		System.out.println("$"+foundMoney);
		

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int muffins = 0;
		muffins += 18;
		muffins += 20;
		muffins += 17;
		System.out.println(muffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		float hiltMoneySpent = 0.00f;
		hiltMoneySpent += 0.24;
		hiltMoneySpent += 0.14;
		System.out.println(hiltMoneySpent);
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int miniMarshmallows = 10;
		int marshmallows = 8;
		int totalMarshmallows = miniMarshmallows + marshmallows;
		System.out.println(totalMarshmallows);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHousSnowTotal = 29;
		int skoolSnowTotal = 17;
		System.out.println(hiltHousSnowTotal - skoolSnowTotal + " more inches of snow at Hilt house.");
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		float hiltsFatStacks =10.00f;
		hiltsFatStacks -= 3.00f;
		hiltsFatStacks -= 2.00f;
		System.out.println(hiltsFatStacks + " money left after buying a toy truck and pencil case.");
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbles = 16;
		marbles -= 7;
		System.out.println(marbles);
		
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int desiredShells = 25;
		int shellsInHand = 19;
		System.out.println("Megan needs " + (desiredShells - shellsInHand) + " shells to equal 25.");
        
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int balloons = 17;
		int redBalloons = 8;
		int greenBalloons = balloons - redBalloons;
		System.out.println(greenBalloons);
            
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		booksOnShelf += 10;
		System.out.println(booksOnShelf);
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        bees = 8;
        int legsOnBee = 6;
        int totalLegs = bees * legsOnBee;
        System.out.println(totalLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        float costPerIceCream = 0.99f;
        float totalCostOfIceCream = costPerIceCream * 2;
        System.out.println("$" + totalCostOfIceCream);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksNeeded = 125;
        int rocksHad = 64;
        System.out.println(rocksNeeded - rocksHad);
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        marbles = 38;
        marbles -= 15;
        System.out.println("Mrs Hilt's marbles: " + marbles);
        
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int distanceFromHome = 78;
        int distanceDriven = 32;
        System.out.println(distanceFromHome - distanceDriven + "miles left");
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int minutesShovelingSnow = 90;
        minutesShovelingSnow += 45;
        int hours = minutesShovelingSnow / 60;
        int minutes = minutesShovelingSnow % 60 ;
        System.out.println("Mrs Hilt spent " + hours + " hours and " + minutes + " minutes shoveling snow.");
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double totalSpentOnHotDogs = 6 * 0.50;
        
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int pencilsHiltCanBuy = 50 / 7;
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int redButterflies = 33 - 20;
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        float kateMoneyGiven = 1.00f;
        float candyCost = 0.54f;
        float changeGiven = kateMoneyGiven - candyCost;
		System.out.println(changeGiven);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int trees = 13;
		trees += 12;
		System.out.println(trees);
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int joyDays = 2;
		int joyHours = joyDays * 24;
		System.out.println(joyHours + " hours untile Joy sees Gamgam.");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCounsins = 4;
		int totalGum = kimCounsins * 5;
		System.out.println(totalGum);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		float donStartingMoney = 3.00f;
		float donMoneyLeft = donStartingMoney - 1.00f;
		System.out.println(donMoneyLeft);
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peopleOnBoat = 3;
        int totalPeeps = boats * peopleOnBoat;
        System.out.println(peopleOnBoat);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        
        int totalLegos = 380 - 57 ;
        
            
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int moreMuffinsToBake = 83 - 35;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyHasThisManyMoreCrayons = 1400 - 290;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int totalStickers = 10 * 22;
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakesPerChild = 96 / 8;
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int jarsNeeded = 47 / 6;
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int croissantsLeft = 59 % 8 ;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
            double traysNeeded = 276 / 12;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
            double servingsOfBiteSizedPretzels = 480 / 12;
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
            int boxesOfLemonCakes = ((53 - 2 ) / 3);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
            int carrotsLeft = 74 % 12;
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
            int shelvesFilledWithBears = 98 / 7;
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
            double alblumsNeeded = 480 / 20;
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
            int filledBoxes = 94 / 8;
            int cardsInPartialBox = 94 % 8;
            
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        double booksOnEachShelf = 210 / 10;

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int croissantsPerGuest = 17 / 7;
            
	}

}
