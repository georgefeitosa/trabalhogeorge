function isPrime(n) {
  if (n < 2) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      return false;
    }
  }
  return true;
}

function sum(numbers) {
  let total = 0;
  for (let i = 0; i < numbers.length; i++) {
    total += numbers[i];
  }
  return total;
}
function fibonacci(n) {
  if (n < 1) {
    return [];
  } else if (n === 1) {
    return [0];
  } else if (n === 2) {
    return [0, 1];
  } else {
    let fib = [0, 1];
    for (let i = 2; i < n; i++) {
      fib.push(fib[i - 1] + fib[i - 2]);
    }
    return fib;
  }
}
function gcd(a, b) {
  if (b === 0) {
    return a;
  } else {
    return gcd(b, a % b);
  }
}
function quickSort(array) {
  if (array.length <= 1) {
    return array;
  }
  const pivot = array[0];
  const left = [];
  const right = [];
  for (let i = 1; i < array.length; i++) {
    if (array[i] < pivot) {
      left.push(array[i]);
    } else {
      right.push(array[i]);
    }
  }
  return quickSort(left).concat(pivot, quickSort(right));
}
function countInRange(numbers, n) {
  let count = 0;
  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] >= numbers[0] && numbers[i] <= n) {
      count++;
    }
  }
  return count;
}
