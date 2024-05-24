(ns clotut.Loops)

(defn Loop
  "For loop"
  []
  (println "\nLops")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))))
  )
(Loop)

(defn do-times
  "While loop"
  []
  (println "\nDoTimes")
  (dotimes [x 10]
    (println x))
  )
(do-times)

(defn while-do
  "Do while loop"
  [count]
  (println "\nDoWhile")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)))
  )
(while-do 10)

(defn do-sequence
  "Do something in sequence"
  [seq]
  (println "\nDoSequence:")
  (doseq [x seq]
    (println (inc x)))
  )
(do-sequence [2 4 6 8 10])