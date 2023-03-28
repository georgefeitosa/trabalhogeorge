
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