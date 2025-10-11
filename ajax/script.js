let p = fetch("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json")
	.then(
		(f) => {
			return "i am here!!!";
		},
		(r) => {}
	)
	.then(
		(f) => f + 45,
		(r) => console.log()
	)
	.then((f) => console.log(f));

// let p = fetch(
// 	"https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json"
// ).then(
//   (f) => {
//     console.log(f); /// did i got ans ?

// 		let g = f.json().then(
// 			(f1) => {
//         console.log(f1); // did i got ans ?
//         if (f1)
//         {

//         }
// 			},
// 			(r1) => {
// 				console.log(r1);
// 			}
// 		);
// 		console.log(g);
// 	},
// 	(r) => {
// 		console.log(2);
// 		window.location.reload();
// 	}
// );
// // "{age:45}"

// pr = {
// 	age: 45,
// };
// d = JSON.stringify(pr);
// r = JSON.parse(d);
// console.log(r);

// console.log(4);
