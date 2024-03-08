const sliderImg = document.getElementById('mySlider').getAttribute('data-imgList');
const sliderImgArray = sliderImg.split(',');
console.log(sliderImgArray);
let i = 0;
const check =()=>{
    if (i < 0) {
        i = sliderImgArray.length - 1;
        document.getElementById('holder').setAttribute('src', sliderImgArray[i])
    }else if (i > sliderImgArray.length - 1) {
        i = 0;
        document.getElementById('holder').setAttribute('src', sliderImgArray[i])
    } else {
        document.getElementById('holder').setAttribute('src', sliderImgArray[i])
    }
}
const back = () => {
    i--;
    check();
}
const next = () => {
    i++;
    check();
}
setInterval(()=>{
    i++
    check();
},1500)