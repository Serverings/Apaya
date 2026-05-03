const noBtn = document.getElementById("btn-no");

function moveNoBtn() {
    fetch("/api/no", { method: "POST" });

    const x = Math.random() * 200 - 100;
    const y = Math.random() * 200 - 100;

    noBtn.style.transform = `translate(${x}px, ${y}px)`;
}

const askScreen = document.getElementById("screen-ask");
const yesScreen = document.getElementById("screen-yes");

function handleYes() {
    fetch("/api/yes", { method: "POST" });

    // fade out screen awal
    askScreen.classList.add("hide");

    setTimeout(() => {
        askScreen.style.display = "none";

        // tampilkan screen yes
        yesScreen.style.display = "flex";
        setTimeout(() => {
            yesScreen.classList.add("show");
        }, 50);

        startHearts(); // mulai efek love
    }, 600);
}

function startHearts() {
    const container = document.getElementById("hearts-container");

    for (let i = 0; i < 30; i++) {
        createHeart(container);
    }

    // terus spawn hearts
    setInterval(() => {
        createHeart(container);
    }, 300);
}

function createHeart(container) {
    const heart = document.createElement("div");
    heart.classList.add("heart");
    heart.innerHTML = "💖";

    heart.style.left = Math.random() * 100 + "vw";
    heart.style.animationDuration = (2 + Math.random() * 3) + "s";
    heart.style.fontSize = (15 + Math.random() * 20) + "px";

    container.appendChild(heart);

    setTimeout(() => {
        heart.remove();
    }, 5000);
}