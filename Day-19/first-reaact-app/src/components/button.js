import React from 'react'

class btn extends React.Component{
constructor(){
    super()
    this.state ={
        value: 0
    }
    this.setState((state,props)=>{
        return
    }
    );
}

    render(){
        return( <div>
            <script>
                function remove(){
                   document.getElementById('bt1').removeChild(document.getElementById('bt1'))
                }
            </script>
           <button id='bt1' onClick="remove()"/>
        </div>
        );
    }
}

export default btn;