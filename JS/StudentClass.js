class Student {
    constructor(name, age) {
        this.name = name
        this.age = age
    }

    display() {
        console.log(this.name)
        console.log(this.age)
        document.write(this.name+ ' ' +this.age + '<br>')
    }
}
const s1 = new Student('Mira', 45)
const s2 = new Student('Jay', 43)
s1.display()
s2.display()
