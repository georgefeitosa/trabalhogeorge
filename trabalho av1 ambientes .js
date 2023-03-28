
function primeNumber(num) {
    for (var divisor = 2; divisor < num; divisor++) 
    if (num % divisor == 0) return false;
    return true;
}

var determinadoNumero = 50;

for (var i = 2; i < determinadoNumero; i++) if (primeNumber(i)) console.log(i);



function sum(input){
             
    if (toString.call(input) !== "[object Array]")
       return false;
         
               var total =  0;
               for(var i=0;i<input.length;i++)
                 {                  
                   if(isNaN(input[i])){
                   continue;
                    }
                     total += Number(input[i]);
                  }
             return total;
               }
   console.log(sum([8,9,10]));



   let cache = {};

   const fibonacci = n => {
     if (n <= 1) {
       return n;
     }
     
     if(cache[n]) {
       return cache[n];
     }
     
     const result = fibonacci(n - 1) + fibonacci(n - 2);
     
     cache[n] = result;
     
     return result;
   };
   console.log(fibonacci(12))   




   function calcularMDC(num1, num2) {
    var resto, x, y;
    x = num1;
    y = num2;
    while(resto!=0){
      resto = x % y;
      x = y;
      y = resto;
    }
    return (num1*num2)/x;
  };
var resultado = calcularMDC(5, 10);
console.log(calcularMDC(7,8));




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


function countIntegersBetweenFirstAndN(N, dataSet) {
    let count = 0;
    const firstValue = dataSet[0];
  
    for (let i = firstValue; i <= N; i++) {
      if (Number.isInteger(i) && dataSet.includes(i)) {
        count++;
      }
    }
  
    return count;
  }
  
  const dataSet = [0,2,6.4,7,8];
  const N = 20;
  const integerCount = countIntegersBetweenFirstAndN(N, dataSet);
  
  console.log(`Há ${integerCount} números inteiros entre ${dataSet[0]} e ${N}.`);
