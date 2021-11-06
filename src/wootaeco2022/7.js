function pivotToRight(parsedData) {
  let answer = [];

  let answerIdx = 0;
  while (answerIdx !== parsedData.length) {
    answer.push([]);
    for (let i = parsedData.length - 1; i >= 0; i--) {
      for (let j = parsedData[i].length - 1; j >= 0; j--) {
        if (parsedData[i].length >= 2) {
          answer[answerIdx].push(parsedData[i][j]);
          answer[answerIdx].push(parsedData[i][j - 1]);
          parsedData[i].pop();
          parsedData[i].pop();
          break ;
        } else {
          answer[answerIdx].push(parsedData[i][j]);
          parsedData[i].pop();
        }
      }
    }
    answerIdx++;
  }

  answer.sort((a, b) => {
    return a.length - b.length;
  });
  answer = answer.map((elem) => {
    return elem.join('');
  });

  return answer;
}

function pivotToLeft(parsedData) {
  let answer = [];

  let answerIdx = 0;
  while (answerIdx !== parsedData.length) {
    answer.push([]);
    for (let i = 0; i < parsedData.length; i++) {
      for (let j = 0; j < parsedData[i].length; j++) {
        if (parsedData[i].length >= 2) {
          answer[answerIdx].push(parsedData[i][j + 1]);
          answer[answerIdx].push(parsedData[i][j]);
          parsedData[i].shift();
          parsedData[i].shift();
          break ;
        } else {
          answer[answerIdx].push(parsedData[i][j]);
          parsedData[i].pop();
        }
      }
    }
    answerIdx++;
  }
  answer.sort((a, b) => {
    return a.length - b.length;
  });
  answer = answer.map((elem) => {
    return elem.join('');
  });
  return answer;
}

function solution(grid, clockwise) {
  let answer = [];
  let parsedData = [];

  grid.forEach(element => {
    parsedData.push(element.split(''));
  });

  if (clockwise) {
    answer = pivotToRight(parsedData);
  } else {
    answer = pivotToLeft(parsedData);
  }
  return answer;
}

const grid = ["1","234","56789"];
const clockwise = true;
	// ["5","762","98431"]

// const grid = ["A","MAN","DRINK","WATER11"];
// const clockwise =	false;
	// ["1","K1R","NNIET","AAMRDAW"]

console.log(solution(grid, clockwise));