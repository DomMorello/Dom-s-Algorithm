const handleException = (penter, pexit, pescape, data) => {
  if (penter.length !== pexit.length)
    return false;
  if (penter.length !== pescape.length)
    return false;
  if (pexit.length !== pescape.length)
    return false;
  if (data.length % penter.length !== 0)
    return false;
  return true;
};

const checkEscape = (substr, penter, pexit, pescape) => {
  if (substr === penter || substr === pexit || substr === pescape) {
    return true;
  }
  return false;
};

const solution = (penter, pexit, pescape, data) => {
  let ret = [];
  if (!handleException(penter, pexit, pescape, data)) {
    return ;
  }
  const elemLen = penter.length;
  ret.push(penter);
  for (let i = 0; i < data.length / elemLen; i++) {
    const substr = data.substring(i * elemLen, (i + 1) * elemLen);
    if (checkEscape(substr, penter, pexit, pescape)) {
      ret.push(pescape);
    }
    ret.push(substr);
  }
  ret.push(pexit);

  return ret.join('');
};

const penter1 = "1100";
const pexit1 = "0010";
const pescape1 = "1001";
const data1 = "1101100100101111001111000000";
//"110011011001100110010010111100111001110000000010"

const penter2 = "10";
const pexit2 = "11";
const pescape2 = "00";
const data2 = "00011011";
//"100000010010001111"

console.log(solution(penter1, pexit1, pescape1, data1));
console.log(solution(penter2, pexit2, pescape2, data2));