var obj = {
    showContext: function showContext(){
        this.log("ValorTeste")

        // setTimeout(function(){
        //     this.log(`After: 1000ms`)             // Em Função, como fica o THIS
        // }.bind(this),1000)
   
        // OU

        setTimeout(()=>{
            this.log(`After: 1000ms`)                // Em Arrow Function, como fica o THIS
        },1000)
    },
    log: function log(value){
        console.log(value)
    }
}

obj.showContext()