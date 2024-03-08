// startDate 기준 두 시간의 차를 구하는 함수이다.

let calculateTimeDifference = (startDate, endDate) => {
    let startYear = startDate.getFullYear();
    let startMonth = startDate.getMonth() + 1; // 월은 0부터 시작하므로 1을 더한다

    let startDay = startDate.getDate();
    let startHours = startDate.getHours();
    let startMinutes = startDate.getMinutes();
    let startSeconds = startDate.getSeconds();
    let endYear = endDate.getFullYear();
    let endMonth = endDate.getMonth() + 1;// 월은 0부터 시작하므로 1을 더함
    let endDay = endDate.getDate();
    let endHours = endDate.getHours();
    let endMinutes = endDate.getMinutes();
    let endSeconds = endDate.getSeconds();
// 초 차이 계산
    let secondsDifference = endSeconds - startSeconds;
    if (secondsDifference < 0) {
        secondsDifference += 60;
        endMinutes--;
    }
// 분 차이 계산
    let minutesDifference = endMinutes - startMinutes;
    if (minutesDifference < 0) {
        minutesDifference += 60;
        endHours--;
    }
// 시간 차이 계산
    let hoursDifference = endHours - startHours;
    if (hoursDifference < 0) {
        hoursDifference += 24;
        endDay--;
    }
// 일 차이 계산
    let dayDifference = endDay - startDay;
    if (dayDifference < 0) {
        let tempStartDate = new Date(startDate);
        tempStartDate.setMonth(tempStartDate.getMonth() + 1);
        dayDifference = (endDate - tempStartDate) / (1000 * 60 * 60 * 24);
    }
// 월 차이 계산
    let monthDifference = endMonth - startMonth;
    if (monthDifference < 0) {
        monthDifference += 12;
        endYear--;
    }
// 연도 차이 계산
    let yearDifference = endYear - startYear;
    
// 결과를 객체로 반환
    let timeDifferenceObj = {
        years: yearDifference,
        months: monthDifference,
        days: dayDifference,
        hours: hoursDifference,
        minutes: minutesDifference,
        seconds: secondsDifference
    };
    return timeDifferenceObj;
}
// 테스트를 위한 예제
let startDate1 = new Date(2024, 3, 6, 5, 20, 15); // 시작 날짜
let endDate1 = new Date(2023, 5, 7, 6, 25, 20); // 종료 날짜
let timeDifference1 = calculateTimeDifference(startDate1, endDate1);
let startDate2 = new Date(2020, 5, 6, 5, 20, 15); // 시작 날짜
let endDate2 = new Date(2021, 6, 7, 6, 25, 20); // 종료 날짜
let timeDifference2 = calculateTimeDifference(startDate2, endDate2);
// 결과 출력
console.log("예제 1 결과:");
console.log("년:", timeDifference1.years);
console.log("월:", timeDifference1.months);
console.log("일:", timeDifference1.days);
console.log("시간:", timeDifference1.hours);
console.log("분:", timeDifference1.minutes);
console.log("초:", timeDifference1.seconds);
console.log("예제 2 결과:");
console.log("년:", timeDifference2.years);
console.log("월:", timeDifference2.months);
console.log("일:", timeDifference2.days);
console.log("시간:", timeDifference2.hours);
console.log("분:", timeDifference2.minutes);
console.log("초:", timeDifference2.seconds);