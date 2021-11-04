const solution = (words) => {
	const reverseDictCaptal = [];
	for (let i = 0; i < 26; i++) {
		reverseDictCaptal.push(String.fromCharCode(90 - i));
	}

	const reverseDict = [];
	for (let i = 0; i < 26; i++) {
		reverseDict.push(String.fromCharCode(122 - i));
	}
	
	const arr = words.split('');
	let ret = [];

  for (let i = 0; i < arr.length; i++) {
		const charCode = arr[i].charCodeAt();

		if (charCode >= 97 && charCode <= 122) {
			ret.push(reverseDict[charCode - 97]);
			continue ;
		}
		if (charCode >= 65 && charCode <= 90) {
			ret.push(reverseDictCaptal[charCode - 65]);
			continue ;
		}
		ret.push(arr[i]);
	}
	return ret.join('');
};

console.log(solution("I Love You"));