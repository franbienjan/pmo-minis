function getTextBoxValue() {
    var text = prompt("Enter the letters in order it appeared in this code.");//document.getElementById("myTextArea").innerHTML;
    console.log(text);
    var ans;
    ans = "QPFJGBKCN";

    if (ans == text ) {
        alert("Congratulations! The code is finally working. Samsan Tech is proud of you. Screenshot this message and send to your Team GC!");
    } else {
        alert("Incorrect! Please try again.");
    }
}