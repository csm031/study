const input_1000 = document.getElementById('input_1000');
const input_500 = document.getElementById('input_500');
const input_100 = document.getElementById('input_100');
const returnButton = document.getElementById('returnButton');
const return_500 = document.getElementById('return_500');
const return_100 = document.getElementById('return_100');
const saidaButton = document.getElementById('saidaButton');
const fantaButton = document.getElementById('fantaButton');
const cokeButton = document.getElementById('cokeButton');
const purchaseList = document.getElementById('purchaseList')
const coffeeButton1 = document.getElementById('coffeeButton1') // 레쓰비
const coffeeButton2 = document.getElementById('coffeeButton2') // top
const coffeeButton3 = document.getElementById('coffeeButton3') // 조지아
document.getElementById('inputText').value = `0원`;
let inputText = 0;
const updateInputText = () => {
    document.getElementById('inputText').value = `${inputText}원`;
}
try {
    // 구매 부분
    cokeButton.addEventListener("click", () => {
        if (inputText >= cokeButton.value) {
            inputText -= cokeButton.value;
            console.log(`콜라 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/콜라.jpg" width="200px" height="200px" alt="콜라">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    saidaButton.addEventListener("click", () => {
        if (inputText >= saidaButton.value) {
            inputText -= saidaButton.value;
            console.log(`사이다 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/사이다.jpg" width="200px" height="200px" alt="사이다">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    fantaButton.addEventListener("click", () => {
        if (inputText >= fantaButton.value) {
            inputText -= fantaButton.value;
            console.log(`환타 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/환타.jpg" width="200px" height="200px" alt="환타">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    coffeeButton1.addEventListener("click", () => {
        if (inputText >= coffeeButton1.value) {
            inputText -= coffeeButton1.value;
            console.log(`레쓰비 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/커피.jpg" width="200px" height="200px" alt="커피">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    coffeeButton2.addEventListener("click", () => {
        if (inputText >= coffeeButton2.value) {
            inputText -= coffeeButton2.value;
            console.log(`TOP 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/top커피.jpg" width="200px" height="200px" alt="top">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    coffeeButton3.addEventListener("click", () => {
        if (inputText >= coffeeButton3.value) {
            inputText -= coffeeButton3.value;
            console.log(`조지아 구매완료`);
            console.log(`남은 금액 ${inputText}`);
            purchaseList.innerHTML += `<img src="../자판기/img/조지아커피.jpg" width="200px" height="200px" alt="조지아">`
            updateInputText();
        } else {
            alert(`금액이 부족합니다.`);
        }
    })
    // 돈 넣는 부분
    input_1000.addEventListener("click", () => {
        inputText += 1000;
        console.log(`총 넣은 금액: ${inputText}`);
        updateInputText();
    })
    input_500.addEventListener("click", () => {
        inputText += 500;
        console.log(`총 넣은 금액: ${inputText}`);
        updateInputText();
    })
    input_100.addEventListener("click", () => {
        inputText += 100;
        console.log(`총 넣은 금액: ${inputText}`);
        updateInputText();
    })
    // 잔돈 반환 부분
    returnButton.addEventListener("click", () => {
        return_500.value = Math.floor(inputText / 500);
        inputText %= 500;
        return_100.value = inputText / 100;
        inputText %= 100;
        updateInputText();
        purchaseList.innerHTML = ``;
    })
} catch (err) {
    alert(`에러 발생!`);
}