function solution(log) {
    let totalMin = 0

    log.forEach((item, index) => {
        if (index % 2 === 0) return
        const startH = getNumberArrLog(log[index - 1])[0]
        const startM = getNumberArrLog(log[index - 1])[1]

        const endH = getNumberArrLog(item)[0]
        const endM = getNumberArrLog(item)[1]

        const durationH = endH - startH
        const durationM = endM - startM
        let duration = (durationH * 60) + durationM
        if (duration <=5) duration = 0
        if (duration > 105) duration = 105
        totalMin += duration
    })

    return formatHHMM(totalMin)
}

function getNumberArrLog(logTime) {
    const splits = logTime.split(":")
    return [Number(splits[0]), Number(splits[1])]
}

function formatHHMM(min) {
    const HH = formatTT(Math.floor(min / 60))
    const MM = formatTT(min % 60)
    return `${HH}:${MM}` 
}

function formatTT(time) {
    try {
        return time < 10 ? `0${time}` : `${time}`
    } catch(e) {
        return null
    }
}

console.log(solution(["08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"]));