let temp = true;
window.onload = function () {
    let tableFormat = `<table>`;
    for (let i = 0; i < 11; i++) {
        tableFormat += `<tr>`;
        for (let j = 0; j < 50; j++) {
            tableFormat += `<td id = td${i}_${j}></td>`;
        }
        tableFormat += `</tr>`
    }
    tableFormat += `</table>`
    document.getElementById('tableArea').innerHTML = tableFormat;

}

function textSet(text) {
    if (temp) {
        document.getElementById('textArea').innerHTML = `${text} 실행중입니다.`;
    } else {
        document.getElementById('textArea').innerHTML = ``;
    }
    if (text === '분홍색채우기') {
        document.getElementById('textArea').setAttribute('style', `color: hotpink;`)
    } else {
        document.getElementById('textArea').setAttribute('style', `color:red`)
    }
    if (document.getElementById('textArea').innerHTML === `분홍색채우기 실행중입니다.`) {
        document.getElementById('redButton').setAttribute('style', `display:none`);
    } else if (document.getElementById('textArea').innerHTML === `빨간색채우기 실행중입니다.`) {
        document.getElementById('pinkButton').setAttribute('style', `display:none`);
    } else {
        document.getElementById('pinkButton').style.display = '';
        document.getElementById('redButton').style.display = '';
    }
}

function redHandle() {
    this.setAttribute('class', 'red');
}

function pinkHandle() {
    this.setAttribute('class', 'pink');
}

let redEventStyle = () => {
    if (temp) {
        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 50; j++) {
                document.getElementById(`td${i}_${j}`).addEventListener("click", redHandle);
            }
        }
    } else {
        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 50; j++) {
                document.getElementById(`td${i}_${j}`).removeEventListener('click', redHandle);
                ;
            }
        }
    }
    temp = !temp;
}
let pinkEventStyle = () => {
    if (temp) {
        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 50; j++) {
                document.getElementById(`td${i}_${j}`).addEventListener("click", pinkHandle);
            }
        }
    } else {
        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 50; j++) {
                document.getElementById(`td${i}_${j}`).removeEventListener('click', pinkHandle);
                ;
            }
        }
    }
    temp = !temp;
}
let styleInsertRed = () => {
    textSet(`빨간색채우기`);
    redEventStyle();
}
let styleInsertPink = () => {
    textSet(`분홍색채우기`);
    pinkEventStyle();
}

let start = () => {
    setInterval(() => {
        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 49; j++) {
                if (document.getElementById(`td${i}_${j + 1}`).getAttribute('class') === 'red' || document.getElementById(`td${i}_${j + 1}`).getAttribute('class') === 'pink') {
                    document.getElementById(`td${i}_${j}`).setAttribute('class', document.getElementById(`td${i}_${j + 1}`).getAttribute('class'));
                    document.getElementById(`td${i}_${j + 1}`).setAttribute('class',"");
                }
            }
        }
    }, 200)
}