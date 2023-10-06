import React from 'react'

function Child (props){
    return(
        <div>
            <button onClick={ props.greetHandler}>greet Parent</button>
        </div>
    )
}

export default Child 