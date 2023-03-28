let numbers = [5, 7, 8, 8, 9, 22, 13];
let count = [];
let i, z = 0;
let max = Math.max(...numbers);      
for (i = 0; i <= max; i++) {
    count[i] = 0;
}
for (i=0; i < numbers.length; i++) {
    count[numbers[i]]++;
}
for (i = 0; i <= max; i++) {
    while (count[i]-- > 0) {
        numbers[z++] = i;
    }
}
for (i=0; i < numbers.length; i++) {
    console.log(numbers[i]);
}
