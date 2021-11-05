const gradeWeight = new Map([
	["A+", 10],
	["A0", 9],
	["B+", 8],
	["B0", 7],
	["C+", 6],
	["C0", 5],
	["D+", 4],
	["D0", 3],
	["F", 0],
]);

const solution = (grades, weights, threshold) => {
	let score = 0;

	for (let i = 0; i < grades.length; i++) {
		score += gradeWeight.get(grades[i]) * weights[i];
	}
	return score - threshold;
};

// const grades = ["A+","D+","F","C0"];
// const weights = [2,5,10,3];
// const threshold = 50;

const grades = ["B+","A0","C+"];
const weights = [6,7,8];
const threshold = 200;

console.log(solution(grades, weights, threshold));