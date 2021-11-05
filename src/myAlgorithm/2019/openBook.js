const handleException = (pobi, crong) => {
	if (pobi.length !== 2 || crong.length !== 2) {
		return false;
	}
	if (pobi[1] - pobi[0] !== 1 || crong[1] - crong[0] !== 1) {
		return false;
	}
	if (!(pobi[0] >= 1 && pobi[0] <= 399) || !(pobi[1] >= 2 && pobi[1] <= 400)) {
		return false;
	}
	if (pobi[0] % 2 !== 1 || pobi[1] % 2 !== 0) {
		return false;
	}
	return true;
};

const convertToDigitArr = (number) => {
	return Array.from(String(number), Number);
};

const getDigitSum = (arr) => {
	let sum = 0;

	arr.forEach(elem => {
		sum += elem;
	});
	return sum;
};

const getDigitMul = (arr) => {
	let mul = 1;

	arr.forEach(elem => {
		mul *= elem;
	});
	return mul;
}

const solution = (pobi, crong) => {
  if (!handleException(pobi, crong)) {
		return  -1;
	}

	let pobiArr = [];
	let crongArr = [];

	const pobiLeftDigitArr = convertToDigitArr(pobi[0]);
	const pobiRightDigitArr = convertToDigitArr(pobi[1]);
	const crongLeftDigitArr = convertToDigitArr(crong[0]);
	const crongRightDigitArr = convertToDigitArr(crong[1]);

	pobiArr.push(getDigitSum(pobiLeftDigitArr), getDigitMul(pobiLeftDigitArr), getDigitSum(pobiRightDigitArr), getDigitMul(pobiRightDigitArr));
	crongArr.push(getDigitSum(crongLeftDigitArr), getDigitMul(crongLeftDigitArr), getDigitSum(crongRightDigitArr), getDigitMul(crongRightDigitArr));

	const pobiPoint = Math.max(...pobiArr);
	const crongPoint = Math.max(...crongArr);

	if (pobiPoint > crongPoint) return 1;
	if (pobiPoint < crongPoint) return 2;
	if (pobiPoint === crongPoint) return 0;
	return -1;
};

const pobi1 = [97, 98];
const crong1 = [197, 198];

const pobi2 = [131, 132];
const crong2 = [211, 212];

const pobi3 = [99, 102];
const crong3 = [211, 212];

console.log(solution(pobi1, crong1));
console.log(solution(pobi2, crong2));
console.log(solution(pobi3, crong3));

