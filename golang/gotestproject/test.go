package main

import (
	"context"
	"fmt"
)

type Person struct {
	Name string `json:"name"`
	Sex  string `json:"sex"`
}

func main() {
	context.WithCancel()
}
