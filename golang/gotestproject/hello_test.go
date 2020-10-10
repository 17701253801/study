package main

import "net/http"
import "io/ioutil"
import "encoding/json"

func main() {
	person := Person{}
	http.HandleFunc("/person", func(w http.ResponseWriter, r *http.Request) {
		w.Write(json.Marshal(person))
	})
	http.ListenAndServe(":8099", nil)
}

type Person struct {
	Name   string
	Sex    string
	IdType string
}
