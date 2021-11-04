// const lands = [ [10, 0, 30, 5],
//                 [0, 30, 20, 50],
// 								[30, 30, 40, 40] ];
// const wells = [ [15, 15, 25, 25],
// 								[40, 10, 50, 20] ];
// const point = [10, 10, 30, 30];

const lands = [ [0, 0, 20, 10], [10, 20, 20, 40], [30, 0, 50, 20] ];
const wells = [ [20, 40, 30, 50], [30, 20, 50, 30] ];
const point = [20, 30, 30, 40];

const checkLands = (lands) => {
	for (let i = 0; i < lands.length; i++) {
		if (point[0] < lands[i][2] && point[2] > lands[i][0]
				&& point[1] < lands[i][3] && point[3] > lands[i][1]) {
					return false;
				}
	}
	return true;
};

const checkWells = (wells) => {
	for (let i = 0; i < wells.length; i++) {
		if (point[0] <= wells[i][0] && point[2] >= wells[i][2]
				&& point[1] <= wells[i][1] && point[3] >= wells[i][3]) {
					return true;
				}
	}
	return false;
};

const solution = (lands, wells, point) => {
	if (!checkLands(lands, point)) {
		return false;
	};
	if (!checkWells(wells, point)) {
		return false;
	};
	return true;
};

console.log(solution(lands, wells, point));