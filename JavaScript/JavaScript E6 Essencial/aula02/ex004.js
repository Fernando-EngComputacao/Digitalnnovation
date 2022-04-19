function hoistingFuncao(){
    log(`Hosting de função`)

    function log(value) {
        console.log(value);
    }
}

hoistingFuncao()