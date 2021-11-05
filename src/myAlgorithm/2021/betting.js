const solution = (money, expected, actual) => {
  let bettingMoney = 100;
  
  for (let i = 0; i < expected.length; i++) {
    if (money <= 0) break ;
    if (expected[i] !== actual[i]) {
      money -= bettingMoney;
      bettingMoney *= 2;
      if (money < bettingMoney) {
        bettingMoney = money;
      }
    }
    if (expected[i] === actual[i]) {
      money += bettingMoney;
      bettingMoney = 100;
    }
  }
  return money;
};

const money1 = 1000;
const expected1 = ['H', 'T', 'H', 'T', 'H', 'T', 'H'];
const actual1 = ['T', 'T', 'H', 'H', 'T', 'T', 'H'];
//  1400

const money2 = 1200;
const expected2 = ['T', 'T', 'H', 'H', 'H'];
const actual2 = ['H', 'H', 'T', 'H', 'T'];
// 900

const money3 = 1500;
const expected3 = ['H', 'H', 'H', 'T', 'H'];
const actual3 = ['T', 'T', 'T', 'H', 'T'];
//  0

console.log(solution(money1, expected1, actual1), solution(money2, expected2, actual2), solution(money3, expected3, actual3));