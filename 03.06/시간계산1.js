

let myDate = new Date(); // 현재 시간

console.log(myDate);

console.log(myDate.getFullYear()); // 년도 가져오기
console.log(myDate.getMonth()+1); // 월 가져오기 (1월이 0으로 표현되서 1을 더해야함)
console.log(myDate.getDate()); // 일 가져오기
console.log(myDate.getHours()); // 시 가져오기
console.log(myDate.getMinutes()); // 분 가져오기
console.log(myDate.getSeconds()); // 초 가져오기
console.log(myDate.getDay()); // 요일 가져오기 0=일, 1=월, 6=토 <= 이런식임