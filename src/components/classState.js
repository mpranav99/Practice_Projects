import React,{Component} from 'react';

class Counter extends Component{

    constructor(){
        super()
        
        this.state={
            count: 0
        }
    }

    componentDidMount(){
        document.title = `Clicked ${this.state.count} times`
    }
    componentDidUpdate() {
        document.title = `Clicked ${this.state.count} times`
    }

    incrementCount= () => {
        this.setState({
            count: this.state.count + 1
        },()=> console.log(this.state.count))
    }

    render(){
        return(
            <div>
                <button onClick={this.incrementCount}> Clicked: {this.state.count}</button>
                
            </div>
        )
    }

}

export default Counter