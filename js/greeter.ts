function greeter(user:string, interfacePerson:Person) {
    return "Hello, " + user+" lastName:" + interfacePerson.firstName+" firstName: "+interfacePerson.firstName;
}
interface Person{
	firstName: string;
	lastName: string;
}
let user = "Jane User";
let person = {firstName:"sun",lastName:"tong"};

document.body.innerHTML = greeter(user,person);
