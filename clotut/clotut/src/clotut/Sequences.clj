(ns clotut.Sequences)

(defn Seq
  "Cons appends an element at the beginning of the sequence"
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  ;; "cons appends an element to the beginning of the list"
  (println (cons "yellow" colors))
  (println (cons "yellow" colors))

  ;; "conj appends elements that make sense in context"
  (println (conj colors "yellow"))
  (println (conj ["red" "green" "blue"] "yellow"))

  ;; "concat concatenates two sequences into a new sequence"
  (println (concat colors ["black" "white"]))

  ;; "distinct gives back unique values"
  (println (distinct [1 2 1 7 3 4 3 5 5]))

  ;"reverse reverses the sequence"
  (println (reverse colors))

  ;"first gives the first element, rest gives elements after the first "
  (println (first colors))
  (println (rest colors))
  (println (last colors))
  (println (sort [1 1 2 3 4 3 5 7 5]))

  )
(Seq)
