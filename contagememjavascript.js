
function countIntegers(firstValue, N) {
  let count = 0;
  for (let i = firstValue; i <= N; i++) {
    if (Number.isInteger(i)) {
      count++;
    }
  }
  return count;
}
const firstValue = 3;
const N = 10;
const result = countIntegers(firstValue, N);
console.log(result); 
