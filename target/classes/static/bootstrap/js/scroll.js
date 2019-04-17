window.onscroll = function () {
    scrollTopFunction();
};
function scrollTopFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("menu-nav").style.top = "0";
    } else {
        document.getElementById("menu-nav").style.top = "-90px";
    }
}
