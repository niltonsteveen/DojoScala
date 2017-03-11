
object example {
	val lista=List(1,2,3,4)                   //> lista  : List[Int] = List(1, 2, 3, 4)
	val set=Set(1,2,3,4,5,1)                  //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	val mapa=Map(1->"Nilton", 2->"Velez")     //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Nilton, 2 -> V
                                                  //| elez)
	lista.map{x=>x+3}                         //> res0: List[Int] = List(4, 5, 6, 7)
	lista.map{_+3}                            //> res1: List[Int] = List(4, 5, 6, 7)
	lista.filter{x=>x<3}                      //> res2: List[Int] = List(1, 2)
	val names=List("nilton","steveen","velez")//> names  : List[String] = List(nilton, steveen, velez)
	names.map{_.length()}                     //> res3: List[Int] = List(6, 7, 5)
	
	
	//Kata 1
	val lista1=List.range(1,20)               //> lista1  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                                                  //| , 16, 17, 18, 19)
	lista1.filter{x=>x%2==0}                  //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
	
	//Kata  2
	val megaLista=List(List("nilton","steveen","velez"),List("jonathan","torres","velez"))
                                                  //> megaLista  : List[List[String]] = List(List(nilton, steveen, velez), List(jo
                                                  //| nathan, torres, velez))
	//Kata 3
	megaLista.filter{_(0)=="nilton"}          //> res5: List[List[String]] = List(List(nilton, steveen, velez))
	
	//kata 4
	val listaPrimos=List.range(1,20)          //> listaPrimos  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1
                                                  //| 4, 15, 16, 17, 18, 19)
	listaPrimos.filter{x=>listaPrimos.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1}
                                                  //> res6: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
	
	                                                                                          
}