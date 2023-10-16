function DescSort(array){
    return array.sort(function(a,b){
        return b -a ;
    });
}
const sortedArray = DescSort([1,2,33,4,5,6]);
console.log(sortedArray);