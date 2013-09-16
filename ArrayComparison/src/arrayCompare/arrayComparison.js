var arrayOne = [1, 3, 5, 8];
var arrayTwo = [1, 4, 5, 6];


var removeDuplicates = function(arrOne, arrTwo) {
    var arrayHolder = [];

    for (var i = 0; i < arrOne.length; i++) {
        for (var j = 0; j < arrTwo.length; j++) {
            if (arrOne[i] === arrTwo[j]) {
                arrOne.splice(i, 1);
                arrTwo.splice(j, 1);
            }
        }
    }
    arrayHolder.push(arrOne);
    arrayHolder.push(arrTwo);
    return arrayHolder;
};

var duplicatesRemoved = removeDuplicates(arrayOne, arrayTwo);
console.log(duplicatesRemoved);
