(ns clotut.Destructuring)

(defn Destruct
  "Destructuring data from a vector"
  []
  (def myVect [1 2 3 4])
  (let [[a b c] myVect] (println a b c))
  (let [[a b & rest] myVect]
    (println "First two elements:" a b)
    (println "Remaining elements:" rest)
    )
  (def myMap {'name "John" 'lastName "Smith"})
  (let [{a 'name b 'lastName} myMap]
    (println "Your name is:" a)
    (println "Your las lame is:" b)
    )
  )

(Destruct)
