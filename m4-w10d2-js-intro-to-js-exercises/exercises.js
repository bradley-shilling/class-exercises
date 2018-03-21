//1. sumDouble Problem
function sumDouble(x, y) {
    // do logic here
    if (x === y) {
        return (x + y)*2;
    }
    // return result;
    return x + y;
}
//2. HasTeen
function hasTeen(x, y, z) {
    if((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
        return true; 
    } else {
        return false;
    }

}
//3. LastDigit Given two non-negative int values, return true 
//if they have the same last digit, such as with 27 and 57.
function lastDigit(x, y) {
    if (Math.abs(x % 10) === Math.abs(y % 10)) {
        return true;
    } else {
        return false;
    }

} 

//4. SeeColor Given a string, if the string begins with "red" or "blue" 
//return that color string, otherwise return the empty string.
function seeColor(string) {
    if (string.startsWith('red')) {
        return 'red';
    } else if (string.startsWith('blue')) {
        return 'blue';
    }else {
        return ''; 
    }
   

}

// 5. MiddleThree Given a string of odd length, return the string 
//length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
function middleThree(string) {
    let middle;
    let len;
        if(string.length % 2 == 1) {
            middle = string.length / 2;
            len = 1;
        } else {
            middle = string.length / 2 - 1;
            len = 2;
        }
    return string.substring(middle-1, middle + len +1)
}

// 6. FrontAgain Given a string, return true if the first 2 chars in the 
// string also appear at the end of the string, such as with "edited".
function frontAgain(string) {
    if (string.substr(0,2) === string.substr(string.length-2)) {
        return true;
    }else {
        return false; 
    }
    
}

// 7. AlarmClock Write a function that given a day of the week encoded as 
// 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we
// are on vacation, displays the weeday name, and the time in the 
// form of "7:00" indicating when the alarm clock should ring. Weekdays,
// the alarm should be "7:00" and on the weekend it should be "10:00". 
// Unless we are on vacation -- then on weekdays it should be
// "10:00" and weekends it should be "off".

function alarmClock(day, vacation) {
    const weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    if (vacation === true) {
        if (day === 0 || day === 6){
            return weekdays[day] + " off"
        } else {
            return weekdays[day] + " 10:00"
        }
    } else {
        if (day === 0 || day === 6){
            return weekdays[day] + " 10:00"
        } else {
            return weekdays[day] + " 7:00"
        }
    }
    
    
}

// 8. MakeMiddle Write a function that given an array of ints of even length, 
// returns a new array length 2 containing the middle two elements from the 
// original array. If the original array length is not even, or at least 2 
// elements in length, return an empty array.

function makeMiddle(array) {
    let newArray = [];
    let middle;
        if(array.length % 2 === 0 && array.length >= 2 ) { // even array
            middle = array.length / 2;
            newArray[0] = array[middle-1];
            newArray[1] = array[middle];
            return newArray;
            
            
        } else { // odd or small array array items
            return newArray;
        }
    
    
}

//9. OddOnly Write a function that given an array of integer of any length,
//filters out the even number, and returns a new array of just
//the the odd numbers.

function oddOnly(array) {
    return array.filter((element) => element % 2 !== 0);
}

//10. Weave Write a function that given two arrays, interleaves the two 
// arrays one element from each array at a time to return a new array
// made up of the interwoven elements of the original two arrays.

function weave(arrayX , arrayY ) {
    let newArray = [];
    let count;
    if (arrayX.length >= arrayY.length){
        count = arrayX.length;
    }else {
        count = arrayY.length;
    }
    for (let i = 0; i < count; i++) {
        if (i < arrayX.length){
            newArray.push(arrayX[i]);
        } 
        if (i < arrayY.length){
            newArray.push(arrayY[i]);
        }
    }
    /*newArray = arrayX.map(function(v,i) { 
        return [v, arrayY[i]]; }).reduce(function(a,b) { 
            return a.concat(b); 
        });*/
    return newArray;
}

//11. CigarParty When squirrels get together for a party, they like 
// to have cigars. A squirrel party is successful when the number of cigars
// is between 40 and 60, inclusive. Unless it is the weekend, in which 
// case there is no upper bound on the number of cigars. Write a
// squirrel party function that return true if the party with the 
// given values is successful, or false otherwise.
function cigarParty(numberCigar, weekend) {
    let minimumCigarCount = 40;
    let maximumCigarCount = 60;
    if (numberCigar >= minimumCigarCount && numberCigar <= maximumCigarCount) {
        return true;
    } else if (numberCigar >= minimumCigarCount && weekend === true){
        return true;
    } else {
        return false;
    } 
}

// 12. FizzBuzz Because you know you can't live without it, FizzBuzz.
function fizzBuzz(input) {
    if (input == 0) { // check if 0
		return "0";
	} else if (input % 15 == 0) { // check if contains 3 and 5 or is divisable by 3 and 5
		return "FizzBuzz";
	} else if (input % 3 == 0) {  // check if divisable by 3 or contains 3
		return "Fizz";
	} else if (input % 5 == 0) { // check if divisable by 5 or contains 5
		return "Buzz";
	} else if (input > 0 && input <101) { // check if in range
		return input;
	}
		return "Out of range."; // else return out of range	
}


//13. CountValues
function countValues (array) {
    let counter = {};
    for(let i = 0; i < array.length; i++){
        let key = array[i];
        if (counter[key] === undefined) {
            counter[key] = 1
        } else {
            counter[key] = counter[key] + 1 ;
        }
    }
    return counter;
}

// 14. Filter Evens Write a function that filters an array to 
// only include even numbers.
function filterEvens (array) {
    return array.filter((element) => element % 2 === 0);
}

// 15. Filter Numbers Greater than 100 Write a function that 
// filters numbers greater than 100.
function filterBigNumbers (array) {
    return array.filter((element) => element >= 100);
}

// 16. Filter Numbers that are Multiples of X Write a function to 
// filter numbers that are a multiple of a paremeter, x passed in.

function filterMultiplesOfX (array, x) {
    return array.filter((element) => element % x === 0);
}
// 17. Create Object Write a function that creates an object with a 
// property called firstName, lastName, and age. Populate the properties
// with your values.
function createObject() {
    const person = {
        firstName: "Bill",
        lastName: "Lumbergh",
        age: 42
    };
    return person;

} 

// 18. Filter Inventors Given an array of inventors, filter the list 
// to include any inventors whose first or last name starts with a vowel.

function filterInventors(array) {

    return array.filter((element) => 
    element.first.startsWith('a') === true ||
    element.first.startsWith('A') === true ||
    element.first.startsWith('e') === true ||
    element.first.startsWith('E') === true ||
    element.first.startsWith('i') === true ||
    element.first.startsWith('I') === true ||
    element.first.startsWith('o') === true ||
    element.first.startsWith('O') === true ||
    element.first.startsWith('u') === true ||
    element.first.startsWith('U') === true ||
    element.last.startsWith('a') === true ||
    element.last.startsWith('A') === true ||
    element.last.startsWith('e') === true ||
    element.last.startsWith('E') === true ||
    element.last.startsWith('i') === true ||
    element.last.startsWith('I') === true ||
    element.last.startsWith('o') === true ||
    element.last.startsWith('O') === true ||
    element.last.startsWith('u') === true ||
    element.last.startsWith('U') === true
    );

}


/* Challange 1. IQTest Bob is preparing to pass an IQ test. The most 
frequent task in this test is to find out which one of the given 
numbers differs from the others. Bob observed that one number 
usually differs from the others in evenness. Help Bob — to check his
answers, he needs a program that among the given numbers finds one 
that is different in evenness, and return the position of this number. 
Keep in mind that your task is to help Bob solve a real IQ test, 
which means indexes of the elements start from 1 (not 0) */

/* Chllange 2. TitleCase Write a function that will convert a string 
into title case, given an optional list of exceptions (minor words). 
The list of minor words will be given as a string with each word 
separated by a space. Your function should ignore the case of the 
minor words string -- it should behave in the same way even if 
the case of the minor word string is changed.
First argument (required): the original string to be converted.
Second argument (optional): space-delimited list of minor words 
that must always be lowercase except for the first word in the string.
The JavaScript tests will pass undefined when this argument is unused. */

/* Challange 3. PerfectSquare Complete the findNextSquare method that 
finds the next integral perfect square after the one passed as a parameter.
Recall that an integral perfect square is an integer n such that sqrt(n) 
is also an integer. If the parameter is itself not a perfect square,
than -1 should be returned. You may assume the parameter is positive. */