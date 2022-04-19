class Observable {
    constructor(){
        this.observables = []
    }

    subscribe(fn) {
        this.observables.push(fn)
    }

    notify(data) {
        this.observables.forEach(fn => fn(data))
    }

    unsubscribe(fn) {
        this.observables = this.observables.filter(obs => obs != fn )
    }
}

const p = new Observable()

const logData1 = data => console.log(`Subscribe  1: ${data}`)
const logData2 = data => console.log(`Subscribe  2: ${data}`)
const logData3 = data => console.log(`Subscribe  3: ${data}`)

p.subscribe(logData1)
p.subscribe(logData2)
p.subscribe(logData3)

p.notify(`Notified 1`)

p.unsubscribe(logData2)

p.notify(`Notified 2`)