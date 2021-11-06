function solution(ings, menu, sell) {
  let answer = 0;

  let ingsNames = [];
  let ingsPrices = [];
  for (let i = 0; i < ings.length; i++) {
    const tmp = ings[i].split(' ');
    ingsNames.push(tmp[0]);
    ingsPrices.push(tmp[1]);
  }

  let menuNames = [];
  let menuIngs = [];
  let menuSellPrices = [];
  for (let i = 0; i < menu.length; i++) {
    const tmp = menu[i].split(' ');
    menuNames.push(tmp[0]);
    menuIngs.push(tmp[1]);
    menuSellPrices.push(tmp[2]);
  }

  let sellNames = [];
  let sellCnt = [];
  for (let i = 0; i < sell.length; i++) {
    const tmp = sell[i].split(' ');
    sellNames.push(tmp[0]);
    sellCnt.push(tmp[1]);
  }
  let cost = 0;
  //�ǸŽ���ǥ�� ���� �޴� �ϳ��� �Ľ��ϴ� ���� ū �ݺ�
  for (let i = 0; i < sell.length; i++) {
    const idx = menuNames.indexOf(sellNames[i]);
    const price = Number(menuSellPrices[idx]);
    
    const ings = menuIngs[idx].split('');
    cost = 0;
    //�ǸŽ������� �޴��� ��ᰪ�� ������ ���ϴ� �ݺ�
    for (let j = 0; j < ings.length; j++) {
      const ingIdx = ingsNames.indexOf(ings[j]);
      cost += Number(ingsPrices[ingIdx]);
    }

    const sales = price * Number(sellCnt[i]);  //����
    const profit = sales - (cost * Number(sellCnt[i]));
    console.log(cost, sales, profit);
    answer += profit;
  }
  return answer;
}

const ings = ["r 10", "a 23", "t 124", "k 9"]
const menu = ["PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"]
const sell = ["BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"]
// 1161
// const ings = ["x 25", "y 20", "z 1000"]
// const menu = ["AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"]
// const sell = ["BBBB 3", "TTT 2"]
// -80
console.log(solution(ings, menu, sell));
