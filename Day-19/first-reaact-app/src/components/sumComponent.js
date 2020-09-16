import React from 'react'

class sampleComponent extends React.Component{
    
    render(){
        return( <div>

            <h1>Sum of {this.props.num1} and {this.props.num2} is : {parseInt(this.props.num1)+parseInt(this.props.num2)}</h1>
        </div>
        );
    }
}

export default sampleComponent;