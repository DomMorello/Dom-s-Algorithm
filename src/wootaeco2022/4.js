function solution(s) {
  s = Array.from(s);
  const log = [];
  let leftArray = null;
  const startChar = s[0];
  const lastChar = s[s.length - 1];

  if (startChar === lastChar) {
    leftArray = [];
    let startLinkedSum = 1;
    let endLinkedSum = 1;
    let breakStartIndex = null;
    let breakEndIndex = null;

    let i = 1;
    while(i <= s.length - 2) {
      if (s[i] !== startChar) {
        breakStartIndex = i;
        break ;
      }
        startLinkedSum += 1;
        i += 1;
      }

      let j = s.length - 2;
      while(j >= 1) {
        if (s[j] !== lastChar) {
          breakEndIndex = j;
          break ;
        }

        endLinkedSum += 1;
        j -= 1;
      }

    log.push(startLinkedSum + endLinkedSum);

    if (breakStartIndex === null) return ;
    leftArray = s.slice(breakStartIndex, breakEndIndex + 1);
  }

  let sum = 1;
  const seqArray = leftArray ? leftArray : s;

  seqArray.forEach((item, index) => {
    if (index === 0) return ;
    if (seqArray[index - 1] === seqArray[index]) {
      sum += 1;
      if (index === seqArray.length - 1) {
          log.push(sum);
      }
    } else {
      log.push(sum);
      sum = 1;
      if (index === seqArray.length - 1) {
        log.push(1); 
      }
    }
  });

  return log.sort((a, b) => a - b);
}