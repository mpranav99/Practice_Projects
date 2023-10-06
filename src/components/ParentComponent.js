import React, { Component } from 'react'; 
import Child from './classComponent';

class Parent extends Component{
    constructor(props){
        super(props)
        
        this.state= {
            parent : 'Parent'
        }

        this.greetParent = this.greetParent.bind(this)
    }

    greetParent(){
        
        alert(`Hello from ${this.state.parent}`)
    }

    render(){
        return(
            <div>
                <Child greetHandler={this.greetParent} />

            </div>
        )
    }
}

export default Parent