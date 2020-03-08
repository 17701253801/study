package main
 
import "fmt"
type Person struct{ 
	Name string `json:"name"`
	Sex string `json:"sex"`
}
func main() {
	fmt.Println("Hello world")
}