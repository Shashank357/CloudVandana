function Reverse(string){

    return string.split('').reverse().join('').split(" ").reverse().join(" ");
}

console.log(Reverse("This is a Sunny Day"));