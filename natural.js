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