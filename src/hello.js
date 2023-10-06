import React from 'react';

const hello = () => <h1>Hello There!</h1>
function Hello() {
    let param = false; 
    return param ? <div>Hello</div> : <h1>Hello in h1</h1> 
}


export default hello