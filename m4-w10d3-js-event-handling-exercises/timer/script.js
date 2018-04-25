/* 1. Clicking on each li, properly adds time to the timer */
/**
 * Increase the time on the timer by the number of seconds to increase by
 * @param {*} increaseBy the number of seconds to increase the time by
 */
function increaseTime(increaseBy) {
    // Find the countdown
    let countdown = document.getElementById("countdown");
    //let countdown = document.querySelector("#countdown");

    // Get its current time
    let currentTime = parseInt(countdown.dataset.time);
    
    // Add the time in seconds to the countdown
    countdown.dataset.time = currentTime + increaseBy;

    updateTime();
}

/**
 * Take the number of seconds remaining in remainingTime
 * and show it as hours:minutes:seconds.
 */

function updateTime() {
    // Split to hr, min, sec
    let countdown = document.getElementById("countdown");
    let currentTime = parseInt(countdown.dataset.time);
    
    let hour = 0;
    let min = 0;
    let sec = 0;

    hour = Math.floor(currentTime / 3600);
    currentTime = currentTime % 3600;

    min = Math.floor(currentTime / 60);
    currentTime = currentTime % 60;

    sec = currentTime;

    if (hour < 10) {
        hour = "0"+hour;
    }
    if (min < 10) {
        min = "0"+min;
    }
    if (sec < 10) {
        sec = "0"+sec;
    }

    countdown.innerText = `${hour}:${min}:${sec}`;

}

/* 2. Clicking start, begins the timer */
let timer = false;
let startButton = document.querySelector('.start');
function decreaseTime() {
    if (timer === true) {
    let countdown = document.getElementById("countdown");
    let currentTime = parseInt(countdown.dataset.time);
    countdown.dataset.time = currentTime - 1;
    updateTime();
    }
}
function start() {
    timer = !timer;
    if (timer === true) {
    setInterval(decreaseTime, 1000);
    startButton.innerText = "Pause";
    } else {
        startButton.innerText = "Start";  
    }
}