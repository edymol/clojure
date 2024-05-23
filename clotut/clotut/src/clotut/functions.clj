(ns clotut.functions
  (:gen-class)
  (:import (javax.xml.datatype DatatypeConstants)))
(defn -main
  "First function"
  []
  (println "My name is Edy")
  (println "and I am learning Clojure")
  (+ 2, 4))

(#(println "Hello " %1 "How are you" %2) "Edy" "today")

(defn increment [x]
  (+ x 1))

(defn increment_set
  [x]
  (map increment x))
(defn Datatypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "true")
  (def h 'keywords)

  (def status true)
  (def STATUS false)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  (println status)
  (println STATUS)
  )
(Datatypes)