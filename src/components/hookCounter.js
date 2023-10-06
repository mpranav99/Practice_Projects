import React, { useEffect, useState } from 'react';

function Count(){
    const [count , setCount] = useState(0)

    
    useEffect(() => {
        document.title = `Clicked ${count} times`
    })

    // const incrementByFive = () => {
    //     for(let i =0; i< 5; i++){
    //         setCount( count + 1)
    //     }
    // }
    return(
        <div>
            <button onClick={()=> setCount(count + 1)}> Clicked:{count}</button>

        </div>
    )

}

export default Count