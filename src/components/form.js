import React, { useState } from 'react'

function Form(){
const [name, setName]= useState({firstName: '', lastName: ''})
    
    return(
        <div>
            <form>
                <label>First Name:</label>
                <input type='text' value={name.firstName} onChange={e=> setName({...name, firstName: e.target.value})}></input>  
                <label>Last Name:</label>
                <input type='text' value={name.lastName} onChange={e=> setName({...name,lastName: e.target.value})}></input> 

                <h1>Your first Name is : {name.firstName}</h1>
                <h1>Your last Name is : {name.lastName}</h1>
                <p>{JSON.stringify(name)}</p>
            </form>

        </div>

    )
}
export default Form