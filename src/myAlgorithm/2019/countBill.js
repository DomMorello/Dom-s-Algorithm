const BILLS = [50000, 10000, 5000, 1000, 500, 100, 50, 10, 1];

const sol = (money) => {
	let answer = [];

	for (let i = 0; i < 9; i++) {
		let bill = parseInt(money / BILLS[i]);
		money = money - bill * BILLS[i];
		answer.push(bill);
	}
	return answer;
};

console.log(sol(109));

