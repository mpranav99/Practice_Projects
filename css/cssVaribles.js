console.log(window.getComputedStyle(document.documentElement)
.getPropertyValue('--padding'))

document.getElementById('dark-theme-btn').addEventListener(
    'click', ()=> {
        document.documentElement.style.setProperty(
            '--background-color', 'black'
        )
    }
)

document.getElementById('light-theme-btn').addEventListener(
    'click', ()=>{
        document.documentElement.style.setProperty(
            '--background-color','white'
        )
    }
)