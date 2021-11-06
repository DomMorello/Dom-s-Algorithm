function fillZero(rows, columns) {
  let answer = [];
  for (let i = 0; i < rows; i++) {
    answer.push([]);
    for (let j = 0; j < columns; j++) {
      answer[i].push(0);
    }
  }
  return answer;
}

function checkGameOver(isGameOverArr) {
  for (let i = 0; i < isGameOverArr.length; i++) {
    if (isGameOverArr[i].includes(0))
      return false;
  }
  return true;
}

function isInfinite(number, curRow, curCol) {
  return (number !== 1 && number % 2 !== 0 && curRow === 0 && curCol === 0);
}

function solution(rows, columns) {
  let answer = [[]];

  answer = fillZero(rows, columns);
  let isGameOverArr = fillZero(rows, columns);
  
  let curRow = 0;
  let curCol = 0;
  let number = 1;
  while (!checkGameOver(isGameOverArr)) {
    if (isInfinite(number, curRow, curCol)) {
      break ;
    }
    answer[curRow][curCol] = number++;
    isGameOverArr[curRow][curCol] = 1;
    if ((number - 1) % 2 === 1) {
      curCol++;
      if (curCol === columns) {
        curCol = 0;
      }
    } else {
      curRow++;
      if (curRow === rows) {
        curRow = 0;
      }
    }
  }
  return answer;
}

// const rows = 3;
// const columns =	4;
// [[8,2,13,14],[16,10,4,15],[17,11,12,6]]

const rows = 3;
const columns =	3;
// [[1,2,0],[0,3,4],[6,0,5]]

console.log(solution(rows, columns));