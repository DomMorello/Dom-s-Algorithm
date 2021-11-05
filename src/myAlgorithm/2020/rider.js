const solution = (restaurant, riders, k) => {
  let ret = 0;

  for (let i = 0; i < riders.length; i++) {
    if ((restaurant[0] - riders[i][0]) * (restaurant[0] - riders[i][0]) + (restaurant[1] - riders[i][1]) * (restaurant[1] - riders[i][1]) - k*k <= 0) {
      ret++;
    }
  }
  return ret;
};

const restaurant = [0,0];
const riders = [[-700,0], [150,180], [500,500], [150, -800], [800, 800], [-900, 500], [-1100, 900]];
const k = 1000;

// 4

console.log(solution(restaurant, riders, k));
