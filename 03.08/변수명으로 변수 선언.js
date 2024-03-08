a = 10;

function example() {
    b = 20;
    c = 30;
    console.log(a);
    console.log(b);
    console.log(c);
}

console.log(a);
//example함수가 실행되지 않아서 아래 2개는 생성되어 있지 않다.
//console.log(b); //console.log(c); // 호출후 실행되었다면 접근 가능함
example()
console.log(window.a);
console.log(window.b);
console.log(window.c);