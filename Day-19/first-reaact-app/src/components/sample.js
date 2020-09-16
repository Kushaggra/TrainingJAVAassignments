import React from 'react'

class Sample extends React.Component{
   
    constructor(){
        super()
        this.state = {
            message: "React Js is Lovely!",
            content: "Another State variable"
        }
    }
   
    render(){
        return(
            <div>
                <h2>{this.state.message}</h2><br/>
                <h3>{this.state.content}</h3>
            </div>
        );
    }
}

export default Sample;