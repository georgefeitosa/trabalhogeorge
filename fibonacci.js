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
