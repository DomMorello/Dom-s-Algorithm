const handleException = (totalTicket, logs) => {
	if (!(totalTicket >= 0 && totalTicket <= 10000))
		return false;
};

const getTime = (timeStr) => {
	const timeArr = timeStr.split(":");
	return new Date(2021, 10, 5, timeArr[0], timeArr[1], timeArr[2]);
};

const solution = (totalTicket, logs) => {
	let ret = [];
	let queue = [];	//request하고 성공인지 여부를 확인할 때 까지 여기에 머무름

	for (let i = 0; i < logs.length; i++) {
		const parsedDataArr = logs[i].split(" ");
		const elem = {
			name: parsedDataArr[0],
			action: parsedDataArr[1],
			time: parsedDataArr[2],
		};
		if (queue.length === 0) {
			queue.push(elem);
		}
		if (logs[i + 1]) {
			const parsedNextDataArr = logs[i + 1].split(" ");
			const nextElem = {
				name: parsedNextDataArr[0],
				action: parsedNextDataArr[1],
				time: parsedNextDataArr[2],
			};
			const timeGap = (getTime(queue[0].time) - getTime(nextElem.time)) / 1000;
			if (elem.action === "request") {
				if (Math.abs(timeGap) > 60) {
					if (totalTicket > 0 && (getTime(elem.time) - getTime("09:59:00")) / 1000 <= 0) {
						totalTicket--;
						ret.push(queue[0].name);
						queue.pop();
						queue.push(nextElem);
					}
				}
			}
			if (elem.action === "leave") {
				queue.pop();
			}
		} else {
			if (elem.action === "request") {
				if (totalTicket > 0 && (getTime(elem.time) - getTime("09:59:00")) / 1000 <= 0) {
					totalTicket--;
					ret.push(queue[0].name);
				}
			}
		}
	}

	ret.sort();
	return ret;
};

// const totalTicket = 1;
// const logs = [
// 	"woni request 09:12:29",
// 	"woni leave 09:13:28",
// 	"brown request 09:23:11",
// 	"brown leave 09:23:44",
// 	"jason request 09:33:51",
// 	"jun request 09:33:56",
// 	"cu request 09:34:02",
// 	"dom request 09:59:00",
// ];

const totalTicket = 2000;
const logs = [
	"woni request 09:12:29",
	"brown request 09:23:11",
	"brown leave 09:23:44",
	"jason request 09:33:51",
	"jun request 09:33:56",
	"cu request 09:34:02"
];

// const logs = [
// 	"woni request 09:12:29",
// 	"brown request 09:23:11",
// 	"jason request 09:23:14",
// 	"jun request 09:23:15",
// 	"brown leave 09:23:56",
// 	"cu request 09:34:02",
// 	"cu leave 09:34:45",
// ];

console.log(solution(totalTicket, logs));
