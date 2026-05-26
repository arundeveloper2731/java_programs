//1.Write a JavaScript program using a basic function and setInterval to print
// “Hello World” every 2 seconds.
let count = 0;

// interval start
let interval = setInterval(printMessage, 2000);

function printMessage() {
    count++;

    console.log("Hello World");

    // 5 times apram stop
    if (count === 5) {
        clearInterval(interval);
        console.log("Stopped");
    }
}
//
//2. Display Numbers from 1 to 10 Every 1 Second
let num = 1;

let interval = setInterval(showNumber, 1000);

function showNumber() {
    console.log(num);
    num++;

    if (num > 10) {
        clearInterval(interval);
        console.log("Completed");
    }
}
//3. Display Current Time Every Second
function showTime() {
    let time = new Date();
    console.log(time.toLocaleTimeString());
}

setInterval(showTime, 1000);
//4. Display Even Numbers Continuously Every 2 Seconds

let even = 2;

setInterval(showEven, 2000);

function showEven() {
    console.log(even);
    even += 2;
}
//5. Countdown Timer from 10 to 0
let count = 10;

let timer = setInterval(countDown, 1000);

function countDown() {
    console.log(count);
    count--;

    if (count < 0) {
        clearInterval(timer);
        console.log("Time Up!");
    }
}