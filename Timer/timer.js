var time = 0;
var timeout=50;
var timer;
var running = false;

function runTimer(){
    if(this.running == true){
        alert("timer already running")
    }
    else{
        this.running = true;
        timer = setInterval(data => {
            document.getElementById('time').innerHTML= this.time++;
            console.log(document.getElementById('bar').style = `width : ${this.time}px`);
            if(this.time >= 300){
                this.stopTimer();
                alert("Timeout");
            }


        } , this.timeout);
    }
}

function stopTimer(){
    console.log(this.timer);
    clearInterval(timer);
    this.running = false;
}

function resetTimer(){
    this.time = 0;
    document.getElementById('time').innerHTML = "";
    document.getElementById('bar').style = "width : 0px";
}