function solution(arr) {
  let answer = [];
  let num1 = 0;
  let num2 = 0;
  let num3 = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 1) {
      num1++;
    } else if (arr[i] === 2) {
      num2++;
    } else if (arr[i] === 3) {
      num3++;
    }
  }
  const maxCnt = Math.max(num1, num2, num3);
  let toBeAdded = [];
  while (num1 < maxCnt) {
    toBeAdded.push(1);
    num1++;
  }
  while (num2 < maxCnt) {
    toBeAdded.push(2);
    num2++;
  }
  while (num3 < maxCnt) {
    toBeAdded.push(3);
    num3++;
  }
  num1 = 0;
  num2 = 0;
  num3 = 0;

  for (let i = 0; i < toBeAdded.length; i++) {
    if (toBeAdded[i] === 1) {
      num1++;
    } else if (toBeAdded[i] === 2) {
      num2++;
    } else if (toBeAdded[i] === 3) {
      num3++;
    }
  }
  answer.push(num1);
  answer.push(num2);
  answer.push(num3);
  console.log(answer);

  return answer;
}


// [2, 1, 3, 1, 2, 1]	[0, 1, 2]
// [3, 3, 3, 3, 3, 3]	[6, 6, 0]
// [1, 2, 3]	[0, 0, 0]

solution([1, 2, 3]);