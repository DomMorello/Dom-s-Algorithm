const getMinXDist = (n, myX, targetX, ret) => {
  //가장자리로 가지 않고 바로 가는 거리가 가장자리 이용해서 가는 거리보다 가까우면
  if (Math.abs(targetX - myX) <= n - Math.abs(targetX - myX)) {
    ret = Math.abs(targetX - myX) + 1;
  } else {
    ret = n - Math.abs(targetX - myX) + 1;
  }
  return ret;
};

const getMinYDist = (n, myY, targetY, ret) => {
  if (Math.abs(targetY - myY) <= n - Math.abs(targetY - myY)) {
    ret = Math.abs(targetY - myY);
  } else {
    ret = n - Math.abs(targetY - myY);
  }
  return ret;
};

const solution = (n, board) => {
  let curPosX = 0;
  let curPosY = 0;
  let targetPosX = 0;
  let targetPosY = 0;
  let target = 1;
  let ret = 0;

  while (target !== n * n + 1) {
    for (let i = 0; i < board.length; i++) {
      targetPosY = board[i].indexOf(target);
      if (targetPosY !== -1) {
        target++;
        targetPosX = i;
        ret += getMinXDist(n, curPosX, targetPosX, ret);
        ret += getMinYDist(n, curPosY, targetPosY, ret);
        curPosX = targetPosX;
        curPosY = targetPosY;
        break ;
      }  
    }
  }
  return ret;
};

const n1 = 3;
const board1 = [[3, 5, 6],
                [9, 2, 7],
                [4, 1, 8]];
                //22
const n2 = 2;
const board2 = [[2, 3],
                [4, 1]];
                //11
const n3 = 4;
const board3 = [[11, 9, 8, 12],
                [2, 15, 4, 14],
                [1, 10, 16, 3],
                [13, 7, 5, 6]];
                //46

console.log(solution(n1, board1), solution(n2, board2), solution(n3, board3));