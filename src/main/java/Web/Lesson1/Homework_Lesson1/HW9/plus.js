function addBlock() {

    let clBlock = document.createElement('div');
    clBlock.classList.add('colorB');
    clBlock.style.backgroundColor = randomColors();
    clBlock.onclick = function () {
        clBlock.remove(clBlock);
    };
document.getElementById('block').appendChild(clBlock);
}

function randomColors() {
    return "#" + Math.floor(Math.random() * 16777215).toString(16);
}