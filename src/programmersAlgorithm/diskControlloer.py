test = [[0,3], [1,9], [2,6]]

def solution(jobs):
    answer = 0
    jobs = sorted(jobs, key=lambda x: (x[0], x[1]))
    previousEndTime = jobs[0][0] + jobs[0][1]
    answer += previousEndTime - jobs[0][0]
    size = len(jobs)
    jobs.pop(0)
    while len(jobs): 
        newList = []
        for i in range(0, len(jobs)):
            if jobs[i][0] <= previousEndTime:
                newList.append(jobs[i]) 
        newList = sorted(newList, key=lambda x: x[1])
        if not len(newList):
            previousEndTime = jobs[0][0] + jobs[0][1]
            answer += previousEndTime - jobs[0][0]
            jobs.pop(0)
        else:
            for i in range(0, len(jobs)):
                if newList[0][0] == jobs[i][0] and newList[0][1] == jobs[i][1]:
                    previousEndTime += newList[0][1]
                    answer += previousEndTime - newList[0][0]
                    jobs.pop(i)
                    break
    answer //= size
    return answer

a = solution(test)
print(a)