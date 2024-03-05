function doNTimes (func, repeat, x, y) {
    let result = x;
    for (i = 0; i< repeat; i++) {
        result = func(result, y);
    }
    return result;
}

console.log (
    doNTimes((x,y) => x * y , 3, 5,2),//40
    doNTimes((x,y) => x / y , 3, 5,2)
)

