const BILLS = [FIVE_M = 50000, ONE_M = 10000, FIVE_T = 5000, ONE_T = 1000, FIVE_H = 500, ONE_H = 100, FIFTY = 50, TEN = 10, ONE = 1];

let answer = [];

const sol = (money) => {
	//매개변수 오류 처리
	if (!(money >= 1 && money <= 1000000))
		return ;
	for (let i = 0; i < 9; i++) {
		let bill = parseInt(money / BILLS[i]);
		money = money - bill * BILLS[i];
		answer.push(bill);
	}
	console.log(answer);
};

sol(109);

