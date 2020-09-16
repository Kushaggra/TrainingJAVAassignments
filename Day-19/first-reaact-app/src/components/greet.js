import React from 'react'

// function Greet(){
//     return <h3>Greetings to All!</h3>
// }

//ARROW function------------
const Greet = (props)=> {return <h3>Greet Arrow "{props.name}" from "{props.location}" where child is "{props.children}"</h3>   }
export default Greet;