
/**
 * It loops through all the numbers from 100 to 999, and for each number it checks if it's an Armstrong
 * number. If it is, it adds it to the list of Armstrong numbers.
 */
const calculate = () => {
 let elenco = "";

    for(let i = 100; i < 999; i++) {
        if(verifyArmstrong(i)) {
            elenco += String(i) + "\n";
        } 

        document.getElementById("res").value = elenco + "\n" + "Fine elaborazione";
    }
}



/**
 * It takes a number as input, converts it to a string, splits the string into an array of digits, then
 * sums the cubes of each digit. If the sum is equal to the original number, it returns true, otherwise
 * it returns false
 * @param num - the number to be checked
 * @returns A function that takes a number as an argument and returns true if the number is an
 * Armstrong number, false otherwise.
 */
const verifyArmstrong = (num) => {

    const cifre = num.toString();

    const digits = cifre.split("");

    let sum = 0;

    for(let i = 0; i < cifre.length; i++) {
        sum += Math.pow(cifre[i], 3);
    }

    if(num == sum)
        return true;
    else
        return false;

}