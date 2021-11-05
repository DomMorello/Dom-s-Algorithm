const solution = (s, op) => {
  let ret = [];

	const arr = s.split('');
	for (let i = 0; i < arr.length - 1; i++) {
		const first = Number(arr.slice(0, i + 1).join(''));
		const second = Number(arr.slice(i + 1, arr.length).join(''));
		
		if (op === "+") {
			ret.push(first + second);
		} else if (op === "-") {
			ret.push(first - second);
		} else if (op === "*") {
			ret.push(first * second);
		}
	}
	return ret;
};

const s1 = "1234";
const op1 = "+";

const s2 = "987987";
const op2 = "-";

const s3 = "31402";
const op3 = "*";

console.log(solution(s1, op1));
console.log(solution(s2, op2));
console.log(solution(s3, op3));