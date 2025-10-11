// let ele = document.querySelector(".ele");
// let body = document.querySelector("body");
// let body = ele.parentElement;
// body.style.backgroundColor = "red";
// ele.nodeValue;
// console.log(ele.textContent);

// let inp = ele.previousSibling.previousSibling;
// console.log(inp.nodeValue);

// console.log(ele.parentElement);

// let eleChilds = ele.childNodes;
// console.log(eleChilds);

// eleChilds.forEach((e, ind, arr) => {
// 	if( e.nodeName !== "#text")
//   e.style.color = "red";
// });
// console.log(eleChilds);

// ele.childNodes[1].firstChild.nodeValue = "Asdasd";
// console.log(
// 	this.setTimeout(() => {
// 		this.alert("trdfdfd");
// 	}, 5000)
// );

// let f = confirm("are u sad??");
// console.log(f);

// console.log(ele.parentNode.style.backgroundColor="red");
// console.log(ele.nextSibling);
// console.log(innerHeight, innerWidth);
// console.log(outerHeight, outerWidth);

// console.log(window.location.href); // Current URL
// console.log(window.location.hostname); // Domain name
// console.log(window.location.pathname); // Path after domain

// setTimeout(() => {
// window.location.reload();
// }, 1000);

// console.log("Browser Name:", window.navigator.appName);
// console.log("Browser Version:", window.navigator.appVersion);
// console.log("Platform:", window.navigator.platform);
// console.log("User Agent:", window.navigator.userAgent);

// console.log((window.document.title = "sad")); // Page title
// console.log((window.document.URL)); // Full page URL
// console.log(window.document.body.childNodes); // Body element

// console.log("Screen Width:", window.screen.width);
// console.log("Screen Height:", window.screen.height);
// console.log("Available Width:", window.screen.availWidth);
// console.log("Available Height:", window.screen.availHeight);

// console.log(window.history.back()); // Number of pages in session history

// Navigate back or forward
// window.history.back();
// window.history.forward();
// console.log(history);

// console.log("Screen Width:", screen.width);
// console.log("Screen Height:", screen.height);
// console.log("Available Width:", screen.availWidth);
// console.log("Available Height:", screen.availHeight);
// console.log("Color Depth:", screen.colorDepth);
// console.log("Pixel Depth:", screen.pixelDepth);

// ajax
// asyncronous js

// console.log(1);
// console.log(2);
// setTimeout(() => {
// 	console.log(5);
// }, 0);

// console.log(3);
// console.log(4);
// console.log(8);

// https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json

// "qwrtyu".toLowerCase().indexOf(1);

let p = fetch(
	"https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json"
).then(
	(f) => {
		console.log(1);
	},
	(r) => {
		console.log(2);
	}
);
// then handler
// async await
// console.log(p);

// 2xx
// 205
