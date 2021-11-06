function formatTimeToInt(timeStr) {
  const timeZone = timeStr.substring(timeStr.length - 2);
  const addedHour = timeZone.toUpperCase() === 'AM' ? 0 : 12;

  const splits = timeStr.substring(0, timeStr.length - 2).split(":");
  const hour = Number(splits[0]) + addedHour;
  const min = splits[1] ? Number(splits[1]) / 60 : 0;

  return hour + min;
}

function solution(time, plans) {
  const fridayEndTime = formatTimeToInt('6PM');
  const mondayStartTime = formatTimeToInt('1PM');
  let destination = '';

  plans.some(plan => {
    const fridayDepartTime = formatTimeToInt(plan[1]);
    const mondayArrivalTime = formatTimeToInt(plan[2]);

    const fridayOffset = fridayEndTime - fridayDepartTime;
    const mondayOffset = mondayArrivalTime - mondayStartTime;
    
    const totalOffsetTime = (fridayOffset > 0 ? fridayOffset : 0) + (mondayOffset > 0 ? mondayOffset : 0);
  
    if (totalOffsetTime <= time) {
        destination = plan[0];
        return true;
    } else return false;
  })

  return destination;
}