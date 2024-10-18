package main
import "fmt"
type car struct {
	brand string 
	model string
	price int
}
func main() {
	a := 34
	b := "Satish Kumar"
	car1 := car{"Maruthi","Swift",1300000}
	fmt.Println(car1.brand) 
	fmt.Println(a,b)
	fmt.Print(hello())
}

func hello() (a,b int) {
	a = 10
	b = 23
	return 
}
