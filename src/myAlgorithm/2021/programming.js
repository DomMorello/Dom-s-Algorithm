const checkSameQ = (arr, Qnum) => {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i].substring(5, 6) === Qnum) {
      const idx = arr.indexOf(arr[i]);
      arr.splice(idx, 1);
      break ;
    }
  }
  return arr;
};

const solution = (logs) => {
  let ret = [];
  let userArr = [];
  let flag = true;

  //수험번호를 기준으로 2차원 배열을 만들어서 정리함(checkSameQ 함수 통해 중복된 문제번호는 마지막 성적으로 대체)
  for (let i = 0; i < logs.length; i++) {
    for (let k = 0; k < userArr.length; k++) {
      if (logs[i].substring(0, 4) === userArr[k][0].substring(0, 4)) {
        userArr[k] = checkSameQ(userArr[k], logs[i].substring(5, 6));
        userArr[k].push(logs[i]);
        flag = false;
        break ;
      }
      if (k === userArr.length - 1) {
        flag = true;
      }
    }
    if (flag) {
      userArr.push([logs[i]]);
    }
  }
  //5문제 아래는 다 제거
  userArr = userArr.filter((arr) => {
    return arr.length >= 5;
  })
  //전부 정렬
  userArr.forEach((arr) => {
    arr.sort();
  })
  let set = new Set();  //이름 중복을 제거하기 위함
  let cnt = 0;

  for (let i = 0; i < userArr.length; i++) {
    for (let j = i + 1; j < userArr.length; j++) {
      if (userArr[j].length === userArr[i].length) {
        for (let k = 0; k < userArr[j].length; k++) {
          if (userArr[j][k].substring(5) !== userArr[i][k].substring(5)) {
            break ;
          }
          cnt++;
        }
        if (cnt === userArr[j].length) {
          set.add(userArr[i][0].substring(0, 4));
          set.add(userArr[j][0].substring(0, 4));
        }
        cnt = 0;
      }
    }
  }
  ret = Array.from(set);
  
  if (ret.length === 0)
    return ["None"];
  return ret.sort();
};

const logs1 = ["0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"];
	// ["0001", "0002"]
const logs2 = ["1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100", "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100", "1903 2 100", "1903 1 100", "2001 1 100", "2001 2 100", "2001 4 100", "2001 7 95", "2001 9 100", "2002 1 95", "2002 2 100", "2002 4 100", "2002 7 100", "2002 9 100"];
	// ["1901", "1902", "1903"]
const logs3 = ["1901 10 50", "1909 10 50"];
	// ["None"]

console.log(solution(logs1), solution(logs2), solution(logs3));