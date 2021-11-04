const handleException = (number) => {
  if (!(number >= 1 && number <= 10000))
		return false;
	return true;
};

const getClapCnt = (str) => {
	const arr = str.split('');
	let ret = 0;

	arr.forEach(element => {
		if (element === "3" || element === "6" || element === "9") {
			ret += 1;
		}
	});
	return ret;
};

const solution = (number) => {
	if (!handleException(number))
		return -1;

	let ret = 0;
	
	for (let i = 1; i <= number; i++) {
		const numberStr = String(i);
		ret += getClapCnt(numberStr);
	}
	return ret;
};

const number = 13;
const number2 = 33;
console.log(solution(number));
console.log(solution(number2));