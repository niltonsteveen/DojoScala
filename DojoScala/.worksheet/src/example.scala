
object example {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(42); 
	val lista=List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(26); 
	val set=Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(39); 
	val mapa=Map(1->"Nilton", 2->"Velez");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(19); val res$0 = 
	lista.map{x=>x+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(16); val res$1 = 
	lista.map{_+3};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(22); val res$2 = 
	lista.filter{x=>x<3};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(44); 
	val names=List("nilton","steveen","velez");System.out.println("""names  : List[String] = """ + $show(names ));$skip(23); val res$3 = 
	names.map{_.length()};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(43); 
	
	
	//Kata 1
	val lista1=List.range(1,20);System.out.println("""lista1  : List[Int] = """ + $show(lista1 ));$skip(26); val res$4 = 
	lista1.filter{x=>x%2==0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(101); 
	
	//Kata  2
	val megaLista=List(List("nilton","steveen","velez"),List("jonathan","torres","velez"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(44); val res$5 = 
	//Kata 3
	megaLista.filter{_(0)=="nilton"};System.out.println("""res5: List[List[String]] = """ + $show(res$5));$skip(46); 
	
	//kata 4
	val listaPrimos=List.range(1,20);System.out.println("""listaPrimos  : List[Int] = """ + $show(listaPrimos ));$skip(91); val res$6 = 
	listaPrimos.filter{x=>listaPrimos.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1};System.out.println("""res6: List[Int] = """ + $show(res$6))}
	
	                                                                                          
}
