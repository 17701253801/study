function greeter(user, interfacePerson) {
    return "Hello, " + user + " lastName:" + interfacePerson.firstName + " firstName: " + interfacePerson.firstName;
}
let user = "Jane User";
let person = { firstName: "sun", lastName: "tong" };
document.body.innerHTML = greeter(user, person);
