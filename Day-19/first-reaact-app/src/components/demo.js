import React from 'react'

class Demo extends React.Component{
    render(){
        return( <div>
            <h1>Demo Class Component with topic : {this.props.topic}</h1>
        </div>
        );
    }
}

export default Demo;