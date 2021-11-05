const solution = (cryptogram) => {
	let arr = cryptogram.split('');
	let retArr = [];
	let retArrIdx = 0;
	
	retArr.push(arr[0]);
	for (let i = 1; i < arr.length; i++) {
		if (retArr[retArrIdx] !== arr[i]) {
			retArr.push(arr[i]);
			retArrIdx++;
			continue ;
		}
		if (retArr[retArrIdx] === arr[i]) {
			retArr.pop();
			retArrIdx--;
		}
	}

	return retArr.join('');
};

const test1 = "browoanoommnaon";
const test2 = "zyelleyz";

console.log(solution(test1), solution(test2));