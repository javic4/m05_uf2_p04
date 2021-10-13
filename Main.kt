package cat.copernic.jmendezv

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Implementació i tests de tota mena
 */

data class Point(val x: Double, val y: Double)

/*
* Índice de masa corporal
*
* imc = weight / height^2
* */
fun imc(weight: Double, height: Double): Double {
    val imco = (weight / height).pow(2)
}

/*
* https://en.wikipedia.org/wiki/Quadratic_equation
*
* (-b ± sqrt(b^2 - 4ac)) / 2a
* */
fun secondDegreeEquation(a: Double, b: Double, c: Double): Pair<Double, Double> {
    var resu = (b + sqrt(b.pow(2) - 4*a*c )) / 2*a
}

/*
* Cálculo de la distancia entre dos puntos
*
* distance = √[(x2 – x1)^2 +(y2 – y1)^2]
* */
fun distance(p1: Point, p2: Point){
    var recta = Math.sqrt(p2.x-p1.x).pow(2) + (p2.y-p1.y).pow(2)
}

/*
* Cáculo de la pendiente de una recta
*
* slope = (y2 – y1) / (x2 – x1)
* */
fun slope(p1: Point, p2: Point): Double {
    var pendiente = Point(4.0,5.0) / Point(6.0,3.0)
}

/*
* Cálculo del punto medio de una recta
*
* midpoint = ((x1+x2)/2, (y1+y2)/2)
* */
fun midPoint(p1: Point, p2: Point): Point = Point((4.0+7.0)/2) , Point((4.0+7.0) /2))


fun displayScore(score: Double) {
    val roundedScore = floor(score * 100) / 100
    when (roundedScore) {
        in 0.0..4.99 -> println("No supera")
        in 5.0..5.99 -> println("Supera")
        in 6.0..6.99 -> println("Bien")
        in 7.0..8.99 -> println("Notable")
        in 9.0..10.0 -> println("Excel·lent")
        else -> println("Nota invalida")
    }
}

/*
* Encuentra el menor y mayor
*
* [2,3,1,4,7,6,5] = (1,7)
* [] = IllegalArgumentException
* */
fun findMinAndMax(list: List<Int>) {
    var mayor = list.filter { it > list.get() }
    var menor = list.filter { it < list.get() }
    Pair(mayor,menor)
    println(Pair(mayor,menor))
}


/*
*
* Cálculo del punto más cercano a point. points es una lista de tipo Point
*
* */
fun closest(point: Point, vararg points: Point): Point {
    for (item in points){
        val distancia = distance(point, points.get(1))
        val distancia2 = distance(point,points.get(2))
        var resultado : Double
        resultado = item.x - item.y
        println("El punto más cercano es $resultado")
    }
}
